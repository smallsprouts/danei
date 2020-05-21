package cn.zzl.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.zzl.utils.JDBCUtils;

public class oder {

	public ArrayList<cn.zzl.javabean.oder> getOderList(String user_id) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		ArrayList<cn.zzl.javabean.oder> list=new ArrayList<cn.zzl.javabean.oder>();
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_order", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("user_id").toString().equals(user_id)) {
				list.add(new cn.zzl.javabean.oder(map.get("rid").toString(), map.get("user_id").toString(), map.get("order_id").toString(), map.get("sta").toString(), map.get("address_id").toString(), map.get("payment").toString(), map.get("placed").toString(), map.get("receipt").toString(), map.get("deliver").toString(), map.get("handover").toString()));
			};
		}
		return list;
	}

}
