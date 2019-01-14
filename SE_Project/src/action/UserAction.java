package action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import db.*;
import entity.UserInfo;

public class UserAction extends ActionSupport{
	private int uid;// ??閿燂拷?閿熸枻鎷�???閿熸枻鎷�??id
	private String email;// ???閿熸枻鎷�?閿熸枻鎷�?閿熸枻鎷�??閿燂拷?
	private String password;// 閿熸枻鎷�??閿熸枻鎷�???閿熸枻鎷�??
	private String phone;// ??閿燂拷?閿熸枻鎷�??閿燂拷?閿熸枻鎷�???閿熸枻鎷�?閿熸枻鎷�???閿熸枻鎷�?閿熸枻鎷�????閿熸枻鎷�??閿燂拷?閿熸枻鎷�???閿熸枻鎷�??
	private String address;// ??閿燂拷?閿熸枻鎷�??閿燂拷?閿熸枻鎷�???閿熸枻鎷�?閿熸枻鎷�???閿熸枻鎷�?閿熸枻鎷�?閿熸枻鎷�??閿燂拷?
	private String username;// ??閿燂拷?閿熸枻鎷�??閿燂拷?閿熸枻鎷�????閿熸枻鎷�??閿燂拷?
	private String QQ;// ??閿燂拷?閿熸枻鎷�???閿熸枻鎷�??QQ
	private String profile;// ??閿燂拷?閿熸枻鎷�??閿燂拷?閿熸枻鎷�???閿熸枻鎷�?閿熻棄霉閿熸枻鎷�??閿燂拷?
	private int role;// 閿熸枻鎷�???閿熸枻鎷�?閿熸枻鎷�????閿熸枻鎷�??閿燂拷?閿熸枻鎷�??閿燂拷?閿熸枻鎷�??閿熸枻鎷�???閿熸枻鎷�?閿熸枻鎷烽敓鏂ゆ嫹??閿燂拷?
	private int supplyCount;// 閿燂拷?閿熸枻鎷�???閿熸枻鎷锋潏鎾呮嫹?閿熸枻鎷�???閿熸枻鎷�??
	private String avator;// 婵狀澁鎷�?閿熸枻鎷烽敓鏂ゆ嫹???閿熸枻鎷�??

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getSupplyCount() {
		return supplyCount;
	}

	public void setSupplyCount(int supplyCount) {
		this.supplyCount = supplyCount;
	}

	public String getAvator() {
		return avator;
	}

	public void setAvator(String avator) {
		this.avator = avator;
	}

	Connection conn;
	PreparedStatement ps;
	ResultSet rs;

	
	private UserDao nd=new UserDao();
	
	//閼惧嘲褰囬悽銊﹀煕娣団剝浼呴獮鑸垫▔缁�鍝勬躬娣囶喗鏁兼い鐢告桨
	public String modify() throws Exception{

		HttpServletRequest request = ServletActionContext.getRequest();
		
		UserInfo user = new UserInfo();
		UserInfo u=(UserInfo)request.getSession().getAttribute("user");
		user.setUid(u.getUid());

		
		u.setEmail( request.getParameter("email"));
		u.setUsername(request.getParameter("username"));
		u.setQQ(request.getParameter("QQ"));
		u.setPhone(request.getParameter("phone"));
		u.setAddress(request.getParameter("address"));
		u.setProfile(request.getParameter("profile"));
		
		
		nd.updateUser(u);

		request.getSession().setAttribute("user", u);
		return "modify";

		
	}
	

}