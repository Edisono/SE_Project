package action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

public class UserAction extends ActionSupport{
	private int uid;// ??锟�?锟斤拷???锟斤拷??id
	private String email;// ???锟斤拷?锟斤拷?锟斤拷??锟�?
	private String password;// 锟斤拷??锟斤拷???锟斤拷??
	private String phone;// ??锟�?锟斤拷??锟�?锟斤拷???锟斤拷?锟斤拷???锟斤拷?锟斤拷????锟斤拷??锟�?锟斤拷???锟斤拷??
	private String address;// ??锟�?锟斤拷??锟�?锟斤拷???锟斤拷?锟斤拷???锟斤拷?锟斤拷?锟斤拷??锟�?
	private String username;// ??锟�?锟斤拷??锟�?锟斤拷????锟斤拷??锟�?
	private String QQ;// ??锟�?锟斤拷???锟斤拷??QQ
	private String profile;// ??锟�?锟斤拷??锟�?锟斤拷???锟斤拷?锟藉ù锟斤拷??锟�?
	private int role;// 锟斤拷???锟斤拷?锟斤拷????锟斤拷??锟�?锟斤拷??锟�?锟斤拷??锟斤拷???锟斤拷?锟斤拷锟斤拷??锟�?
	private int supplyCount;// 锟�?锟斤拷???锟斤拷杈撅拷?锟斤拷???锟斤拷??
	private String avator;// 濠拷?锟斤拷锟斤拷???锟斤拷??

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

	private UserDao nd=new UserDao();
	
	//鑾峰彇鐢ㄦ埛淇℃伅骞舵樉绀哄湪淇敼椤甸潰
	public String modify() throws SQLException{
		/*
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		
		request.getSession().setAttribute("user", user);	
		*/	
		return "modify";
	}
}