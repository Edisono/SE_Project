package action;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import dao.MessageDao;

import com.opensymphony.xwork2.ActionSupport;

import entity.AInfo;
import entity.ExhibitInfo;
import entity.MessageInfo;
import entity.NewsInfo;
import entity.ProductInfo;
import entity.QInfo;
import entity.UserInfo;

public class MessageAction extends ActionSupport {
	private String message;
	private MessageDao messagedao = new MessageDao();
	private int mid;
	private int nid;
	private int eid;
	private int qid;
	private int aid;
	private int pid;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String add() throws SQLException {

		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		int mobjtype = (Integer) request.getSession().getAttribute("mobjtype");
		int mobjid = 0;
		String mobjtitle = null;
		switch (mobjtype) {
		case 0:
			NewsInfo news = (NewsInfo) request.getSession()
					.getAttribute("news");
			mobjid = news.getNid();
			mobjtitle = news.getNtitle();
			break;
		case 1:
			ExhibitInfo exhibit = (ExhibitInfo) request.getSession()
					.getAttribute("exhibit");
			mobjid = exhibit.getEid();
			mobjtitle = exhibit.getEtitle();
			break;
		case 2:
			AInfo a = (AInfo) request.getSession().getAttribute("a");
			mobjid = a.getAid();
			mobjtitle = a.getAtitle();
			break;
		case 3:
			QInfo q = (QInfo) request.getSession().getAttribute("q");
			mobjid = q.getQid();
			mobjtitle = q.getQtitle();
			break;
		case 4:
			ProductInfo product = (ProductInfo) request.getSession()
					.getAttribute("product");
			mobjid = product.getPid();
			mobjtitle = product.getPname();
		default:
			break;
		}
		if (message.equals("")) {
			switch (mobjtype) {
			case 0:
				this.setNid(mobjid);
				return "showNews";
			case 1:
				this.setEid(mobjid);
				return "showExhibit";
			case 2:
				this.setAid(mobjid);
				return "showA";
			case 3:
				this.setQid(mobjid);
				return "showQ";
			case 4:
				this.setPid(mobjid);
				return "showProduct";
			default:
				break;
			}
		}

		MessageInfo messageadd = new MessageInfo();
		messageadd.setUid(user.getUid());
		messageadd.setUsername(user.getUsername());
		messageadd.setMcontent(message);
		messageadd.setMobjid(mobjid);
		messageadd.setMobjtitle(mobjtitle);
		messageadd.setMobjtype(mobjtype);
		messagedao.insert(messageadd);
		switch (mobjtype) {
		case 0:
			this.setNid(mobjid);
			return "showNews";
		case 1:
			this.setEid(mobjid);
			return "showExhibit";
		case 2:
			this.setAid(mobjid);
			return "showA";
		case 3:
			this.setQid(mobjid);
			return "showQ";
		case 4:
			this.setPid(mobjid);
			return "showProduct";
		default:
			break;
		}
		return null;
	}

	public String delete() throws SQLException {
		messagedao.delete(mid);
		return show();
	}

	public String show() throws SQLException {
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		if (user.getRole() == 3) {
			List<MessageInfo> messages = messagedao.findAllMessages();
			ServletActionContext.getRequest().getSession()
					.setAttribute("messages", messages);
		} else {
			List<MessageInfo> messages = messagedao.findMessagesByUid(user
					.getUid());
			ServletActionContext.getRequest().getSession()
					.setAttribute("messages", messages);
		}
		return "showMyMessage";
	}

}
