package test2;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex1/test_attr/send")
public class Send extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public Send() {
		super();
	}
	
	protected void doPost(HttpServletRequest request,
						 HttpServletResponse response)
					throws ServletException, IOException{

		request.setCharacterEncoding("euc-kr");

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String jumin1 = request.getParameter("jumin1");
		String jumin2 = request.getParameter("jumin2");
		String email = request.getParameter("email");
		String domain = request.getParameter("domain");
		String gender = request.getParameter("gender");		
		String post1 = request.getParameter("post1");
		String address = request.getParameter("address");
		String intro = request.getParameter("intro");
		String gender_result = "����";
		if (gender.equals("f"))
			gender_result = "����";
		
		String[] hobby = request.getParameterValues("hobby");		
		String hobby_result = "";
		for(int num=0; num<hobby.length; num++) {
			hobby_result += hobby[num] + "  ";
		}
		
		request.setAttribute("id", id);
		request.setAttribute("pass", pass);
		request.setAttribute("jumin", jumin1 + "-" + jumin2);
		request.setAttribute("email", email + "@" + domain);
		request.setAttribute("gender", gender_result);
		request.setAttribute("hobby", hobby_result);
		request.setAttribute("post1", post1);
		request.setAttribute("address", address);
		request.setAttribute("intro", intro);
		
		//response.sendRedirect("redirect.jsp");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ex1/test_attr/view.jsp");
		
		dispatcher.forward(request, response);

	}
	

}