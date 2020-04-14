package servlets;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		
		//设置响应的MIME类型,video/mp4,image/jpg
		//其中可以指定MIME的字符编码，即响应体的字符编码
		response.setContentType("text/html;charset=UTF-8");
		
		//必须在getWriter之前,setContentType()之后
		//setCharacterEncoding（）用于修改ContentType的MIME类型
		//response.setCharacterEncoding("UTF-8");
		//获取标准输出流
		PrintWriter out = response.getWriter();
		out.print("abc");
		out.println("def");
		out.write("ghi");
		out.println("中国北京");
		out.append("xyz");
		
		//输入输出流用完需关闭
		//对标准输出流的关闭
		out.close();
	}

}
