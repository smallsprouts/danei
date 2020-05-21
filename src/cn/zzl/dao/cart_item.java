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

}
