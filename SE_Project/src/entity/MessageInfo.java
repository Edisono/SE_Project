package entity;

public class MessageInfo {

	private int mid;// ??è¨?id
	private int uid;// ??è¨?äººç??idï¼?å¯¹å?UserInfoä¸???uid
	private String username;// ??è¨?äººç???µç§°
	private String mdate;// ??è¨??¶é??
	private String mcontent;// ??è¨???å®?
	private int mobjid;// è¢???è¨???id
	private String mobjtitle;// è¢???è¨?????é¢?
	private int mobjtype;// è¢???è¨???ç±»å??ï¼? 0ï¼?èµ?è®? 1ï¼?å±?ä¼? 2ï¼?ä¾?åº? 3ï¼?æ±?è´?

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
