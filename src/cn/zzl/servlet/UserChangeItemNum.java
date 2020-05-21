package cn.zzl.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.zzl.service.cart_item;

/**
 * Servlet implementation class UserChangeItemNum
 */
public class UserChangeItemNum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserChangeItemNum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收 itemId 和 订单数
		String itemId=request.getParameter("itemId");
		String num=request.getParameter("num");
		
		int rid=Integer.valueOf(itemId);
		int count=Integer.valueOf(num);
		
		//调用服务层 更新订单
		cn.zzl.service.cart_item cart=new cn.zzl.service.cart_item();
		try {
			if(cart.updataCount(rid,count))
			response.getWriter().append("yes");
			//更新好了就需要刷新储存在session的值(购物车)
			//建立会话
			HttpSession session=request.getSession();
			//获取用户购物车信息
			session.setAttribute("cart", new cn.zzl.service.cart_item().getCart_item(session.getAttribute("uname").toString()));
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
