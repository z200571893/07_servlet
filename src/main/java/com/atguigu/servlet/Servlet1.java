package com.atguigu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		System.out.println("在Servlet1(櫃台1)中查看參數(材料)： "+ username);
		
		req.setAttribute("key1","櫃台1的章");
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/form.html");
		requestDispatcher.forward(req, resp);
	}

}
