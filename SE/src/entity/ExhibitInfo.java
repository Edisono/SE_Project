package entity;

public class ExhibitInfo {

	private int eid;// å±?ä¼?id
	private String etitle;// å±?ä¼?ä¸»é?
	private String econtent;// å±?ä¼???å®?
	private String eimage;// å±?ä¼??¾ç??
	private String etime;// å±?ä¼??¶é??
	private int uid;// å±?ä¼???å¸?äººç??id,å¯¹å?UserInfoä¸???uid
	private String username;// å±?ä¼???å¸?äººç???µç§°

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEtitle() {
		return etitle;
	}

	public void setEtitle(String etitle) {
		this.etitle = etitle;
	}

	public String getEcontent() {
		return econtent;
	}

	public void setEcontent(String econtent) {
		this.econtent = econtent;
	}

	public String getEimage() {
		return eimage;
	}

	public void setEimage(String eimage) {
		this.eimage = eimage;
	}

	public String getEtime() {
		return etime;
	}

	public void setEtime(String etime) {
		this.etime = etime;
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

}
