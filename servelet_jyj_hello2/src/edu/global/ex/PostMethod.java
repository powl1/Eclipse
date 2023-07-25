package edu.global.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/post") // 경로지정 : url에 포스트를 치면 이 밑에있는걸 실행해라
public class PostMethod extends HttpServlet { // 상속받음=doGet,doPost오버라이딩 하기 위해
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PostMethod() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	// (2)두번째 - get방식호출 =tomcat이 알아서 > 서버에 있는 모든 정보를 자바에서 사용하기 쉽도록 request객체로 바꿔줌
	// >받은 정보들을 response객체로 해서String형태로제출해줌
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// System.out.println("Hello World!!");

		response.setContentType("text/html; charset=UTF-8");  // 폰트깨지니까 타입지정
		PrintWriter writer = response.getWriter(); // response객체안에있는 걸로, 빨대 꽂음

		writer.println("<html>"); // 웹브라우저에 빨대꽂았으니 거기서 출력됨
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>메인입니다</h1>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	// (3)세번째 - post방식호출 =tomcat이 알아서
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("포스트 방식입니다.");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter(); // response객체안에있는 걸로, 빨대 꽂음

		writer.println("<html>");  // 웹브라우저에 빨대꽂았으니 거기서 출력됨
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>포스트방식입니다</h1>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	}

}
