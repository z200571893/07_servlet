package com.atguigu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestAPIServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("URI => "+ req.getRequestURI());
		System.out.println("URL => "+ req.getRequestURL());
		System.out.println("客戶端 IP 地址 => "+ req.getRemoteHost());
		System.out.println("請求頭User-Agent => "+ req.getHeader("User-Agent"));
		System.out.println("請求方式 => "+ req.getMethod());
	}

}
