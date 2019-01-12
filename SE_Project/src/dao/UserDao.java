package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import db.*;
import entity.UserInfo;

public class UserDao {

	
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;

	public UserInfo checkLogin(ArrayList arr) {
		try {
			conn = C3P0JdbcUtil.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String email = (String) arr.get(0);
		String password = (String) arr.get(1);
		try {
			String sql = "select * from userinfo where email=? and password=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);

			rs = ps.executeQuery();

			UserInfo user = null;
			if (rs.next()) {
				user = new UserInfo();
				user.setAddress(rs.getString("address"));
				user.setAvator(rs.getString("avator"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setProfile(rs.getString("profile"));
				user.setQQ(rs.getString("QQ"));
				user.setSupplyCount(rs.getInt("supplyCount"));
				user.setUid(rs.getInt("uid"));
				user.setUsername(rs.getString("username"));
				user.setRole(rs.getInt("role"));

			}

			C3P0JdbcUtil.release(conn, ps, rs);
			return user;

		} catch (SQLException e) {
			return null;
		}
	}

	public boolean insertUser(UserInfo user) throws Exception {

		conn = C3P0JdbcUtil.getConnection();

		String sql = "insert userinfo values(?,?,?,?,?,?,?,?,?,?,?)";
		ps = conn.prepareStatement(sql);
		ps.setString(1,null);
		ps.setString(2, user.getEmail());
		ps.setString(3, user.getPassword());
		ps.setString(4, user.getPhone());
		ps.setString(5, user.getAddress());
		ps.setString(6, user.getUsername());
		ps.setString(7, user.getQQ());
		ps.setString(8, user.getProfile());
		ps.setInt(9, 1);
		ps.setString(10,null);
		ps.setString(11, user.getAvator());

		int i = ps.executeUpdate();

		C3P0JdbcUtil.release(conn, ps, rs);

		if (i != 0) {
			return true;
		}

		return false;
	}
	
	public String modify() throws SQLException{
		/*
		HttpServletRequest request = ServletActionContext.getRequest();
		UserInfo user = (UserInfo)request.getSession().getAttribute("user");
		
		request.getSession().setAttribute("user", user);	
		*/	
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		UserInfo user = new UserInfo();
		UserInfo u=(UserInfo)request.getSession().getAttribute("user");
		user.setUid(u.getUid());

		
		user.setEmail( request.getParameter("email"));
		user.setUsername(request.getParameter("username"));
		user.setQQ(request.getParameter("QQ"));
		user.setPhone(request.getParameter("phone"));
		user.setAddress(request.getParameter("address"));
		user.setProfile(request.getParameter("profile"));
		
		nd.update(user);

		request.getSession().setAttribute("user", user);
		return "modify";

		
	}
}
