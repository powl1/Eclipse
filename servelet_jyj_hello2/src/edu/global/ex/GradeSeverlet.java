package edu.global.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.shape.Circle;
import edu.global.ex.shape.Grade;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/grade")
public class GradeSeverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String Int;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GradeSeverlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param kor 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int kor = Integer.valueOf(request.getParameter("kor")); // 모든 정보는 String 으로 받아야한다.
		int eng = Integer.valueOf(request.getParameter("eng"));
		int math = Integer.valueOf(request.getParameter("math"));
		Grade grade = new Grade(kor, eng, math);
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();

		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		// writer.println("<h1> 넓이 : " + area + "</h1>");
		writer.println("<h1> 성적표</h1>");
		writer.println("<h2> 국어 : " + kor + "점</h2>");
		writer.println("<h2> 영어 : " + eng + "점</h2>");
		writer.println("<h2> 수학 : " + math + "점</h2>");
		writer.println("<h2> 총점 : " + grade.sum + "점</h2>");
		writer.println("<h2> 성적 : " + grade.getGrade() + "</h2>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
