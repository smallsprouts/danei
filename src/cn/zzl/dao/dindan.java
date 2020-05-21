package cn.zzl.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.zzl.javabean.oder;
import cn.zzl.utils.JDBCUtils;

public class dindan {

	public ArrayList<cn.zzl.javabean.oder> huoqudindan() throws SQLException {
		ArrayList<cn.zzl.javabean.oder> oder=new ArrayList<oder>();
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_oder", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("user_id").toString().equals("user_id")) {
				oder.add(new cn.zzl.javabean.oder(map.get("oder_id").toString(),map.get("address_id")));
			};
//			System.out.println(map.get("uname").toString());
		}
		return oder;
	}

}
