package action;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import dao.ADao;
import dao.MessageDao;
import entity.AInfo;
import entity.MessageInfo;
import entity.UserInfo;

public class AInfoAction {
	private ADao ad=new ADao();
	private int aid;
	private String atitle;
	private String acontent;
	private Date adeadline;
	private String time;
	private String acompany;
	private String aname;
	private File aimage;
	private String aimageFileName;
	

	public ADao getAd() {
		return ad;
	}

	public void setAd(ADao ad) {
		this.ad = ad;
	}

	public String getAtitle() {
		return atitle;
	}

	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}

	public Date getAdeadline() {
		return adeadline;
	}

	public void setAdeadline(Date adeadline) {
		this.adeadline = adeadline;
	}

	public String getAcompany() {
		return acompany;
	}

	public void setAcompany(String acompany) {
		this.acompany = acompany;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public File getAimage() {
		return aimage;
	}

	public void setAimage(File aimage) {
		this.aimage = aimage;
	}

	public String getAimageFileName() {
		return aimageFileName;
	}

	public void setAimageFileName(String aimageFileName) {
		this.aimageFileName = aimageFileName;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAcontent() {
		return acontent;
	}

	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}

	public String show() throws SQLException{
		
		ArrayList<AInfo> aList=new ArrayList<AInfo>();
		aList=(ArrayList<AInfo>) ad.findAllA();
		
		ServletActionContext.getRequest().getSession().setAttribute("aList", aList);
		
		return "show";
	}
	
	public String showMyA() throws SQLException{
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		ArrayList<AInfo> aList=new ArrayList<AInfo>();
		if(user.getRole()==3){
			aList=(ArrayList<AInfo>) ad.findAllA();
		}
		else{
			aList=(ArrayList<AInfo>) ad.findAByAcompany(user.getUsername());	
			ServletActionContext.getRequest().getSession().setAttribute("aList", aList);
		}
		return "showMyA";
	}
	
	public String showDetail() throws SQLException{
		
		AInfo a=new AInfo();
		a=ad.findAById(aid);
		MessageDao md=new MessageDao();
		List<MessageInfo> messageInfo=md.findMessages(aid, 2);
		ServletActionContext.getRequest().getSession().setAttribute("messageInfo", messageInfo);
		ServletActionContext.getRequest().getSession().setAttribute("a", a);
		ServletActionContext.getRequest().getSession().setAttribute("mobjtype", 2);
		return "showDetail";
	}
	
	public String add() throws SQLException, ParseException{
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		
		String realPath = ServletActionContext.getServletContext().getRealPath("/demo/aimage");
		File file = new File(realPath);
		//获取文件末尾 eg：.jpg
		String fileend = aimageFileName.substring(aimageFileName.lastIndexOf('.'), aimageFileName.length());
		if(!file.exists()) file.mkdirs();
		try {
			FileUtils.copyFile(aimage,new File(file,(ad.getMaxId()+1)+fileend));
		}catch (IOException e) {
		  e.printStackTrace();
		}
		
		Date date = new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String time2 = simpleDateFormat.format(date.getTime());
		date = simpleDateFormat.parse(time2);
		Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.DAY_OF_YEAR,Integer.parseInt(time));
        adeadline=rightNow.getTime();

		
		
	    AInfo a = new AInfo();
	    a.setAtitle(atitle);
	    a.setAcontent(acontent);
	    a.setAdeadline(adeadline);
	    a.setAcompany(user.getUsername());
	    a.setAname(aname);
	    a.setAimage("./demo/aimage/"+(ad.getMaxId()+1)+fileend);
	    
	   if(ad.insertA(a)) {
		   return show();
	   }else {
		   return "falseadd";
	   }
	}
	
	public String update() throws SQLException, ParseException{
		HttpServletRequest request = ServletActionContext.getRequest();
		AInfo sessiona= (AInfo)request.getSession().getAttribute("a");
		
		String tempaimage = sessiona.getAimage();
		
		
		if(aimageFileName!=null){
			String realPath = ServletActionContext.getServletContext().getRealPath("/demo/aimage");
			File file = new File(realPath);
			//获取文件末尾 eg：.jpg
			String fileend = aimageFileName.substring(aimageFileName.lastIndexOf('.'), aimageFileName.length());
			if(!file.exists()) file.mkdirs();
			try {
				FileUtils.copyFile(aimage,new File(file,sessiona.getAid()+fileend));
			}catch (IOException e) {
			  e.printStackTrace();
			}
			
		}
		

		
	    AInfo a = new AInfo();
	    a.setAid(sessiona.getAid());
	    a.setAtitle(atitle);
	    a.setAcontent(acontent);
	    a.setAdeadline(sessiona.getAdeadline());
	    a.setAcompany(sessiona.getAcompany());
	    a.setAname(sessiona.getAname());
	    a.setAimage(tempaimage);
	    
	   if(ad.updateA(a)) {
		   return showMyA();
	   }else {
		   return "falseupdate";
	   }
	}
	
	public String delete() throws SQLException{
		ad.deleteA(aid);
		return showMyA();
	}
	
	public String modify() throws SQLException{
		AInfo a=new AInfo();
		a=ad.findAById(aid);
		MessageDao md=new MessageDao();
		List<MessageInfo> messageInfo=md.findMessages(aid, 2);
		ServletActionContext.getRequest().getSession().setAttribute("messageInfo", messageInfo);
		ServletActionContext.getRequest().getSession().setAttribute("a", a);
		ServletActionContext.getRequest().getSession().setAttribute("mobjtype", 2);
		
		return "modify";
	}
	
	public String Myupdate() throws SQLException, ParseException{
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		AInfo sessiona= (AInfo)request.getSession().getAttribute("a");
		
		String tempaimage = sessiona.getAimage();
		
		
		if(aimageFileName!=null){
			String realPath = ServletActionContext.getServletContext().getRealPath("/demo/aimage");
			File file = new File(realPath);
			//获取文件末尾 eg：.jpg
			String fileend = aimageFileName.substring(aimageFileName.lastIndexOf('.'), aimageFileName.length());
			if(!file.exists()) file.mkdirs();
			try {
				FileUtils.copyFile(aimage,new File(file,sessiona.getAid()+fileend));
			}catch (IOException e) {
			  e.printStackTrace();
			}
			
		}
		
		Date date = new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String time2 = simpleDateFormat.format(date.getTime());
		date = simpleDateFormat.parse(time2);
		Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.DAY_OF_YEAR,Integer.parseInt(time));
        adeadline=rightNow.getTime();

		
	    AInfo a = new AInfo();
	    a.setAid(sessiona.getAid());
	    a.setAtitle(atitle);
	    a.setAcontent(acontent);
	    a.setAdeadline(adeadline);
	    a.setAcompany(user.getUsername());
	    a.setAname(aname);
	    a.setAimage(tempaimage);
	    
	   if(ad.updateA(a)) {
		   return showMyA();
	   }else {
		   return "falseMyupdate";
	   }
	}
	
	public String Mydelete() throws SQLException{
		ad.deleteA(aid);
		return showMyA();
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}
