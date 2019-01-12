package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import java.util.List;



import db.C3P0JdbcUtil;
import entity.ProductInfo;
import entity.MessageInfo;

public class ProductDao {
	public List<ProductInfo> findAllProduct() throws SQLException{
		List<ProductInfo> list = new ArrayList<ProductInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ProductInfo product = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM ProductInfo order by pid desc";
		ps = conn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
			product = new ProductInfo();
			product.setPid(rs.getInt("pid"));
			product.setPname(rs.getString("pname"));
			product.setPtype(rs.getString("ptype"));
			product.setPprice(rs.getFloat("pprice"));
			product.setPintroduce(rs.getString("pintroduce"));
			product.setPimage(rs.getString("pimage"));
			list.add(product);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public List<MessageInfo> getProductMessage(int pId) throws SQLException{
		List<MessageInfo> list = new ArrayList<MessageInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		MessageInfo message= null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM MessageInfo WHERE mobjid=? and mobjtype=4 order by mobjid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, String.valueOf(pId));
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
	
	public List<ProductInfo> findProductByTpye(String type) throws SQLException{
		List<ProductInfo> list = new ArrayList<ProductInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ProductInfo product = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM ProductInfo WHERE ptype=? order by pid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, type);
		rs=ps.executeQuery();
		while(rs.next()) {
			product = new ProductInfo();
			product.setPid(rs.getInt("pid"));
			product.setPname(rs.getString("pname"));
			product.setPtype(rs.getString("ptype"));
			product.setPprice(rs.getFloat("pprice"));
			product.setPintroduce(rs.getString("pintroduce"));
			product.setPimage(rs.getString("pimage"));
			list.add(product);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public List<ProductInfo> findProductLikeName(String like) throws SQLException{
		List<ProductInfo> list = new ArrayList<ProductInfo>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ProductInfo product = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM ProductInfo WHERE pname like ? order by pid desc";
		ps = conn.prepareStatement(sql);
		ps.setString(1, "%"+like+"%");
		rs=ps.executeQuery();
		while(rs.next()) {
			product = new ProductInfo();
			product.setPid(rs.getInt("pid"));
			product.setPname(rs.getString("pname"));
			product.setPtype(rs.getString("ptype"));
			product.setPprice(rs.getFloat("pprice"));
			product.setPintroduce(rs.getString("pintroduce"));
			product.setPimage(rs.getString("pimage"));
			list.add(product);
		}	     
		conn.close();
		ps.close();
		rs.close();
		return list;
	}
	
	public ProductInfo findProductById(int pid) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ProductInfo product = null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "SELECT * FROM ProductInfo WHERE pid=? order by pid desc";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, pid);
		rs=ps.executeQuery();
		if(rs.next()) {
			product = new ProductInfo();
			product.setPid(rs.getInt("pid"));
			product.setPname(rs.getString("pname"));
			product.setPtype(rs.getString("ptype"));
			product.setPprice(rs.getFloat("pprice"));
			product.setPintroduce(rs.getString("pintroduce"));
			product.setPimage(rs.getString("pimage"));
		}	     
		conn.close();
		ps.close();
		rs.close();
		return product;
	}
	
	public boolean insertProduct(ProductInfo product) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "insert into ProductInfo(pname,ptype,pprice,pintroduce,pimage,uid,username) values(?,?,?,?,?,?,?)";
		ps = conn.prepareStatement(sql);
		ps.setString(1, product.getPname());
		ps.setString(2, product.getPtype());
		ps.setDouble(3, product.getPprice());
		ps.setString(4, product.getPintroduce());
		ps.setString(5, product.getPimage());
		ps.setInt(6, product.getPid());
		ps.setString(7, product.getPname());
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	public boolean deleteProduct(int pid) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "delete from ProductInfo where pid=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, pid);
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	public boolean updateProduct(ProductInfo product) throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		//conn=DBUtil.getConnection();
		conn=C3P0JdbcUtil.getConnection();
		String sql = "UPDATE ProductInfo SET pname=?, ptype=?, pprice=? ,pintroduce=?, pimage=? uid=? username=? WHERE pid=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, product.getPname());
		ps.setString(2, product.getPtype());
		ps.setDouble(3, product.getPprice());
		ps.setString(4, product.getPintroduce());
		ps.setString(5, product.getPimage());
		ps.setInt(6, product.getPid());
		ps.setString(7, product.getPname());
		ps.setInt(8, product.getPid());
		int flag = ps.executeUpdate();
		conn.close();
		ps.close();
		if (flag == 0) {
			return false;
		}
		return true;
	}
	
	
	
	
}
