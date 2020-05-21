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

	public ArrayList<cn.zzl.javabean.cart_item> getProductAndCount(String user_id) throws SQLException {
		ArrayList<cn.zzl.javabean.cart_item> arrayList=new ArrayList<cn.zzl.javabean.cart_item>();
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_cart_item", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("user_id").toString().equals(user_id)) {
				//如果是本人的收藏信息,那么就封装到一个javabean中
				arrayList.add(new cn.zzl.javabean.cart_item(map.get("rid").toString(),map.get("user_id").toString(), map.get("product").toString(), map.get("count").toString()));
			};
		}
		return arrayList;
	}

	public boolean updataCount(int rid, int count) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_cart_item", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("rid").equals(rid)) {
				//如果找到了就执行更新语句
				String sql = "UPDATE `danei`.`tb_cart_item` SET `count` = ? WHERE `rid` = ?";
				//创建object数组
				Object[] params = {count,rid};
				//执行queryrunner的插入方法
				int row = qr.update(sql,params);
				if(row>0)return true;
			};
		}
		return false;
	}


}
