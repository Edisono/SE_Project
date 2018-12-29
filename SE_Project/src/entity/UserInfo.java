package entity;

public class UserInfo {

	private int uid;// ??å§?ï¿½ï¿½???¤æ??id
	private String email;// ???¤æ?·ç?ï¿½é??ï¿?
	private String password;// ï¿½ç??·é???¤æ??
	private String phone;// ??å§?ï¿½ï¿½??ä»?ï¿½é???¤æ?·é???¤æ?·é????ï¿½ï¿½??ä»?ï¿½é???¤æ??
	private String address;// ??å§?ï¿½ï¿½??ä»?ï¿½é???¤æ?·é???¥ï¿½?¡æ?·é??ï¿?
	private String username;// ??å§?ï¿½ï¿½??ä»?ï¿½ï¿½????ï¿½æ??ï¿?
	private String QQ;// ??å§?ï¿½ï¿½???¤æ??QQ
	private String profile;// ??å§?ï¿½ï¿½??ä»?ï¿½é???¤æ?·å¨´ï¿½é??ï¿?
	private int role;// ï¿½ï¿½???¤æ?·ç????·é??å§?ï¿½ï¿½??ä»?ï¿½ç??ï¿½é???¤æ?·ï¿½ï¿½é??ï¿?
	private int supplyCount;// å¨?ï¿½é???¥ï¿½è¾¾æ?·é???¤æ??
	private String avator;// å©¢è?µï¿½ï¿½é???¤æ??

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

}
