package cn.zzl.service;

import java.sql.SQLException;
import java.util.ArrayList;

public class oder {

	public String getOderItems(String uname) throws SQLException {
		
		//通过用户名获取用户手机号
		String phone=new cn.zzl.dao.user().getPhone(uname);
		//更具用户的手机号,获取订单信息集合
		ArrayList<cn.zzl.javabean.oder> oderlist=new cn.zzl.dao.oder().getOderList(phone);
		//遍历订单信息
		String str="";
		for (cn.zzl.javabean.oder oder : oderlist) {
			//根据订单信息中的oder_id获取订单详情oder_item
			cn.zzl.javabean.oder_item oder_item=new cn.zzl.dao.oder_item().getOderItemByOderId(oder.getOder_id());
			//根据oder_item 中的商品编号获取商品信息
			cn.zzl.javabean.book book=new cn.zzl.dao.book().getbook(oder_item.getProduct());
			
			str += "<div id=\"orderItem\">";
			str += "              <p class=\"orderItem_title\">";
			str += "                 <span id=\"order_id\">";
			str += "                     &nbsp;&nbsp;订单编号:<a href=\"#\">"+oder.getOder_id()+"</a>";
			str += "                 </span>";
			str += "                  &nbsp;&nbsp;成交时间："+oder.getPlaced()+"&nbsp;&nbsp;";
			str += "                 <span>";
			str += "                     <a href=\"#\" class=\"servie\">";
			str += "                        联系客服<img src=\"../img/myOrder/kefuf.gif\"/>";
			str += "                      </a>";
			str += "                 </span>";
			str += "              </p>";
			str += "            </div>";
			str += "              <div id=\"orderItem_detail\">";
			str += "                  <ul>";
			str += "                      <li class=\"product\">";
			str += "                          <b><a href=\"#\"><img src=\"../img/goods/"+book.getIsbn()+"/detail1.jpg\" /></a></b>";
			str += "                          <b class=\"product_name lf\" >";
			str += "                              <a href=\"\">"+book.getTitle()+"</a>";
			str += "                              <br/>";
			str += "                          </b>";
			str += "                          <b class=\"product_color \">";
			str += "                              "+book.getPress()+"";
			str += "                          </b>";
			str += "                      </li>";
			str += "                      <li class=\"unit_price\">";
			str += "                          专属价";
			str += "                          <br/>";
			str += "                          ￥"+book.getPrice()+"";
			str += "                      </li>";
			str += "                      <li class=\"count\">";
			str += "                          "+oder_item.getCount()+"件";
			str += "                      </li>";
			str += "                      <li class=\"sale_support\">";
			str += "                          退款/退货";
			str += "                          <br/>";
			str += "                          我要维权";
			str += "                      </li>";
			str += "                      <li class=\" payments_received\">";
			str += "                          ￥"+oder.getPayment()+"";
			str += "                      </li>";
			str += "                      <li class=\"trading_status\">";
			str += "                          <img src=\"../img/myOrder/car.png\" alt=\"\"/>"+oder.getSta()+"";
			str += "                          <br/>";
			str += "                          <a href=\"order-info.html\">订单详情</a>";
			str += "                      </li>";
			str += "                      <li class=\"operate\">";
			str += "                          <a href=\"confirmReceipt.html\">确认收货</a>";
			str += "                      </li>";
			str += "                  </ul>";
			str += "              </div>";

		}
		
		return str;
	}

}
