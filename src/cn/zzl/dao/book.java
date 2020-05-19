package cn.zzl.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.zzl.utils.JDBCUtils;

public class book {

	public cn.zzl.javabean.book getbook(String isbn) throws SQLException {
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		cn.zzl.javabean.book book = null;
		List<java.util.Map<String,Object>> query=qr.query("select * from tb_book", new MapListHandler());
		for (Iterator iterator = query.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			if(map.get("isbn").toString().equals(isbn)) {
				//如果是本人的收藏信息,那么就封装到一个javabean中
				book=new cn.zzl.javabean.book(map.get("isbn").toString(),
						map.get("title").toString(),
						map.get("author").toString(),
						map.get("price").toString(),
						map.get("press").toString(),
						map.get("edition").toString(),
						map.get("published").toString(),
						map.get("pages").toString(),
						map.get("words").toString(),
						map.get("packaging").toString(),
						map.get("format").toString() ,
						map.get("form").toString());
				return book;
			};
		}
		return null;
	}

}
