package cn.zzl.javabean;
/**
 * 收藏javabean
 * @author 28628
 *
 */
public class collect {
	int id;
	String user_id;
	String product;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public collect(int id, String user_id, String product) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.product = product;
	}
	public Object getProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
