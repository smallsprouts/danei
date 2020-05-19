package cn.zzl.service;

import java.sql.SQLException;

public class user {

	/**
	 * 查询用户是否存在
	 * 
	 * @param uname
	 * @return
	 * @throws SQLException
	 */
	public boolean unameCheck(String uname) throws SQLException {
		cn.zzl.dao.user user = new cn.zzl.dao.user();
		if (user.IfUserExists(uname))
			return true;
		return false;
	}

	/**
	 * 验证用户登录
	 * 
	 * @param uname
	 * @param upwd
	 * @return
	 * @throws SQLException
	 */
	public boolean userLoginCheck(String uname, String upwd) throws SQLException {
		cn.zzl.dao.user user = new cn.zzl.dao.user();
		if (user.IfLogin(uname, upwd))
			return true;
		return false;
	}

	public boolean emailCheck(String email) throws SQLException {
		cn.zzl.dao.user user = new cn.zzl.dao.user();
		if (user.EmailCheck(email))
			return true;
		return false;
	}

	public boolean PhoneCheck(String phone) throws SQLException {
		cn.zzl.dao.user user = new cn.zzl.dao.user();
		if (user.PhoneCheck(phone))
			return true;
		return false;
	}
}
