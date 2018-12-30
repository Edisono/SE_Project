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

public class LoginAction extends ActionSupport {

	private String email;
	private String passwd;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String execute() throws Exception {
		ArrayList arr = new ArrayList();
		arr.add(this.email);
		arr.add(this.passwd);

		UserDao login = new UserDao();
		UserInfo user = login.checkLogin(arr);

		HttpServletRequest request = ServletActionContext.getRequest();

		if (user == null)
			return "error";

		request.getSession().setAttribute("user", user);

		return "success";
	}
}
