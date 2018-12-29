package action;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import entity.QInfo;
import entity.UserInfo;

public class QInfoAction {
	private QDao qd=new QDao();
	private int qid;
	private String qcontent;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public String show() throws SQLException{
		
		ArrayList<QInfo> qList=new ArrayList<QInfo>();
		qList=(ArrayList<QInfo>) qd.findAllQ();
		
		ServletActionContext.getRequest().getSession().setAttribute("qList", qList);
		
		return "show";
	}
	
	public String showDetail() throws SQLException{
		
		QInfo q=new QInfo();
		q=qd.findQById(qid);
		
		ServletActionContext.getRequest().getSession().setAttribute("q", q);
		return "showDetail";
	}
	
	public String add() throws SQLException{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		
		QInfo q=new QInfo();
		q=qd.findQById(qid);
		
		
		request.getSession().setAttribute("q", q);
		return "showDetail";
	}
}
