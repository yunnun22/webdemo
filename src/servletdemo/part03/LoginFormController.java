package servletdemo.part03;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginForm")
public class LoginFormController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String path = "/servletview/part03/form.jsp";
	
	RequestDispatcher dis = req.getRequestDispatcher(path);
	dis.forward(req, resp);
		
	}
	
	

}
