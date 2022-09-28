package com.atguigu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		System.out.println("在Servlet2(櫃台2)中查看參數(材料)： "+ username);
		
		Object key1 = req.getAttribute("key1");
		System.out.println("在櫃台1是否有章： "+ key1);
		
		System.out.println("Servlet2 處裡自己的業務");
	}

}
