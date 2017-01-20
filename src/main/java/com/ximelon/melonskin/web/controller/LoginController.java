package com.ximelon.melonskin.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ximelon.melonskin.data.User;
import com.ximelon.melonskin.data.wxapp.Token;
import com.ximelon.melonskin.web.bean.LoginCommand;
import com.ximelon.melonskin.web.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private Token token;
	
	@RequestMapping(value="/index.html")
	public String loginPage() {
		System.out.println("============login: " + token.getAccessToken());
		return "login";
	}
	
	@RequestMapping(value="/loginCheck.html")
	public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand) {
		boolean isValidUser = userService.hasMatchUser(loginCommand.getUserName(), loginCommand.getPassword());
		
		if(!isValidUser) {
			return new ModelAndView("login", "error", "用户名或密码错误");
		}else {
			User user = userService.findUserByUserName(loginCommand.getUserName());
			user.setLastIp(request.getRemoteAddr());
			user.setLastVisit(new Date());
			userService.loginSuccess(user);
			
			request.getSession().setAttribute("user", user);
			return new ModelAndView("main");
		}
		
	}

}
