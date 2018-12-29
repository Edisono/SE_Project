package action;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import dao.ADao;
import entity.AInfo;
import entity.UserInfo;

public class AInfoAction {
	private ADao ad=new ADao();
	private int aid;
	private String acontent;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAcontent() {
		return acontent;
	}

	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}

	public String show() throws SQLException{
		
		ArrayList<AInfo> aList=new ArrayList<AInfo>();
		aList=(ArrayList<AInfo>) ad.findAllNews();
		
		ServletActionContext.getRequest().getSession().setAttribute("aList", aList);
		
		return "show";
	}
	
	public String showDetail() throws SQLException{
		
		AInfo a=new AInfo();
		a=ad.findNewsById(aid);
		
		ServletActionContext.getRequest().getSession().setAttribute("a", a);
		return "showDetail";
	}
	
	public String add() throws SQLException{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		
		AInfo news=new AInfo();
		news=ad.findNewsById(aid);
		
		
		request.getSession().setAttribute("news", news);
		return "showDetail";
	}
}
