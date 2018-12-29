package action;  

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import dao.NewsDao;

import com.opensymphony.xwork2.ActionSupport;

import db.C3P0JdbcUtil;
import entity.NewsInfo;
import entity.UserInfo;

public class NewsInfoAction extends ActionSupport {

	private NewsDao nd=new NewsDao();
	private int nid;
	private String ncontent;
	
	
	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

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
		
		ServletActionContext.getRequest().getSession().setAttribute("news", news);
		
		return "showDetail";
	}
	
	public String add() throws SQLException{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		
		NewsInfo news=new NewsInfo();
		news=nd.findNewsById(nid);
		
		
		request.getSession().setAttribute("news", news);
		return "showDetail";
	}
	
	
}