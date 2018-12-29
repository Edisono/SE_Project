package db;
import java.sql.*;

/**
 * ???��?��???��?��???��?��???��?��???��?��???��?��???��?��????�?��???��?��???��?��???��?�樱???��?��?��???��??Sql???��?��??�?
 * @author shuai
 *
 */
public class DBUtil {
	private static Connection conn=null;
	private static Statement st=null;
	
	//?????��?��???��?��???��?��???��?��???��?��?????��?��???��?��??�?��???��?��???��?��???��?��??�?
	public static Connection getConnection(){
		if(conn==null){
			try{
				conn=C3P0JdbcUtil.getConnection();
				}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return conn;
	}
	
	//?????��?��???��?��???��?��???��?��???��?��???��???��??Sql???��?��???��?��???��??
	public static  Statement getStatement(){
		if(st==null){
			try{
				Connection c=getConnection();
				st=c.createStatement();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return st;
	}
	
	//???��?��??�?Sql???��?��???��?��??�?Select???��?��??�?,???��?��???��?��???��?��????�??��????该�?��?��???��?��???��?��?��???��??
	public static ResultSet executeQuery(String sql){
		ResultSet set=null;
		try{
			Statement state=getStatement();
			set=state.executeQuery(sql);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return set;
	}
	
	//???��?��??�?Sql???��?��???��?��??�?insert,update,delete???��?��??�?,???��?��???��?��???��?��????�??��????该�?��?��???��?��???��?��?��???��??
	public static int executeUpdateInsertDelete(String sql){
		int i=0;
		try{
			Statement state=getStatement();
			i=state.executeUpdate(sql);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return i;
	}
	
	//?????��?��???��?��???��?��???��?��???��?��?????��?��???��?��???��?��???��?��??�?id????�??��?????��?��??�?�?
	public static int getMaxId(String tableName){
		StringBuffer sql=new StringBuffer();
		sql.append("select id from "+tableName+" order by id desc;");
		int i=0;
		ResultSet set=executeQuery(sql.toString());
		try{
			while(set.next()){
				i=set.getInt("id");
				break;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return i;
	} 
}
