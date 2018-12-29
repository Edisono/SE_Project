package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import java.util.List;

import db.C3P0JdbcUtil;
import entity.ExhibitInfo;;

public class ExhibitDao {
	public List<ExhibitInfo> findAllExhibit() throws SQLException{
		List<ExhibitInfo> list = new ArrayList<ExhibitInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ExhibitInfo exhibit = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM ExhibitInfo  order by eid desc";
		ps = conn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
			exhibit = new ExhibitInfo();
			exhibit.setEid(rs.getInt("eid"));
			exhibit.setEtitle(rs.getString("etitle"));
			exhibit.setEcontent(rs.getString("econtent"));
			exhibit.setEtime(rs.getString("etime"));
			exhibit.setUid(rs.getInt("uid"));
			exhibit.setUsername(rs.getString("username"));
			exhibit.setEimage(rs.getString("eimage"));
			list.add(exhibit);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public List<ExhibitInfo> findExhibitByUid(int uid) throws SQLException{
		List<ExhibitInfo> list = new ArrayList<ExhibitInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ExhibitInfo exhibit = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM ExhibitInfo WHERE uid=? order by eid desc";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, uid);
		rs=ps.executeQuery();
		while(rs.next()) {
			exhibit = new ExhibitInfo();
			exhibit.setEid(rs.getInt("eid"));
			exhibit.setEtitle(rs.getString("etitle"));
			exhibit.setEcontent(rs.getString("econtent"));
			exhibit.setEtime(rs.getString("etime"));
			exhibit.setUid(rs.getInt("uid"));
			exhibit.setUsername(rs.getString("username"));
			exhibit.setEimage(rs.getString("eimage"));
			list.add(exhibit);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public List<ExhibitInfo> findExhibitByEtitle(String title) throws SQLException{
		List<ExhibitInfo> list = new ArrayList<ExhibitInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ExhibitInfo exhibit = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM ExhibitInfo WHERE etitle=? order by eid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, title);
		rs=ps.executeQuery();
		while(rs.next()) {
			exhibit = new ExhibitInfo();
			exhibit.setEid(rs.getInt("eid"));
			exhibit.setEtitle(rs.getString("etitle"));
			exhibit.setEcontent(rs.getString("econtent"));
			exhibit.setEtime(rs.getString("etime"));
			exhibit.setUid(rs.getInt("uid"));
			exhibit.setUsername(rs.getString("username"));
			exhibit.setEimage(rs.getString("eimage"));
			list.add(exhibit);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public List<ExhibitInfo> findExhibitLikeTitle(String likeTitle) throws SQLException{
		List<ExhibitInfo> list = new ArrayList<ExhibitInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ExhibitInfo exhibit = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM ExhibitInfo WHERE etitle like ? order by eid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, likeTitle);
		rs=ps.executeQuery();
		while(rs.next()) {
			exhibit = new ExhibitInfo();
			exhibit.setEid(rs.getInt("eid"));
			exhibit.setEtitle(rs.getString("etitle"));
			exhibit.setEcontent(rs.getString("econtent"));
			exhibit.setEtime(rs.getString("etime"));
			exhibit.setUid(rs.getInt("uid"));
			exhibit.setUsername(rs.getString("username"));
			exhibit.setEimage(rs.getString("eimage"));
			list.add(exhibit);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public ExhibitInfo findExhibitById(int eid) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ExhibitInfo exhibit = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM ExhibitInfo WHERE eid=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, eid);
		rs=ps.executeQuery();
		while(rs.next()) {
			exhibit = new ExhibitInfo();
			exhibit.setEid(rs.getInt("eid"));
			exhibit.setEtitle(rs.getString("etitle"));
			exhibit.setEcontent(rs.getString("econtent"));
			exhibit.setEtime(rs.getString("etime"));
			exhibit.setUid(rs.getInt("uid"));
			exhibit.setUsername(rs.getString("username"));
			exhibit.setEimage(rs.getString("eimage"));
		}	     
		conn.close();
		ps.close();
		rs.close();
		return exhibit;
	}
	
	public boolean insertExhibit(ExhibitInfo exhibit) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "insert into ExhibitInfo(etitle,econtent,uid,username,eimage) values(?,?,?,?,?)";
		ps = conn.prepareStatement(sql);
		ps.setString(1, exhibit.getEtitle());
		ps.setString(2, exhibit.getEcontent());
		ps.setInt(3, exhibit.getUid());
		ps.setString(4, exhibit.getUsername());
		ps.setString(5, exhibit.getEimage());
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	public boolean deleteExhibit(int eid) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "delete from ExhibitInfo where eid=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, eid);
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	public boolean updateExhibit(ExhibitInfo exhibit) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "UPDATE ExhibitInfo SET etitle=?, econtent=?, etime=? , eimage=? WHERE eid=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, exhibit.getEtitle());
		ps.setString(2, exhibit.getEcontent());
		ps.setInt(3, exhibit.getUid());
		ps.setString(4, exhibit.getEimage());
		ps.setString(5, exhibit.getUsername());
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	
}
