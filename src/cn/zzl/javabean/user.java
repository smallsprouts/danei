package cn.zzl.javabean;

public class user {
	String phone;
	String uname;
	String upwd;
	String email;
	String role;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public user(String phone, String uname, String upwd, String email, String role) {
		super();
		this.phone = phone;
		this.uname = uname;
		this.upwd = upwd;
		this.email = email;
		this.role = role;
	}
	
}
