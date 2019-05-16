package com.cafe24.mysite.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cafe24.web.WebUtil;

@WebServlet(value= "", initParams = @WebInitParam(name="config", value="/WEB-INF/servlet-context.xml"))
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		String configPath = getServletConfig().getInitParameter("config");
		System.out.println("init() called:" + configPath);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WebUtil.forward(request, response, "/WEB-INF/views/main/index.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
