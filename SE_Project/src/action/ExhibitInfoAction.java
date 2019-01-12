package action;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

import dao.ExhibitDao;
import dao.MessageDao;
import dao.NewsDao;
import entity.ExhibitInfo;
import entity.MessageInfo;
import entity.UserInfo;

public class ExhibitInfoAction extends ActionSupport{
	private ExhibitDao ed=new ExhibitDao();
	private MessageDao md=new MessageDao();
	private int eid;
	private String econtent;
	private String etitle;
	private File eimage;
	private String eimageFileName;
	
	
	public File getEimage() {
		return eimage;
	}

	public void setEimage(File eimage) {
		this.eimage = eimage;
	}

	public String getEimageFileName() {
		return eimageFileName;
	}

	public void setEimageFileName(String eimageFileName) {
		this.eimageFileName = eimageFileName;
	}

	public String getEtitle() {
		return etitle;
	}

	public void setEtitle(String etitle) {
		this.etitle = etitle;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEcontent() {
		return econtent;
	}

	public void setEcontent(String econtent) {
		this.econtent = econtent;
	}

	public String show() throws SQLException{
		
		ArrayList<ExhibitInfo> exhibitList=new ArrayList<ExhibitInfo>();
		exhibitList=(ArrayList<ExhibitInfo>) ed.findAllExhibit();
		
		ServletActionContext.getRequest().getSession().setAttribute("exhibitList", exhibitList);
		
		return "show";
	}
	
	public String showDetail() throws SQLException{
		
		ExhibitInfo exhibit=new ExhibitInfo();
		exhibit=ed.findExhibitById(eid);
		
		
		List<MessageInfo> exhibitMessageList=md.findMessages(eid, 1);
		
		ServletActionContext.getRequest().getSession().setAttribute("exhibit", exhibit);
		ServletActionContext.getRequest().getSession().setAttribute("exhibitMessageList", exhibitMessageList);
		ServletActionContext.getRequest().getSession().setAttribute("mobjtype", 1);
		return "showDetail";
	}
	
	public String add() throws SQLException{
		UserInfo user=(UserInfo) ServletActionContext.getRequest().getSession().getAttribute("user");
		
		String realPath = ServletActionContext.getServletContext().getRealPath("/demo/exhibit");
		File file = new File(realPath);
		//获取文件末尾 eg：.jpg
		System.out.println(eid);
		System.out.println(etitle);
		System.out.println(eimage);
		System.out.println(eimageFileName);
		String fileend = eimageFileName.substring(eimageFileName.lastIndexOf('.'), eimageFileName.length());
		System.out.println(fileend);
		if(!file.exists()) file.mkdirs();
		try {
			FileUtils.copyFile(eimage,new File(file,ed.getMaxId()+fileend));
		}catch (IOException e) {
		  e.printStackTrace();
		}
		
		ExhibitInfo e=new ExhibitInfo();
		e.setEcontent(econtent);
		e.setEimage("./demo/exhibit/"+ed.getMaxId()+fileend);
		e.setEtitle(etitle);
		e.setUid(user.getUid());
		e.setUsername(user.getUsername());
		
		ed.insertExhibit(e);
		
		return "toshow";
	}
}
