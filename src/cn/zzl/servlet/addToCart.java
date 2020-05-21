package cn.zzl.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addToCart
 */
public class addToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addToCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取用户名
		String uname=request.getSession().getAttribute("uname").toString();
//				System.out.println("name:"+uname);
		//获取商品编号
		String product=request.getParameter("product");
//				System.out.println(product);
		//获取商品数量
		String count=request.getParameter("count");
//				System.out.println(product);
		
		try {
			if(new cn.zzl.service.cart_item().addToCart(uname,product,count)){
				//添加收藏成功,刷新收藏列表
//				System.out.println("servlet sucssuc");
				request.getSession().setAttribute("cart_list", new cn.zzl.service.cart_item().getCartItem(uname));
				response.getWriter().print("yes");
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
