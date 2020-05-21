package cn.zzl.javabean;

public class oder_item {
	String rid;
	String product;
	String price;
	String count;
	String oder_id;
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getOder_id() {
		return oder_id;
	}
	public void setOder_id(String oder_id) {
		this.oder_id = oder_id;
	}
	public oder_item(String rid, String product, String price, String count, String oder_id) {
		super();
		this.rid = rid;
		this.product = product;
		this.price = price;
		this.count = count;
		this.oder_id = oder_id;
	}
	
}
