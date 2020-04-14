package servletTest;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OtherServlet
 */
public class OtherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//从请求中获得指定属性名的域属性
		String  language = (String) request.getAttribute("language");
		String  tool = (String) request.getAttribute("tool");
		System.out.println("language = " + language);
		System.out.println("tool = " + tool);
		
		//获取请求中的域属性
		Enumeration<String> names = request.getAttributeNames();
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			System.out.println(name + "====" + request.getAttribute(name));
		}
	}

}
