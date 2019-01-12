package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.C3P0JdbcUtil;
import entity.MessageInfo;

public class MessageDao {

	public List<MessageInfo> findAllMessages() throws SQLException {
		List<MessageInfo> list = new ArrayList<MessageInfo>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MessageInfo message = null;
		conn = C3P0JdbcUtil.getConnection();
		// conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM MessageInfo order by mid desc";
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			message = new MessageInfo();
			message.setMid(rs.getInt("mid"));
			message.setUid(rs.getInt("uid"));
			message.setUsername(rs.getString("username"));
			message.setMdate(rs.getString("mdate"));
			message.setMcontent(rs.getString("mcontent"));
			message.setMobjid(rs.getInt("mobjid"));
			message.setMobjtitle(rs.getString("mobjtitle"));
			message.setMobjtype(rs.getInt("mobjtype"));
			list.add(message);
		}
		conn.close();
		ps.close();
		rs.close();
		return list;

	}
	
	
	
	
	public List<MessageInfo> findMessages(int mobjid, int mobjtype) throws SQLException {
		List<MessageInfo> list = new ArrayList<MessageInfo>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MessageInfo message = null;
		conn = C3P0JdbcUtil.getConnection();
		// conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM MessageInfo WHERE mobjid=? AND mobjtype=? order by mid desc";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, mobjid);
		ps.setInt(2, mobjtype);
		rs = ps.executeQuery();
		while (rs.next()) {
			message = new MessageInfo();
			message.setMid(rs.getInt("mid"));
			message.setUid(rs.getInt("uid"));
			message.setUsername(rs.getString("username"));
			message.setMdate(rs.getString("mdate"));
			message.setMcontent(rs.getString("mcontent"));
			message.setMobjid(rs.getInt("mobjid"));
			message.setMobjtitle(rs.getString("mobjtitle"));
			message.setMobjtype(rs.getInt("mobjtype"));
			list.add(message);
		}
		conn.close();
		ps.close();
		rs.close();
		return list;

	}
	
	public List<MessageInfo> findMessagesByUid(int uid) throws SQLException {
		List<MessageInfo> list = new ArrayList<MessageInfo>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MessageInfo message = null;
		conn = C3P0JdbcUtil.getConnection();
		// conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM MessageInfo WHERE uid=? order by mid desc";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, uid);
		rs = ps.executeQuery();
		while (rs.next()) {
			message = new MessageInfo();
			message.setMid(rs.getInt("mid"));
			message.setUid(rs.getInt("uid"));
			message.setUsername(rs.getString("username"));
			message.setMdate(rs.getString("mdate"));
			message.setMcontent(rs.getString("mcontent"));
			message.setMobjid(rs.getInt("mobjid"));
			message.setMobjtitle(rs.getString("mobjtitle"));
			message.setMobjtype(rs.getInt("mobjtype"));
			list.add(message);
		}
		conn.close();
		ps.close();
		rs.close();
		return list;

	}
	

	public boolean insert(MessageInfo message) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;

		conn = C3P0JdbcUtil.getConnection();
		// conn=C3P0JdbcUtil.getConnection();
		String sql = "insert into MessageInfo(uid,username,mcontent,mobjid,mobjtitle,mobjtype) values(?,?,?,?,?,?)";

		ps = conn.prepareStatement(sql);
		ps.setInt(1, message.getUid());
		ps.setString(2, message.getUsername());
		ps.setString(3, message.getMcontent());
		ps.setInt(4, message.getMobjid());
		ps.setString(5, message.getMobjtitle());
		ps.setInt(6, message.getMobjtype());
		ps.executeUpdate();
		System.out.println("2");
		conn.close();
		ps.close();

		return true;

	}

	public boolean delete(int mid) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;

		conn = C3P0JdbcUtil.getConnection();
		// conn=C3P0JdbcUtil.getConnection();
		String sql = "delete from MessageInfo where mid=?";

		ps = conn.prepareStatement(sql);
		ps.setInt(1, mid);
		ps.executeUpdate();
		conn.close();
		ps.close();
		return true;

	}

	public boolean update(MessageInfo message) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "UPDATE MessageInfo SET mdate=?, mcontent=? WHERE uid=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, message.getMdate());
		ps.setString(2, message.getMcontent());
		ps.setInt(3, message.getUid());
		ps.executeUpdate();
		conn.close();
		ps.close();
		return true;
	}

	

}
