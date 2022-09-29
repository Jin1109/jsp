package _1.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8088/JSP/ex1/_1.login/lifeCycleTest
@WebServlet("/ex1/_1.login/LifeCycleTest")
public class LifeCycleTest_get extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response)
					throws ServletException, IOException {
		//응답하는 데이터 답입이 html타입이고
		//charset=euc-kr로 지정하면서 응답되는 데이터들의 한글 처리를 한 부분입니다.
		response.setContentType("text/html;charset=euc-kr");
		
		//getParameter() 메서드 :
		//html의 태그 속성 중에서  "name=id,name=passwd"인 곳에서 입력한 후 전송되어 온 파라미터 값을 반환해 주는 메서드 입니다.
		//글라이언트에서 전송되어 오는 id라는 이름의 파라미터 값고
		//passwd라고 이름의 파라미터 값을 받는 부분입니다.
		//id=hiksyksyksy&passwd=1234
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		//문자열 단위로 response객체의 내용을 출력할 수 있는 출력 스트링을 생성한 부분입니다.
		PrintWriter out = response.getWriter();
		
		//getContextPath() : 웹 애플리켄이션 경로 정보를 반환합니다.
		//URL에서 포트번호와 슬래시 다음이 웹 애플리케이션 이름을 의미하며 이 값을 추출합니다.
		out.println("웹 애플리케이션 경로 정보: " + request.getContextPath());
		
		//응답에 id변수 값과 passwd변수 값을 출력하는 부분입니다.
		out.println("<br>" + "아이디="+id + "<br>");
		out.println("비밀번호="+passwd + "<br>");
		out.close();
	}

}
