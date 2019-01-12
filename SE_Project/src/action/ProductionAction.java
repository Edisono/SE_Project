package action;

import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.struts2.ServletActionContext;

import dao.ProductDao;

import com.opensymphony.xwork2.ActionSupport;

import entity.MessageInfo;
import entity.ProductInfo;

public class ProductionAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProductDao pd = new ProductDao();
	private int pid;
	private String pname;
	private String ptype;
	private float pprice;
	private String pintroduce;
	private String pimage;
	private int puserid;
	private String pusername;
	private String searchcontent;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public float getPprice() {
		return pprice;
	}

	public void setPprice(float pprice) {
		this.pprice = pprice;
	}

	public String getPintroduce() {
		return pintroduce;
	}

	public void setPintroduce(String pintroduce) {
		this.pintroduce = pintroduce;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	public int getPuserid() {
		return puserid;
	}

	public void setPuserid(int puserid) {
		this.puserid = puserid;
	}

	public String getPusername() {
		return pusername;
	}

	public void setPusername(String pusername) {
		this.pusername = pusername;
	}

	public String getSearchcontent() {
		return searchcontent;
	}

	public void setSearchcontent(String searchcontent) {
		this.searchcontent = searchcontent;
	}

	public String showScience() throws SQLException {
		ArrayList<ProductInfo> ProductList = new ArrayList<ProductInfo>();
		String ptype = "科技";
		ProductList = (ArrayList<ProductInfo>) pd.findProductByTpye(ptype);
		ServletActionContext.getRequest().getSession().setAttribute("ProductList", ProductList);
		return "showScience";
	}

	public String showCartoon() throws SQLException {
		ArrayList<ProductInfo> ProductList = new ArrayList<ProductInfo>();
		String ptype = "动漫";
		ProductList = (ArrayList<ProductInfo>) pd.findProductByTpye(ptype);
		ServletActionContext.getRequest().getSession().setAttribute("ProductList", ProductList);
		return "showCartoon";
	}

	public String showVideo() throws SQLException {
		ArrayList<ProductInfo> ProductList = new ArrayList<ProductInfo>();
		String ptype = "影视";
		ProductList = (ArrayList<ProductInfo>) pd.findProductByTpye(ptype);
		ServletActionContext.getRequest().getSession().setAttribute("ProductList", ProductList);
		return "showVideo";
	}

	public String showAudio() throws SQLException {
		ArrayList<ProductInfo> ProductList = new ArrayList<ProductInfo>();
		String ptype = "音像";
		ProductList = (ArrayList<ProductInfo>) pd.findProductByTpye(ptype);
		ServletActionContext.getRequest().getSession().setAttribute("ProductList", ProductList);
		return "showAudio";
	}

	public String search() throws SQLException {
		ArrayList<ProductInfo> ProductList = new ArrayList<ProductInfo>();
		ProductList = (ArrayList<ProductInfo>) pd.findProductLikeName(searchcontent);
		ServletActionContext.getRequest().getSession().setAttribute("ProductList", ProductList);
		return "search";
	}

	public String showDetail() throws SQLException {
		ProductInfo ProductDetail = new ProductInfo();
		ProductDetail = pd.findProductById(pid);
		ServletActionContext.getRequest().getSession().setAttribute("ProductDetail", ProductDetail);
		System.out.println(pid);
		ArrayList<MessageInfo> ProductMessage = new ArrayList<MessageInfo>();
		ProductMessage = (ArrayList<MessageInfo>) pd.getProductMessage(pid);
		ServletActionContext.getRequest().getSession().setAttribute("ProductMessage", ProductMessage);
		return "showDetail";
	}

}
