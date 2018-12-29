package entity;

public class QInfo {

	private int qid;//求购id
	private String qtitle;//求购标题
	private int uid;//发布人id，对应UserInfo中的uid
	private String username;//发布人昵称
	private String qcontent;//求购内容
	private String qdate;// 求购期望时间
	private String qimage;

	public String getQimage() {
		return qimage;
	}

	public void setQimage(String qimage) {
		this.qimage = qimage;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQtitle() {
		return qtitle;
	}

	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
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

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public String getQdate() {
		return qdate;
	}

	public void setQdate(String qdate) {
		this.qdate = qdate;
	}
}
