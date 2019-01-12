package action;

import dao.NewsDao;

public class ProductAction {

	private ProductDao nd=new ProductDao();

	public String show() throws SQLException{
		
	
		return "show";
	}
	
	public String showDetail() throws SQLException{
		

		return "showDetail";
	}
}
