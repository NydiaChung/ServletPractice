package servlets;

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
		StringBuffer requestURL = request.getRequestURL();
		System.out.println("requestURL = " + requestURL);
		
		String requestURI = request.getRequestURI();
		System.out.println("requestURI = " + requestURI);
		
		
		//获取当前路径的跟路径
		String contextPath = request.getContextPath();
		System.out.println("contextPath = " + contextPath);
		
		//获取客户端IP
		String remoteAddr = request.getRemoteAddr();
		System.out.println("clientIP = " + remoteAddr);
		
		//servletPath是url-pattern中的精确部分
		//pathInfo是url-pattern中的非精确部分
		String servletPath = request.getServletPath();
		System.out.println("servletPath = " + servletPath);
		String pathInfo = request.getPathInfo();
		System.out.println("pathIinfo = " + pathInfo);
		
	}	
}
