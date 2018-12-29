package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.C3P0JdbcUtil;
import entity.QInfo;;

public class QDao {
	public List<QInfo> findAllQ() throws SQLException{
		List<QInfo> list = new ArrayList<QInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		QInfo q = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM QInfo  order by qid desc";
		ps = conn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
			q = new QInfo();
			q.setQid(rs.getInt("qid"));
			q.setQtitle(rs.getString("qtitle"));
			q.setQcontent(rs.getString("qcontent"));
			q.setQdate(rs.getString("qdate"));
			q.setUid(rs.getInt("uid"));
			q.setUsername(rs.getString("username"));
			q.setQimage(rs.getString("qimage"));
			list.add(q);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public List<QInfo> findQByUid(int uid) throws SQLException{
		List<QInfo> list = new ArrayList<QInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		QInfo q = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM QInfo WHERE uid=? order by qid desc";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, uid);
		rs=ps.executeQuery();
		while(rs.next()) {
			q = new QInfo();
			q.setQid(rs.getInt("qid"));
			q.setQtitle(rs.getString("qtitle"));
			q.setQcontent(rs.getString("qcontent"));
			q.setQdate(rs.getString("qdate"));
			q.setUid(rs.getInt("uid"));
			q.setUsername(rs.getString("username"));
			q.setQimage(rs.getString("qimage"));
			list.add(q);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public List<QInfo> findQByQtitle(String title) throws SQLException{
		List<QInfo> list = new ArrayList<QInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		QInfo q = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM QInfo WHERE qtitle=? order by qid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, title);
		rs=ps.executeQuery();
		while(rs.next()) {
			q = new QInfo();
			q.setQid(rs.getInt("qid"));
			q.setQtitle(rs.getString("qtitle"));
			q.setQcontent(rs.getString("qcontent"));
			q.setQdate(rs.getString("qdate"));
			q.setUid(rs.getInt("uid"));
			q.setUsername(rs.getString("username"));
			q.setQimage(rs.getString("qimage"));
			list.add(q);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public List<QInfo> findQLikeTitle(String likeTitle) throws SQLException{
		List<QInfo> list = new ArrayList<QInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		QInfo q = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM QInfo WHERE qtitle like ? order by qid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, likeTitle);
		rs=ps.executeQuery();
		while(rs.next()) {
			q = new QInfo();
			q.setQid(rs.getInt("qid"));
			q.setQtitle(rs.getString("qtitle"));
			q.setQcontent(rs.getString("qcontent"));
			q.setQdate(rs.getString("qdate"));
			q.setUid(rs.getInt("uid"));
			q.setUsername(rs.getString("username"));
			q.setQimage(rs.getString("qimage"));
			list.add(q);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public QInfo findQById(int qid) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		QInfo q = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM QInfo WHERE qid=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, qid);
		rs=ps.executeQuery();
		while(rs.next()) {
			q = new QInfo();
			q.setQid(rs.getInt("qid"));
			q.setQtitle(rs.getString("qtitle"));
			q.setQcontent(rs.getString("qcontent"));
			q.setQdate(rs.getString("qdate"));
			q.setUid(rs.getInt("uid"));
			q.setUsername(rs.getString("username"));
			q.setQimage(rs.getString("qimage"));
		}	     
		conn.close();
		ps.close();
		rs.close();
		return q;
	}
	
	public boolean insertQ(QInfo q) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "insert into QInfo(qtitle,qcontent,uid,username,qimage) values(?,?,?,?,?)";
		ps = conn.prepareStatement(sql);
		ps.setString(1, q.getQtitle());
		ps.setString(2, q.getQcontent());
		ps.setInt(3, q.getUid());
		ps.setString(4, q.getUsername());
		ps.setString(5, q.getQimage());
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	public boolean deleteQ(int qid) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "delete from QInfo where qid=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, qid);
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	public boolean updateQ(QInfo q) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "UPDATE QInfo SET qtitle=?, qcontent=?, qdate=? , qimage=? WHERE qid=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, q.getQtitle());
		ps.setString(2, q.getQcontent());
		ps.setInt(3, q.getUid());
		ps.setString(4, q.getQimage());
		ps.setString(5, q.getUsername());
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	
}
