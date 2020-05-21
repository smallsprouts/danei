package cn.zzl.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import cn.zzl.service.collect;
import cn.zzl.service.user;

public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public UserLogin() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @deprecated 检测用户密码是否正确
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取用户名称
		String uname = request.getParameter("uname");
		// 获取用户密码
		String upwd = request.getParameter("upwd");
		// 调用dao查询用户信息
		user user = new user();
		// 用户存在就返回yes 不存在就返回no
	
			try {
				if (user.userLoginCheck(uname,upwd))
				{
					//首先返回登录成功
					response.getWriter().append("yes");
					//建立会话
					HttpSession session=request.getSession();
					session.setAttribute("uname", uname);
					//获取用户所有相关的信息
					//1,用户的收藏
					//2,将收藏信息存到session中去
					session.setAttribute("collect_list",new cn.zzl.service.collect().user_collect(uname));
				}
				else
					response.getWriter().append("no");
			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
