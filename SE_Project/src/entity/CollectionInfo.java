package entity;

public class CollectionInfo {

	private int cid;//?��??id
	private int uid;//?��???��?��??id�?对�?UserInfo�???uid
	private int pid;//�??��??产�????id�?对�?ProductInfo�???pid
	private String username;//?��???��?��???�称
	private String ptype;//�??��??产�????类�??
	private String pname;//�??��??产�??????�?
	private String cdate;// ?��???��??

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
