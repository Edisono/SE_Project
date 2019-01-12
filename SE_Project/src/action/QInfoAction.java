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

import dao.MessageDao;
import dao.QDao;
import entity.AInfo;
import entity.MessageInfo;
import entity.QInfo;
import entity.UserInfo;

public class QInfoAction {
	private QDao qd=new QDao();
	private int qid;
	private String qtitle;
	private String qcontent;
	private Date qdate;
	private String time;
	private int uid;
	private String username;
	private File qimage;
	private String qimageFileName;

	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public File getQimage() {
		return qimage;
	}

	public void setQimage(File qimage) {
		this.qimage = qimage;
	}

	public String getQimageFileName() {
		return qimageFileName;
	}

	public void setQimageFileName(String qimageFileName) {
		this.qimageFileName = qimageFileName;
	}

	public QDao getQd() {
		return qd;
	}

	public void setQd(QDao qd) {
		this.qd = qd;
	}

	public String getQtitle() {
		return qtitle;
	}

	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}

	public Date getQdate() {
		return qdate;
	}

	public void setQdate(Date qdate) {
		this.qdate = qdate;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public String show() throws SQLException{
		
		ArrayList<QInfo> qList=new ArrayList<QInfo>();
		qList=(ArrayList<QInfo>) qd.findAllQ();
		
		ServletActionContext.getRequest().getSession().setAttribute("qList", qList);
		
		return "show";
	}
	
	public String showMyQ() throws SQLException{
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		ArrayList<QInfo> qList=new ArrayList<QInfo>();
		
		if(user.getRole()==3){
			qList=(ArrayList<QInfo>) qd.findAllQ();
		}
		else{
			qList=(ArrayList<QInfo>) qd.findQByUid(user.getUid());
		}
		ServletActionContext.getRequest().getSession().setAttribute("qList", qList);
		
		return "showMyQ";
	}
	
	public String showDetail() throws SQLException{
		
		QInfo q=new QInfo();
		q=qd.findQById(qid);
		MessageDao md=new MessageDao();
		List<MessageInfo> messageInfo=md.findMessages(qid, 3);
		ServletActionContext.getRequest().getSession().setAttribute("messageInfo", messageInfo);
		ServletActionContext.getRequest().getSession().setAttribute("q", q);
		ServletActionContext.getRequest().getSession().setAttribute("mobjtype", 3);
		return "showDetail";
	}
	
	public String add() throws SQLException, ParseException{
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		
		String realPath = ServletActionContext.getServletContext().getRealPath("/demo/qimage");
		File file = new File(realPath);
		//获取文件末尾 eg：.jpg
		String fileend = qimageFileName.substring(qimageFileName.lastIndexOf('.'), qimageFileName.length());
		if(!file.exists()) file.mkdirs();
		try {
			FileUtils.copyFile(qimage,new File(file,(qd.getMaxId()+1)+fileend));
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
        qdate=rightNow.getTime();

		
		
	    QInfo q = new QInfo();
	    q.setQtitle(qtitle);
	    q.setQcontent(qcontent);
	    q.setQdate(qdate);
	    q.setUid(user.getUid());
	    q.setUsername(user.getUsername());
	    q.setQimage("./demo/qimage/"+(qd.getMaxId()+1)+fileend);
	    
	   if(qd.insertQ(q)) {
		   return show();
	   }else {
		   return "falseadd";
	   }
	}
	
	public String update() throws SQLException, ParseException{
		HttpServletRequest request = ServletActionContext.getRequest();
		QInfo sessionq= (QInfo)request.getSession().getAttribute("q");
		
		String tempqimage = sessionq.getQimage();
		
		
		if(qimageFileName!=null){
			String realPath = ServletActionContext.getServletContext().getRealPath("/demo/qimage");
			File file = new File(realPath);
			//获取文件末尾 eg：.jpg
			String fileend = qimageFileName.substring(qimageFileName.lastIndexOf('.'), qimageFileName.length());
			if(!file.exists()) file.mkdirs();
			try {
				FileUtils.copyFile(qimage,new File(file,sessionq.getQid()+fileend));
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
        qdate=rightNow.getTime();

        QInfo q = new QInfo();
        q.setQid(sessionq.getQid());
	    q.setQtitle(qtitle);
	    q.setQcontent(qcontent);
	    q.setQdate(qdate);
	    q.setUid(q.getUid());
	    q.setUsername(q.getUsername());
	    q.setQimage(tempqimage);
	    
	   if(qd.updateQ(q)) {
		   return showMyQ();
	   }else {
		   return "falseupdate";
	   }
	}
	
	public String modify() throws SQLException{
		QInfo q=new QInfo();
		q=qd.findQById(qid);
		MessageDao md=new MessageDao();
		List<MessageInfo> messageInfo=md.findMessages(qid, 3);
		ServletActionContext.getRequest().getSession().setAttribute("messageInfo", messageInfo);
		ServletActionContext.getRequest().getSession().setAttribute("q", q);
		ServletActionContext.getRequest().getSession().setAttribute("mobjtype", 3);
		
		return "modify";
	}
	
	
	public String delete() throws SQLException{
		qd.deleteQ(qid);
		return showMyQ();
	}
	
	public String Myupdate() throws SQLException, ParseException{
		HttpServletRequest request = ServletActionContext.getRequest();
		QInfo sessionq= (QInfo)request.getSession().getAttribute("q");
		
		String tempqimage = sessionq.getQimage();
		
		
		if(qimageFileName!=null){
			String realPath = ServletActionContext.getServletContext().getRealPath("/demo/qimage");
			File file = new File(realPath);
			//获取文件末尾 eg：.jpg
			String fileend = qimageFileName.substring(qimageFileName.lastIndexOf('.'), qimageFileName.length());
			if(!file.exists()) file.mkdirs();
			try {
				FileUtils.copyFile(qimage,new File(file,sessionq.getQid()+fileend));
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
        qdate=rightNow.getTime();

		
        QInfo q = new QInfo();
        q.setQid(sessionq.getQid());
	    q.setQtitle(qtitle);
	    q.setQcontent(qcontent);
	    q.setQdate(qdate);
	    q.setUid(q.getUid());
	    q.setUsername(q.getUsername());
	    q.setQimage(tempqimage);
	    
	   if(qd.updateQ(q)) {
		   return showMyQ();
	   }else {
		   return "falseMyupdate";
	   }
	}
	
	public String Mydelete() throws SQLException{
		qd.deleteQ(qid);
		return showMyQ();
	}
	
	
	
	
	
	
}
