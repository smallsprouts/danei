package cn.zzl.javabean;

public class address {
	String rid;
	String user_id;
	String address;
	String added;
	String receiver;
	String receiver_phone;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAdded() {
		return added;
	}
	public void setAdded(String added) {
		this.added = added;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getReceiver_phone() {
		return receiver_phone;
	}
	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}
	public address(String rid, String user_id, String address, String added, String receiver,
			String receiver_phone) {
		super();
		this.rid = rid;
		this.user_id = user_id;
		this.address = address;
		this.added = added;
		this.receiver = receiver;
		this.receiver_phone = receiver_phone;
	}
	
}
