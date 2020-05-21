package cn.zzl.service;

import java.sql.SQLException;
import java.util.ArrayList;

public class book {

	public cn.zzl.javabean.book getbookInfo(String  isbn) throws SQLException {
		//在这里调用dao的方法,返回一个book实例		
		return new cn.zzl.dao.book().getbook(isbn);
	}

	public String getBooks() throws SQLException {
		//获取书籍信息列表
		ArrayList<cn.zzl.javabean.book> books=new cn.zzl.dao.book().getAllbook();
		//处理这些信息
		String str="";
		int i=0,j=0;
		for (cn.zzl.javabean.book book : books) {
			if(j-i==0)
			str += "<div class=\"store_content\">";
			
			
			
			str += "";
			str += "        <div>";
			str += "            <a href=\"detail.jsp\"><img src=\"../img/goods/"+book.getIsbn()+"/index.jpg\" alt=\"\"/></a>";
			str += "            <p class=\"one\">"+book.getTitle()+"</p>";
			str += "            <p class=\"two\">";
			str += "                <span>";
			str += "                    价格：<span>￥"+book.getPrice()+"</span>";
			str += "                </span>";
			str += "            </p>";
			str += "            <p class=\"three\">";
			str += "                <span>";
			str += "                "+book.getPress()+"</span>";
			str += "                </span>";
			str += "            </p>";
			str += "        </div>";
			str += "";
			
			if(j-i==3) {
				j=0;
				str += "	    </div>";
				j--;
			}
			
			j++;
		}
		return str;
	}

}
