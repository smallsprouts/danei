package cn.zzl.service;

import java.sql.SQLException;
import java.util.ArrayList;

import cn.zzl.javabean.oder;

public class dindan {

	public String huoqudindan() throws SQLException {
		ArrayList<cn.zzl.javabean.oder> oderlist=new cn.zzl.dao.dindan().huoqudindan();
		String str="";
		for (oder oder_one : oderlist) {
			 
			 str += "<div id=\"orderItem\">";
			 str += "              <p class=\"orderItem_title\">";
			 str += "                 <span id=\"order_id\">";
			 str += "                     &nbsp;&nbsp;"+oder_one.getZuozhe()+":<a href=\"#\">12345678910</a>";
			 str += "                 </span>";
			 str += "                  &nbsp;&nbsp;成交时间："+oder_one.getBianhao()+"&nbsp;&nbsp;";
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
			 str += "                          <b><a href=\"#\"><img src=\"../img/goods/9787302383666/detail1.jpg\" /></a></b>";
			 str += "                          <b class=\"product_name lf\" >";
			 str += "                              <a href=\"\">MongoDB大数据处理权威指南 (第2版)</a>";
			 str += "                              <br/>";
			 str += "                          </b>";
			 str += "                          <b class=\"product_color \">";
			 str += "                              出版社：清华大学出版社";
			 str += "                          </b>";
			 str += "                      </li>";
			 str += "                      <li class=\"unit_price\">";
			 str += "                          专属价";
			 str += "                          <br/>";
			 str += "                          ￥29.90";
			 str += "                      </li>";
			 str += "                      <li class=\"count\">";
			 str += "                          1件";
			 str += "                      </li>";
			 str += "                      <li class=\"sale_support\">";
			 str += "                          退款/退货";
			 str += "                          <br/>";
			 str += "                          我要维权";
			 str += "                      </li>";
			 str += "                      <li class=\" payments_received\">";
			 str += "                          ￥29.90";
			 str += "                      </li>";
			 str += "                      <li class=\"trading_status\">";
			 str += "                          <img src=\"../img/myOrder/car.png\" alt=\"\"/>已发货";
			 str += "                          <br/>";
			 str += "                          <a href=\"order-info.jsp\">订单详情</a>";
			 str += "                      </li>";
			 str += "                      <li class=\"operate\">";
			 str += "                          <a href=\"confirmReceipt.jsp\">确认收货</a>";
			 str += "                      </li>";
			 str += "                  </ul>";
			 str += "              </div>";

		}
		
		return str;
	}

}
