package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




import db.C3P0JdbcUtil;
import entity.NewsInfo;

public class NewsDao {
	public ArrayList<NewsInfo> findAllNews() throws SQLException{
		ArrayList<NewsInfo> list = new ArrayList<NewsInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		NewsInfo news = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM NewsInfo order by nid desc";
		ps = conn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
			news = new NewsInfo();
			news.setNid(rs.getInt("nid"));
			news.setNtitle(rs.getString("ntitle"));
			news.setNcontent(rs.getString("ncontent"));
			news.setNtime(rs.getString("ntime"));
			news.setUid(rs.getInt("uid"));
			news.setUsername(rs.getString("username"));
			news.setNimage(rs.getString("nimage"));
			list.add(news);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public ArrayList<NewsInfo> findNewsByUid(int uid) throws SQLException{
		ArrayList<NewsInfo> list = new ArrayList<NewsInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		NewsInfo news = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM NewsInfo WHERE uid=? order by nid desc";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, uid);
		rs=ps.executeQuery();
		while(rs.next()) {
			news = new NewsInfo();
			news.setNid(rs.getInt("nid"));
			news.setNtitle(rs.getString("ntitle"));
			news.setNcontent(rs.getString("ncontent"));
			news.setNtime(rs.getString("ntime"));
			news.setUid(rs.getInt("uid"));
			news.setUsername(rs.getString("username"));
			news.setNimage(rs.getString("nimage"));
			list.add(news);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public ArrayList<NewsInfo> findNewsByNtitle(String title) throws SQLException{
		ArrayList<NewsInfo> list = new ArrayList<NewsInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		NewsInfo news = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM NewsInfo WHERE ntitle=? order by nid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, title);
		rs=ps.executeQuery();
		while(rs.next()) {
			news = new NewsInfo();
			news.setNid(rs.getInt("nid"));
			news.setNtitle(rs.getString("ntitle"));
			news.setNcontent(rs.getString("ncontent"));
			news.setNtime(rs.getString("ntime"));
			news.setUid(rs.getInt("uid"));
			news.setUsername(rs.getString("username"));
			news.setNimage(rs.getString("nimage"));
			list.add(news);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public ArrayList<NewsInfo> findNewsLikeTitle(String likeTitle) throws SQLException{
		ArrayList<NewsInfo> list = new ArrayList<NewsInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		NewsInfo news = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM NewsInfo WHERE ntitle like %?% order by nid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, likeTitle);
		rs=ps.executeQuery();
		while(rs.next()) {
			news = new NewsInfo();
			news.setNid(rs.getInt("nid"));
			news.setNtitle(rs.getString("ntitle"));
			news.setNcontent(rs.getString("ncontent"));
			news.setNtime(rs.getString("ntime"));
			news.setUid(rs.getInt("uid"));
			news.setUsername(rs.getString("username"));
			news.setNimage(rs.getString("nimage"));
			list.add(news);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public NewsInfo findNewsById(int nid) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		NewsInfo news = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM NewsInfo WHERE nid=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, nid);
		rs=ps.executeQuery();
		while(rs.next()) {
			news = new NewsInfo();
			news.setNid(rs.getInt("nid"));
			news.setNtitle(rs.getString("ntitle"));
			news.setNcontent(rs.getString("ncontent"));
			news.setNtime(rs.getString("ntime"));
			news.setUid(rs.getInt("uid"));
			news.setUsername(rs.getString("username"));
			news.setNimage(rs.getString("nimage"));
		}	     
		conn.close();
		ps.close();
		rs.close();
		return news;
	}
	

	
	
	public boolean insertNews(NewsInfo news) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "insert into NewsInfo(ntitle,ncontent,uid,username,nimage) values(?,?,?,?,?)";
		ps = conn.prepareStatement(sql);
		ps.setString(1, news.getNtitle());
		ps.setString(2, news.getNcontent());
		ps.setInt(3, news.getUid());
		ps.setString(4, news.getUsername());
		ps.setString(5, news.getNimage());
		
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	public boolean deleteNews(int nid) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "delete from NewsInfo where nid=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, nid);
		
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	public boolean updateNews(NewsInfo news) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "UPDATE NewsInfo SET ntitle=?, ncontent=?, ntime=? , nimage=? WHERE nid=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, news.getNtitle());
		ps.setString(2, news.getNcontent());
		ps.setInt(3, news.getUid());
		ps.setString(4, news.getNimage());
		ps.setString(5, news.getUsername());
		
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
}
