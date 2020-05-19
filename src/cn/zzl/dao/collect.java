package cn.zzl.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.zzl.utils.JDBCUtils;

public class collect {

	public ArrayList<cn.zzl.javabean.collect> getcollects(String uname) throws SQLException {
		//1,获取用户的id(用户的手机号)
		String user_id=new cn.zzl.dao.user().getuser_id(uname);
		//2,获取用户的的收藏信息
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		ArrayList<cn.zzl.javabean.collect> list=new ArrayList<cn.zzl.javabean.collect>();
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_collect", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("user_id").toString().equals(user_id)) {
				//如果是本人的收藏信息,那么就封装到一个javabean中
				list.add(new cn.zzl.javabean.collect((int)map.get("rid"), map.get("user_id").toString(), map.get("product").toString()));
			};
		}
		return list;
	}

}
