package entity;

public class CollectionInfo {

	private int cid;//?¶è??id
	private int uid;//?¶è???¨æ?·ç??idï¼?å¯¹å?UserInfoä¸???uid
	private int pid;//è¢??¶è??äº§å????idï¼?å¯¹å?ProductInfoä¸???pid
	private String username;//?¶è???¨æ?·ç???µç§°
	private String ptype;//è¢??¶è??äº§å????ç±»å??
	private String pname;//è¢??¶è??äº§å??????ç§?
	private String cdate;// ?¶è???¶é??

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	
}
