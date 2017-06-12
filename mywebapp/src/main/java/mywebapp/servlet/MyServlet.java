package mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mylibrary.SomeOtherClass;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<!DOCTYPE html>");
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>HELLO</h1>");
		writer.println("<h1>" + SomeOtherClass.getText() + "</h1>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
