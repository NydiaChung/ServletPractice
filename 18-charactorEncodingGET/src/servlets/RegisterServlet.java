package servlets;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请求参数存放在Map中的
 * 这个Map的KEY为请求参数的名称，为String类型
 * 这个Map的value为请求参数的所有值，为String[]类型
 * 使用最多的是getParameter（）方法，其等价于getParameterValues()[0]
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取指定名称的请求参数值
		//getParameter("name")本质上等同于getParameter("name")[0]
		
		//这里接收到的name，其字符编码为ISO8859-1
		String name = request.getParameter("name");
		
		//对于请求中的中文乱码的万能解决方案
		
		//打撒：将name字符串按照原编码打散
		byte[] bytes = name.getBytes("ISO8859-1");
		//组装：将bytes字节数按照指定字符编码进行组装，组装为String
		name = new String(bytes,"UTF-8");
		String age = request.getParameter("age");
		
		System.out.println("name = "+name);
		System.out.println("age = "+age);
		
		
		//获取所有请求参数名称
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()){
			String eleName = names.nextElement();
			String eleValue = request.getParameter(eleName);
			System.out.println(eleName + " === " +eleValue);
		}
		
		//获取指定参数的所有值
		String[] hobby = request.getParameterValues("hobby");
		for (String h : hobby) {
			System.out.println(h);
		}
		
		//获取存放请求参数的Map
		Map<String, String[]> map = request.getParameterMap();
		for (String key : map.keySet()) {
			System.out.println(key + "========"+ request.getParameter(key));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
