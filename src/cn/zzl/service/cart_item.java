package cn.zzl.service;

import java.sql.SQLException;
import java.util.ArrayList;

public class cart_item {

	public String getCartItem(String uname) throws SQLException {
		//通过用户名获取用户手机号
		String phone=new cn.zzl.dao.user().getPhone(uname);
		//通过手机号,获取购物车商品编号,和数量的集合
		ArrayList<cn.zzl.javabean.cart_item> cart_items=new cn.zzl.dao.cart_item().getProductAndCount(phone);
		//便利购物车列表
		String str="";
		for (cn.zzl.javabean.cart_item cart_item : cart_items) {
			//通过商品编号获取商品信息
			cn.zzl.javabean.book book=new cn.zzl.dao.book().getbook(cart_item.getProduct());
			
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
			 str += "                        <div class=\"pudc_information\" id=\""+cart_item.getRid()+"\">";
			 str += "                            <img src=\"../img/goods/"+book.getIsbn()+"/detail1.jpg\" class=\"lf\"/>";
			 str += "                            <input type=\"hidden\" name=\"\" value=\"\">";
			 str += "                        <span class=\"des lf\">";
			 str += "                         "+book.getTitle()+"";
			 str += "                              <input type=\"hidden\" name=\"\" value=\"\">";
			 str += "                        </span>";
			 str += "                            <p class=\"col lf\"><span>作者：</span><span class=\"color_des\">"+book.getAuthor()+" <input type=\"hidden\" name=\"\" value=\"\"></span></p>";
			 str += "                        </div>";
			 str += "                    </div>";
			 str += "                    <div class=\"pices\">";
			 str += "                        <p class=\"pices_des\"></p>";
			 str += "                        <p class=\"pices_information\"><b>￥</b><span>"+book.getPrice()+"<input type=\"hidden\" name=\"\" value=\"\"></span></p>";
			 str += "                    </div>";
			 str += "                    <div class=\"num\"><span class=\"reduc\">&nbsp;-&nbsp;</span><input type=\"text\" value=\""+cart_item.getCount()+"\" ><span class=\"add\">&nbsp;+&nbsp;</span></div>";
			 str += "                    <div class=\"totle\">";
			 str += "                        <span>￥</span>";
			 str += "                        <span class=\"totle_information\">49.8</span>";
			 str += "                    </div>";
			 str += "                    <div class=\"del\">";
			 str += "                        <a href=\"javascript:;\" class=\"del_d\">删除</a>";
			 str += "                    </div>";
			 str += "                </div>";

		}
		
		return str;
	}

	public boolean updataProductCount(String id, String count) throws SQLException {

		//调用dao层,实现数据的更新
		if(new cn.zzl.dao.cart_item().UpdataProductCount(id,count))return true;
		return false;
	}

	public boolean addCart(String uname, String product) throws SQLException {
		//通过用户名获取用户的手机号(编号)
		String user_id=new cn.zzl.dao.user().getPhone(uname);
		//查询一下是否存在这本书
		//向collect数据表中添加信息
		if(new cn.zzl.dao.collect().ifExists(user_id,product))return new cn.zzl.dao.cart_item().addCart(user_id,product);
		return false;
	}

	public boolean addToCart(String uname, String product, String count) throws SQLException {
		//通过用户名获取用户的手机号(编号)
		String user_id=new cn.zzl.dao.user().getPhone(uname);
		//查询一下是否存在这本书
		//向cart数据表中添加信息
		if(new cn.zzl.dao.cart_item().ifExists(user_id,product))return new cn.zzl.dao.cart_item().addCart(user_id,product,count);
		return false;
	}

}
