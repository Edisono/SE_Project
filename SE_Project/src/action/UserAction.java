package action;

import entity.String;

public class UserAction {
	private int uid;// ??�?��???��??id
	private String email;// ???��?��?��??�?
	private String password;// ��??��???��??
	private String phone;// ??�?��??�?��???��?��???��?��????��??�?��???��??
	private String address;// ??�?��??�?��???��?��???��?��?��??�?
	private String username;// ??�?��??�?��????��??�?
	private String QQ;// ??�?��???��??QQ
	private String profile;// ??�?��??�?��???��?�娴��??�?
	private int role;// ��???��?��????��??�?��??�?��??��???��?����??�?
	private int supplyCount;// �?��???��达�?��???��??
	private String avator;// 婢�?����???��??

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
	
	//获取用户信息并显示在修改页面
	public String modify() throws SQLException{
		/*
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		
		request.getSession().setAttribute("user", user);	
		*/	
		return "modify";
	}
}