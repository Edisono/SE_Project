package entity;

import java.util.Date;

public class AInfo {

	private int aid;//供应id
	private String atitle;//供应标题
	private String acontent;//供应内容
	private Date adeadline;//截止日期
	private String acompany;//供应企业
	private String aname;// 产品id，对应ProductInfo中的pid
	private String aimage;

	public String getAimage() {
		return aimage;
	}

	public void setAimage(String aimage) {
		this.aimage = aimage;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAtitle() {
		return atitle;
	}

	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}

	public String getAcontent() {
		return acontent;
	}

	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}

	public Date getAdeadline() {
		return adeadline;
	}

	public void setAdeadline(Date adeadline) {
		this.adeadline = adeadline;
	}

	public String getAcompany() {
		return acompany;
	}

	public void setAcompany(String acompany) {
		this.acompany = acompany;
	}


	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}
	
}
