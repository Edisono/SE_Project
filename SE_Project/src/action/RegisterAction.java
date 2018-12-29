
package action;  

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation;

import com.opensymphony.xwork2.ActionSupport;
//import com.sun.corba.se.pept.transport.Connection;

import dao.UserDao;
import entity.UserInfo;

public class RegisterAction extends ActionSupport {

	private String email;// ???��?��?��??�?
	private String password;// ��??��???��??
	private String phone;// ??�?��??�?��???��?��???��?��????��??�?��???��??
	private String address;// ??�?��??�?��???��?��???��?��?��??�?
	private String username;// ??�?��??�?��????��??�?
	private String QQ;// ??�?��???��??QQ
	private String profile;// ??�?��??�?��???��?�娴��??�?
	private String avator;// 婢�?����???��??
	
	    public String execute() throws Exception {
	    	
	    UserInfo user = new UserInfo();
	    user.setAddress(address);
	    user.setEmail(email);
	    user.setPassword(password);
	    user.setPhone(phone);
	    user.setProfile(profile);
	    user.setAvator(avator);
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
