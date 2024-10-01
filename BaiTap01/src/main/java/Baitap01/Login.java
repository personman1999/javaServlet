package Baitap01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login07", urlPatterns = { "/Login" })
public class Login extends HttpServlet {


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
        String password = req.getParameter("password");
		
        if (username.equals("admin") && password.equals("123456")) {
			String context =req.getContextPath();
			resp.sendRedirect(context +"/welcom");
		}
	}
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        // Chuyển hướng về trang đăng nhập nếu có yêu cầu GET
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
}