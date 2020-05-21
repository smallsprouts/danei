package cn.zzl.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.zzl.utils.JDBCUtils;

public class oder_item {

	public cn.zzl.javabean.oder_item getOderItemByOderId(String oder_id) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_order_item", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("order_id").toString().equals(oder_id)) {
				//返回用户手机号
				return new cn.zzl.javabean.oder_item(map.get("rid").toString(), map.get("product").toString(), map.get("price").toString(), map.get("count").toString(), map.get("order_id").toString());
			};
		}
		return null;
	}

}
