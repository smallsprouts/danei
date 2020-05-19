package cn.zzl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;


import cn.zzl.utils.JDBCUtils;

public class user {
	
	/**
	 * 检查用户是否存在
	 * @param uname
	 * @return
	 * @throws SQLException
	 */
	public boolean IfUserExists(String uname) throws SQLException {		
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_user", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("uname").toString().equals(uname))return true;
//			System.out.println(map.get("uname").toString());
		}
		return false;
	}

	public boolean IfLogin(String uname, String upwd) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_user", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("uname").toString().equals(uname)&&map.get("upwd").toString().equals(upwd))return true;
		}
		return false;
	}

	public boolean EmailCheck(String email) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_user", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("email").toString().equals(email))return true;
		}
		return false;
	}

	public boolean PhoneCheck(String phone) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_user", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("phone").toString().equals(phone))return true;
		}
		return false;
	}

	public void adduser(String uname, String upwd, String email, String phone) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		String sql = "INSERT INTO tb_user (uname,upwd,email,phone)values(?,?,?,?)";
		//创建object数组
		Object[] params = {uname,upwd,email,phone};
		//执行queryrunner的插入方法
		int row = qr.update(sql, params);
//		System.out.println(row);
	}
}
