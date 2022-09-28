package com.atguigu.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParameterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String[] hobby = req.getParameterValues("hobby");
		System.out.println("用戶名： "+ username);
		System.out.println("密碼： "+ password);
		System.out.println("興趣愛好： "+ Arrays.asList(hobby));
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		System.out.println("--------------doPost--------------");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String[] hobby = req.getParameterValues("hobby");
		System.out.println("用戶名： "+ username);
		System.out.println("密碼： "+ password);
		System.out.println("興趣愛好： "+ Arrays.asList(hobby));
		
	}

}
