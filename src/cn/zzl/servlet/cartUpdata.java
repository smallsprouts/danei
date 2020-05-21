package cn.zzl.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cartUpdata
 */
public class cartUpdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cartUpdata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取购物车id和商品的数量
		String id=request.getParameter("itemId");
		String count=request.getParameter("num");
		String method=request.getParameter("method");
		//判断执行的方法,这里只有数据库的更新,不判断
		//调用服务层
		try {
			if(new cn.zzl.service.cart_item().updataProductCount(id,count)) {
				//执行成功,刷新购物车的信息
				request.getSession().setAttribute("cart_list", new cn.zzl.service.cart_item().getCartItem(request.getSession().getAttribute("uname").toString()));
				//响应yes
				response.getWriter().print("yes");
			}
		} catch (SQLException e) {
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
