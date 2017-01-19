package com.melonskin.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melonskin.web.dao.LoginLogDao;
import com.melonskin.web.dao.UserDao;
import com.melonskin.web.data.LoginLog;
import com.melonskin.web.data.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private LoginLogDao loginLogDao;
	
	public boolean hasMatchUser(String userName, String password) {
		int matchCout = userDao.getMatchCount(userName, password);
		return matchCout > 0;
	}
	
	public User findUserByUserName(String userName) {
		return userDao.findUserByUserName(userName);
	}
	
	public void loginSuccess(User user) {
		user.setCredits(5 + user.getCredits());
		LoginLog loginLog = new LoginLog();
		loginLog.setUserId(user.getUserId());
		loginLog.setIp(user.getLastIp());
		loginLog.setLoginDate(user.getLastVisit());
		
		userDao.updateLoginInfo(user);
		loginLogDao.insertLoginLog(loginLog);
	}

}
