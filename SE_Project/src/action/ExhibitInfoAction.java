package action;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import dao.ExhibitDao;
import dao.NewsDao;
import entity.ExhibitInfo;
import entity.UserInfo;

public class ExhibitInfoAction {
	private ExhibitDao ed=new ExhibitDao();
	private int eid;
	private String econtent;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEcontent() {
		return econtent;
	}

	public void setEcontent(String econtent) {
		this.econtent = econtent;
	}

	public String show() throws SQLException{
		
		ArrayList<ExhibitInfo> exhibitList=new ArrayList<ExhibitInfo>();
		exhibitList=(ArrayList<ExhibitInfo>) ed.findAllExhibit();
		
		ServletActionContext.getRequest().getSession().setAttribute("exhibitList", exhibitList);
		
		return "show";
	}
	
	public String showDetail() throws SQLException{
		
		ExhibitInfo exhibit=new ExhibitInfo();
		exhibit=ed.findExhibitById(eid);
		
		ServletActionContext.getRequest().getSession().setAttribute("exhibit", exhibit);
		return "showDetail";
	}
	
	public String add() throws SQLException{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		
		ExhibitInfo exhibit=new ExhibitInfo();
		exhibit=ed.findExhibitById(eid);
		
		
		request.getSession().setAttribute("exhibit", exhibit);
		return "showDetail";
	}
}
