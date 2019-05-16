package com.cafe24.mysite.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lc")
public class LifeCircleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init();
		//application > session > request > page 순으로 차이가 있음
		Map map = new HashMap();
		
		// init에서는 getServletContext로 정보를 얻어와서 application에 넣어준다. application은 톰캣이 꺼지기 전까지 작동한다.
		this.getServletContext().setAttribute("cacheUser", map);;
		System.out.println("init() called");
	}


	public void destroy() {
		System.out.println("destroy() called");
		super.destroy();
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() called");
		super.service(request, response);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget() called......");
		response.getWriter().println("<h1>Servlet Life Circle");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
