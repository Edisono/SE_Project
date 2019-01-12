package action;

import java.sql.SQLException;

import dao.UserDao;

public class UserAction {

	private UserDao nd=new UserDao();

	public String modify() throws SQLException{
		
	
		return "modify";
	}
}
