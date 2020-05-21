package cn.zzl.service;

import java.sql.SQLException;
import java.util.ArrayList;

import cn.zzl.javabean.book;

public class cart_item {

	public String getCart_item(String uname) throws SQLException {
		//通过用户姓名,获取用户手机号
		String user_id=new cn.zzl.dao.user().getuser_id(uname);
		//通过手机号,到cart_item数据表中获取 商品的编号	 和 商品的数量
		ArrayList<cn.zzl.javabean.cart_item> product_and_count=new cn.zzl.dao.cart_item().getProductAndCount(user_id);

		String str="";
		//遍历
		int i=1;
		for (cn.zzl.javabean.cart_item item : product_and_count) {
			//通过获取的商品编号,到book表中获取详细的书籍信息 isbn 就是商品编号
			cn.zzl.javabean.book book= new cn.zzl.dao.book().getbook(item.getProduct());
			
			//下面就是拼接详细的前端数据
			
			str += "<div class=\"imfor\">";
			str += "                    <div class=\"check\">";
			str += "                        <div class=\"Each\">";
			str += "                            <span class=\"normal\">";
			str += "                                <img src=\"../img/cart/product_normal.png\" alt=\"\"/>";
			str += "                            </span>";
			str += "                            <input type=\"hidden\" name=\"\" value=\"\">";
			str += "                        </div>";
			str += "                    </div>";
			str += "                    <div class=\"pudc\">";
			str += "                        <div class=\"pudc_information\" id=\""+item.getRid()+"\">";
			str += "                            <img src=\"../img/goods/"+book.getIsbn()+"/detail1.jpg\" class=\"lf\"/>";
			str += "                            <input type=\"hidden\" name=\"\" value=\"\">";
			str += "                        <span class=\"des lf\">";
			str += "                         "+book.getTitle()+"";
			str += "                              <input type=\"hidden\" name=\"\" value=\"\">";
			str += "                        </span>";
			str += "                            <p class=\"col lf\"><span>作者：</span><span class=\"color_des\">"+book.getAuthor()+"  <input type=\"hidden\" name=\"\" value=\"\"></span></p>";
			str += "                        </div>";
			str += "                    </div>";
			str += "                    <div class=\"pices\">";
			str += "                        <p class=\"pices_des\"></p>";
			str += "                        <p class=\"pices_information\"><b>￥</b><span>"+book.getPrice()+"<input type=\"hidden\" name=\"\" value=\"\"></span></p>";
			str += "                    </div>";
			str += "                    <div class=\"num\"><span class=\"reduc\">&nbsp;-&nbsp;</span><input type=\"text\" value=\""+item.getCount()+"\" ><span class=\"add\">&nbsp;+&nbsp;</span></div>";
			str += "                    <div class=\"totle\">";
			str += "                        <span>￥</span>";
			str += "                        <span class=\"totle_information\">49.8</span>";
			str += "                    </div>";
			str += "                    <div class=\"del\">";
			str += "                        <a href=\"javascript:;\" class=\"del_d\">删除</a>";
			str += "                    </div>";
			str += "                </div>";

			i++;
		}
		
		return str;
	}

	public boolean updataCount(int rid, int count) throws SQLException {
		if(new cn.zzl.dao.cart_item().updataCount(rid,count))return true;
		return false;
	}
	
}
