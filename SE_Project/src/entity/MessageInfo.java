package entity;

public class MessageInfo {

	private int mid;// ??�?id
	private int uid;// ??�?人�??id�?对�?UserInfo�???uid
	private String username;// ??�?人�???�称
	private String mdate;// ??�??��??
	private String mcontent;// ??�???�?
	private int mobjid;// �???�???id
	private String mobjtitle;// �???�?????�?
	private int mobjtype;// �???�???类�??�? 0�?�?�? 1�?�?�? 2�?�?�? 3�?�?�?

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
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

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	public String getMcontent() {
		return mcontent;
	}

	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}

	public int getMobjid() {
		return mobjid;
	}

	public void setMobjid(int mobjid) {
		this.mobjid = mobjid;
	}

	public String getMobjtitle() {
		return mobjtitle;
	}

	public void setMobjtitle(String mobjtitle) {
		this.mobjtitle = mobjtitle;
	}

	public int getMobjtype() {
		return mobjtype;
	}

	public void setMobjtype(int mobjtype) {
		this.mobjtype = mobjtype;
	}
}
