package cn.zzl.service;

import java.sql.SQLException;

public class book {

	public cn.zzl.javabean.book getbookInfo(String  isbn) throws SQLException {
		//在这里调用dao的方法,返回一个book实例		
		return new cn.zzl.dao.book().getbook(isbn);
	}

}
