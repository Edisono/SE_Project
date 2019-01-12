package action;

import java.sql.SQLException;

import dao.NewsDao;
import dao.ProductDao;

public class ProductAction {

	private ProductDao nd=new ProductDao();

	public String show() throws SQLException{
		
	
		return "show";
	}
	
	public String showDetail() throws SQLException{
		

		return "showDetail";
	}
}
