package action;  

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import dao.MessageDao;
import dao.NewsDao;

import com.opensymphony.xwork2.ActionSupport;

import db.C3P0JdbcUtil;
import entity.MessageInfo;
import entity.NewsInfo;
import entity.UserInfo;

public class NewsInfoAction extends ActionSupport {

	private NewsDao nd=new NewsDao();
	private int nid;
	
	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String show() throws SQLException{
		
		ArrayList<NewsInfo> newsList=new ArrayList<NewsInfo>();
		newsList=(ArrayList<NewsInfo>) nd.findAllNews();
		
		ServletActionContext.getRequest().getSession().setAttribute("newsList", newsList);
		
		return "show";
	}
	
	public String showDetail() throws SQLException{
		
		NewsInfo news=new NewsInfo();
		news=nd.findNewsById(nid);
		
		List<MessageInfo> messagesList=nd.getNewsMessage(nid);
		
		ServletActionContext.getRequest().getSession().setAttribute("news", news);
		ServletActionContext.getRequest().getSession().setAttribute("messagesList", messagesList);
		return "showDetail";
	}
	
	public String manage() throws SQLException{
		
		ArrayList<NewsInfo> newsList=new ArrayList<NewsInfo>();
		newsList=(ArrayList<NewsInfo>) nd.findAllNews();
		
		ServletActionContext.getRequest().getSession().setAttribute("newsList", newsList);
		
		return "manage";
	}
	
	
}
