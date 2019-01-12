package entity;

import java.util.Date;

public class QInfo {

	private int qid;//姹傝喘id
	private String qtitle;//姹傝喘鏍囬
	private int uid;//鍙戝竷浜篿d锛屽搴擴serInfo涓殑uid
	private String username;//鍙戝竷浜烘樀绉�
	private String qcontent;//姹傝喘鍐呭
	private Date qdate;// 姹傝喘鏈熸湜鏃堕棿
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

	public Date getQdate() {
		return qdate;
	}

	public void setQdate(Date qdate) {
		this.qdate = qdate;
	}
}
