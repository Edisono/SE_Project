package action;  

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import dao.MessageDao;
import dao.NewsDao;

import com.opensymphony.xwork2.ActionSupport;

import db.C3P0JdbcUtil;
import entity.ExhibitInfo;
import entity.MessageInfo;
import entity.NewsInfo;
import entity.UserInfo;

public class NewsInfoAction extends ActionSupport {

	private MessageDao md=new MessageDao();
	private NewsDao nd=new NewsDao();
	private int nid;
	private String ncontent;
	private String ntitle;
	private File nimage;
	private String nimageFileName;
	
	
	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public File getNimage() {
		return nimage;
	}

	public void setNimage(File nimage) {
		this.nimage = nimage;
	}

	public String getNimageFileName() {
		return nimageFileName;
	}

	public void setNimageFileName(String nimageFileName) {
		this.nimageFileName = nimageFileName;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String show() throws SQLException{
		
		ArrayList<NewsInfo> newsList=new ArrayList<NewsInfo>();
		newsList=(ArrayList<NewsInfo>) nd.findAllNews();
		
		ServletActionContext.getRequest().getSession().setAttribute("newsList", newsList);
		
		return "show";
	}
	
	public String showDetail() throws SQLException{
		
		NewsInfo news=new NewsInfo();
		news=nd.findNewsById(nid);
		
		List<MessageInfo> newsMessagesList=md.findMessages(nid, 0);
		
		
		ServletActionContext.getRequest().getSession().setAttribute("news", news);
		ServletActionContext.getRequest().getSession().setAttribute("newsMessagesList", newsMessagesList);
		ServletActionContext.getRequest().getSession().setAttribute("mobjtype", 1);
		return "showDetail";
	}
	
	public String add() throws SQLException{
		UserInfo user=(UserInfo) ServletActionContext.getRequest().getSession().getAttribute("user");
		
		String realPath = ServletActionContext.getServletContext().getRealPath("/demo/news");
		File file = new File(realPath);
		//获取文件末尾 eg：.jpg
		
		String fileend = nimageFileName.substring(nimageFileName.lastIndexOf('.'), nimageFileName.length());
		System.out.println(fileend);
		if(!file.exists()) file.mkdirs();
		try {
			FileUtils.copyFile(nimage,new File(file,nd.getMaxId()+fileend));
		}catch (IOException e) {
		  e.printStackTrace();
		}
		
		NewsInfo n=new NewsInfo();
		n.setNcontent(ncontent);
		n.setNimage("./demo/news/"+nd.getMaxId()+fileend);
		n.setNtitle(ntitle);
		n.setUid(user.getUid());
		n.setUsername(user.getUsername());
		
		nd.insertNews(n);
		
		return "toshow";
	}
	
}
