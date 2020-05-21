package cn.zzl.javabean;

public class oder {
	String rid;
	String user_id;
	String oder_id;
	String sta;
	String address_id;
	String payment;
	String placed;
	String receipt;
	String deliver;
	String handover;
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
	public String getOder_id() {
		return oder_id;
	}
	public void setOder_id(String oder_id) {
		this.oder_id = oder_id;
	}
	public String getSta() {
		return sta;
	}
	public void setSta(String sta) {
		this.sta = sta;
	}
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getPlaced() {
		return placed;
	}
	public void setPlaced(String placed) {
		this.placed = placed;
	}
	public String getReceipt() {
		return receipt;
	}
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}
	public String getDeliver() {
		return deliver;
	}
	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}
	public String getHandover() {
		return handover;
	}
	public void setHandover(String handover) {
		this.handover = handover;
	}
	public oder(String rid, String user_id, String oder_id, String sta, String address_id, String payment,
			String placed, String receipt, String deliver, String handover) {
		super();
		this.rid = rid;
		this.user_id = user_id;
		this.oder_id = oder_id;
		this.sta = sta;
		this.address_id = address_id;
		this.payment = payment;
		this.placed = placed;
		this.receipt = receipt;
		this.deliver = deliver;
		this.handover = handover;
	}
	
}
