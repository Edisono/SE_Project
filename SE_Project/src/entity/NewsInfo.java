package entity;

public class NewsInfo {

	private int nid;// 咨询id
	private String ntitle;// 咨询主题
	private String ncontent;// 咨询内容
	private String ntime;// 发布时间
	private int uid;// 发布人的id，对应UserInfo中的uid
	private String username;// 发布人的昵称
	private String nimage;

	public String getNimage() {
		return nimage;
	}

	public void setNimage(String nimage) {
		this.nimage = nimage;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getNtime() {
		return ntime;
	}

	public void setNtime(String ntime) {
		this.ntime = ntime;
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
