package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.spi.NamingManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SomeServlet
 */
public class SomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		//解决中文乱码问题
		name = new String(name.getBytes("ISO8859-1"),"UTF-8");
		String age = request.getParameter("age");
		
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		
		//重定向，请求对象已经改变
		response.sendRedirect("OtherServlet?pname=zs&page=23");
		
		
	}

}
