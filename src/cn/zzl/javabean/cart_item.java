package cn.zzl.javabean;

public class cart_item {
	String rid;
	String user_id;
	String product;
	String count;
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
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
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public cart_item(String rid, String user_id, String product, String count) {
		super();
		this.rid = rid;
		this.user_id = user_id;
		this.product = product;
		this.count = count;
	}
	public cart_item(String rid, String product, String count) {
		this.rid = rid;
		this.product = product;
		this.count = count;
	}
}	
