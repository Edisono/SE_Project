package action;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.ExhibitDao;
import dao.NewsDao;
import entity.ExhibitInfo;
import entity.UserInfo;

public class ExhibitInfoAction extends ActionSupport {
	private ExhibitDao ed=new ExhibitDao();
	private int eid;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String show() throws SQLException{
		
		ArrayList<ExhibitInfo> exhibitList=(ArrayList<ExhibitInfo>) ed.findAllExhibit();
		
		ServletActionContext.getRequest().getSession().setAttribute("exhibitList", exhibitList);
		return "show";
	}
	
	public String showDetail() throws SQLException{
		
		ExhibitInfo exhibit=ed.findExhibitById(eid);
		
		ServletActionContext.getRequest().getSession().setAttribute("exhibit", exhibit);
		return "showDetail";
	}
}
