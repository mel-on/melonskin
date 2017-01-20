package com.melonskin.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.melonskin.data.LoginLog;

@Repository
public class LoginLogDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertLoginLog(LoginLog loginLog) {
		String sql = "INSERT INTO t_login_log(user_id, ip, login_datetime) VALUES(?, ?, ?) ";
		Object[] args = {loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDate()};
		jdbcTemplate.update(sql, args);
	}

}
