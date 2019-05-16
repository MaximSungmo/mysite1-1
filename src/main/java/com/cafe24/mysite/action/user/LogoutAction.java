package com.cafe24.mysite.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cafe24.web.WebUtil;
import com.cafe24.web.mvc.Action;

import com.cafe24.mysite.vo.UserVo;

public class LogoutAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		HttpSession session = request.getSession();

		if (session != null && session.getAttribute("authUser") != null) {
			// 로그아웃을 시키기 위해서 세션 아이디 없애는 중
			session.removeAttribute("authUser");
			session.invalidate();
		}
		WebUtil.redirect(request, response, request.getContextPath());
	}

}
