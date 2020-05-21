package cn.zzl.javabean;

public class banner {
	String rid;
	String product;
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
	public banner(String rid, String product) {
		super();
		this.rid = rid;
		this.product = product;
	}
	
}
