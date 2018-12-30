
package action;  



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
//import com.sun.corba.se.pept.transport.Connection;

import dao.UserDao;
import entity.UserInfo;

@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport {

	private String email;
	private String password;
	private String phone;
	private String address;
	private String username;
	private String QQ;
	private String profile;
	private File avator;
	private String avatorFileName;
	
	
	
    public String getAvatorFileName() {
		return avatorFileName;
	}


	public void setAvatorFileName(String avatorFileName) {
		this.avatorFileName = avatorFileName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getQQ() {
		return QQ;
	}


	public void setQQ(String qQ) {
		QQ = qQ;
	}


	public String getProfile() {
		return profile;
	}


	public void setProfile(String profile) {
		this.profile = profile;
	}


	public File getAvator() {
		return avator;
	}


	public void setAvator(File avator) {
		this.avator = avator;
	}


	public String execute() throws Exception {
	String realPath = ServletActionContext.getServletContext().getRealPath("/demo/avator");
	File file = new File(realPath);
	//获取文件末尾 eg：.jpg
	String fileend = avatorFileName.substring(avatorFileName.lastIndexOf('.'), avatorFileName.length());
	if(!file.exists()) file.mkdirs();
	try {
		FileUtils.copyFile(avator,new File(file,this.email+fileend));
	}catch (IOException e) {
	  e.printStackTrace();
	}
    UserInfo user = new UserInfo();
    user.setAddress(address);
    user.setEmail(email);
    user.setPassword(password);
    user.setPhone(phone);
    user.setProfile(profile);
    user.setAvator("/demo/avator/"+email+fileend);
    user.setQQ(QQ);
    user.setUsername(username);
    user.setRole(1);
 

   UserDao dao = new UserDao();
   if(dao.insertUser(user)) {
	   return "success";
   }else {
	   return "false";
   }
   
  }

}
