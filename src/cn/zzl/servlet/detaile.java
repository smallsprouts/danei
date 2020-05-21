package cn.zzl.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zzl.javabean.book;

/**
 * Servlet implementation class detaile
 */
public class detaile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public detaile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//先获取书籍的isbn
		String isbn=request.getParameter("book_isbn");
		//在从数据库中获取book对象
		try {
			cn.zzl.javabean.book book=new cn.zzl.dao.book().getbook(isbn);
			request.setAttribute("book",book);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		request.getRequestDispatcher("/user/page/detail.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
