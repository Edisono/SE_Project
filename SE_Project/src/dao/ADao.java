package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.C3P0JdbcUtil;
import entity.AInfo;
import entity.MessageInfo;;

public class ADao {
	public List<AInfo> findAllA() throws SQLException{
		List<AInfo> list = new ArrayList<AInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		AInfo a = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM AInfo  order by aid desc";
		ps = conn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
			a = new AInfo();
			a.setAid(rs.getInt("aid"));
			a.setAtitle(rs.getString("atitle"));
			a.setAcontent(rs.getString("acontent"));
			a.setAdeadline(rs.getString("adeadline"));
			a.setPid(rs.getInt("pid"));
			a.setAcompany(rs.getString("acompany"));
			a.setAimage(rs.getString("aimage"));
			list.add(a);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public List<MessageInfo> getAMessage(int aId) throws SQLException{
		List<MessageInfo> list = new ArrayList<MessageInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		MessageInfo message= null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM MessageInfo WHERE mobjid=? and mobjtype=2 order by pid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, String.valueOf(aId));
		rs=ps.executeQuery();
		while(rs.next()) {
			message = new MessageInfo();
			message.setMid(rs.getInt("mid"));
			message.setUid(rs.getInt("uid"));
			message.setUsername(rs.getString("username"));
			message.setMdate(rs.getString("mdata"));
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
	
	public List<AInfo> findAByAcompany(String acompany) throws SQLException{
		List<AInfo> list = new ArrayList<AInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		AInfo a = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM AInfo WHERE acompany=? order by aid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, acompany);
		rs=ps.executeQuery();
		while(rs.next()) {
			a = new AInfo();
			a.setAid(rs.getInt("aid"));
			a.setAtitle(rs.getString("atitle"));
			a.setAcontent(rs.getString("acontent"));
			a.setAdeadline(rs.getString("adeadline"));
			a.setPid(rs.getInt("pid"));
			a.setAcompany(rs.getString("acompany"));
			a.setAimage(rs.getString("aimage"));
			list.add(a);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public List<AInfo> findAByAtitle(String title) throws SQLException{
		List<AInfo> list = new ArrayList<AInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		AInfo a = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM AInfo WHERE atitle=? order by aid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, title);
		rs=ps.executeQuery();
		while(rs.next()) {
			a = new AInfo();
			a.setAid(rs.getInt("aid"));
			a.setAtitle(rs.getString("atitle"));
			a.setAcontent(rs.getString("acontent"));
			a.setAdeadline(rs.getString("adeadline"));
			a.setPid(rs.getInt("pid"));
			a.setAcompany(rs.getString("acompany"));
			a.setAimage(rs.getString("aimage"));
			list.add(a);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public List<AInfo> findALikeTitle(String likeTitle) throws SQLException{
		List<AInfo> list = new ArrayList<AInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		AInfo a = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM AInfo WHERE atitle like ? order by aid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, likeTitle);
		rs=ps.executeQuery();
		while(rs.next()) {
			a = new AInfo();
			a.setAid(rs.getInt("aid"));
			a.setAtitle(rs.getString("atitle"));
			a.setAcontent(rs.getString("acontent"));
			a.setAdeadline(rs.getString("adeadline"));
			a.setPid(rs.getInt("pid"));
			a.setAcompany(rs.getString("acompany"));
			a.setAimage(rs.getString("aimage"));
			list.add(a);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public AInfo findAById(int aid) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		AInfo a = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM AInfo WHERE qid=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, aid);
		rs=ps.executeQuery();
		while(rs.next()) {
			a = new AInfo();
			a.setAid(rs.getInt("aid"));
			a.setAtitle(rs.getString("atitle"));
			a.setAcontent(rs.getString("acontent"));
			a.setAdeadline(rs.getString("adeadline"));
			a.setPid(rs.getInt("pid"));
			a.setAcompany(rs.getString("acompany"));
			a.setAimage(rs.getString("aimage"));
		}	     
		conn.close();
		ps.close();
		rs.close();
		return a;
	}
	
	public boolean insertA(AInfo a) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "insert into AInfo(atitle,acontent,adeadline,pid,acompany,aimage) values(?,?,?,?,?,?)";
		ps = conn.prepareStatement(sql);
		ps.setString(1, a.getAtitle());
		ps.setString(2, a.getAcontent());
		ps.setString(3, a.getAdeadline());
		ps.setInt(4, a.getPid());
		ps.setString(5, a.getAcompany());
		ps.setString(6, a.getAimage());
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	public boolean deleteA(int aid) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "delete from AInfo where aid=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, aid);
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	public boolean updateA(AInfo a) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "UPDATE AInfo SET atitle=?, acontent=?, adeadline=? ,pid=?, aimage=? WHERE aid=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, a.getAtitle());
		ps.setString(2, a.getAcontent());
		ps.setString(3, a.getAdeadline());
		ps.setInt(4, a.getPid());
		ps.setString(5, a.getAimage());
		ps.setInt(6, a.getAid());
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
}
