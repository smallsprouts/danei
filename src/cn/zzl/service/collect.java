package cn.zzl.service;

import java.sql.SQLException;
import java.util.ArrayList;

import cn.zzl.javabean.book;

public class collect {
	
	
	public String user_collect(String uname) throws SQLException{
		cn.zzl.dao.collect collect=new cn.zzl.dao.collect();
		ArrayList<cn.zzl.javabean.collect> collett=collect.getcollects(uname);
		String str="";
		//要获取isbn 书名(title	) 价格	
		int i=1;
		for (cn.zzl.javabean.collect collect0ne : collett) {
			//通过collect中的商品编号获取图书的信息
			cn.zzl.javabean.book book=new cn.zzl.service.book().getbookInfo(collect0ne.getProduct());
			
			str += "<div class=\"lf\" id=\"d+"+i+"+\">";
			str += "                        <div class=\"img\">";
			str += "                            <a href=\"detail.html\">";
			str += "                            	<img src=\"../img/goods/"+book.getIsbn()+"/collect.jpg\" alt=\"\"/>";
			str += "                            </a>";
			str += "                        </div>";
			str += "                        <div class=\"describe\">";
			str += "                            <p>"+book.getTitle()+"</p>";
			str += "                            <span class=\"price\"><b>￥</b><span class=\"priceContent\">"+book.getPrice()+"</span></span>";
			str += "                            <span class=\"addCart\"><a href=\"detail.html\">查看</a></span>";
			str += "                            <span class=\"succee\" style=\"display: none\">";
			str += "                                 <img src=\"../img/myCollect/product_true.png\" alt=\"\"/>";
			str += "                                 <span>已移入购物车</span>";
			str += "                            </span>";
			str += "                        </div>";
			str += "                        <div class=\"mask\" style=\"display: none\">";
			str += "                            <div class=\"maskNormal\">";
			str += "                                <img src=\"../img/myCollect/product_normal_big.png\" alt=\"\"/>";
			str += "                            </div>";
			str += "                        </div>";
			str += "                    </div>";
			
			i++;
		}
//		System.out.println(str+"advbnads");
		return str;
	}
}
