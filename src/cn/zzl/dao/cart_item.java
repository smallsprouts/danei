package cn.zzl.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.zzl.utils.JDBCUtils;

public class cart_item {

	public ArrayList<cn.zzl.javabean.cart_item> getProductAndCount(String phone) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		ArrayList<cn.zzl.javabean.cart_item> list=new ArrayList<cn.zzl.javabean.cart_item>();
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_cart_item", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("user_id").toString().equals(phone)) {
				list.add(new cn.zzl.javabean.cart_item(map.get("rid").toString(),map.get("product").toString(),map.get("count").toString()));
			};
		}
		return list;
	}

	public boolean UpdataProductCount(String id, String count) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		String sql="UPDATE `danei`.`tb_cart_item` SET `count` = ? WHERE `rid` = ?";
		Object[] params= {count,id};
		int row=qr.update(sql, params);
		if(row>0)return true;
		return false;
	}

	public boolean addCart(String user_id, String product,String count) throws SQLException {
//		System.out.println("dao succes");
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		String sql="INSERT INTO `danei`.`tb_cart_item`(`user_id`, `product`,`count`) VALUES (?, ?,?)";
		Object[] params= {user_id,product,count};
		int row=qr.update(sql, params);
		if(row>0)return true;
		return false;
	}
	/**
	 * 写错了,这个是用来存到收藏的
	 * @param user_id
	 * @param product
	 * @return
	 * @throws SQLException
	 */
	public boolean addCart(String user_id, String product) throws SQLException {
//		System.out.println("dao succes");
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		String sql="INSERT INTO `danei`.`tb_collect`(`user_id`, `product`) VALUES (?, ?)";
		Object[] params= {user_id,product};
		int row=qr.update(sql, params);
//		System.out.println(row);
		if(row>0)return true;
		return false;
	}

	public boolean ifExists(String user_id, String product) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_cart_item", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("product").toString().equals(product)&&map.get("user_id").toString().equals(user_id)) {
				return false;
			};
		}
		return true;
	}

}
