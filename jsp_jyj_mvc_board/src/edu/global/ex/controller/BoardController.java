package edu.global.ex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.Command.BoardCommand;
import edu.global.ex.Command.BoardListCommand;

/**
 * Servlet implementation class BoarddController
 */
// 괄호 안을 *.do로 설정하는 이요 : .do로 들어오는 모든 것들은 webServlet에서 받아내겠다는 뜻
@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public BoardController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doGet 메소드를 탈 시에 console에 기록하기 위해 넣었다. (디버깅 위해)
		System.out.println("doGet() ..");
		actionDo(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doPost 메소드를 탈 시에 console에 기록하기 위해 넣었다. (디버깅 위해)
		System.out.println("doPost() ..");
		actionDo(request,response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// actionDo 메소드를 탈 시에 console에 기록하기 위해 넣었다. (디버깅 위해)
		System.out.println("actionDo() ..");
		// 모든것은 UTF-8
		request.setCharacterEncoding("UTF-8");
		
		String viewPage = null;
		BoardCommand command = null;
		
		// 위의 세 줄은 http://localhost:8282/jsp_board/list.do에서 list.do를 꺼내기 위한 코드들
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/list.do")) {
			// BCommand 인터페이스를 구현할 자손이므로 클래스 생성 必
			
			// execute 메소드는 BListCommand 에서 request, response 객체를 가져오는 것을 의미
			command = new BoardListCommand();
			command.execute(request, response);

			// 해당 request 객ㄱ체를 전달할 view 결정
			viewPage = "list.jsp";
		}
		
		/*
		    클라이언트에게 list.do는 list.jsp로 forwarding을 시키겠다는 의미이다.
		  forwarding은 BListCommand클래스에게 메모리를 올린 request, response 객체 정보를 list.jsp에서는 사용가능하다는 의미이다.
		  forwarding 될 떼까지 정보가 살아있기 때문이다.
		    고로 list.jsp에서 forEach 문을 사용하여 데이터를 꺼낼 수 있다.
		*/
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
