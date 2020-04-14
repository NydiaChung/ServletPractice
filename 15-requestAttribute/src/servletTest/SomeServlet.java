package servletTest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SomeServlet
 */
public class SomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//向请求中放入属性
		request.setAttribute("language", "java");
		request.setAttribute("tool", "eclipse");
		
		//从请求中删除指定域属性
		request.removeAttribute("tool");
		
		
		//将请求转发给OtherServlet
		RequestDispatcher rd = request.getRequestDispatcher("/other");
		rd.forward(request, response);
		
		System.out.println("someservlet执行了");
	}

}
