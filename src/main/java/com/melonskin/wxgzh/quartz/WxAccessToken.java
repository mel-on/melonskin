package com.melonskin.wxgzh.quartz;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.melonskin.web.data.AccessToken;
import com.melonskin.web.data.Token;
import com.melonskin.wxgzh.util.TokenUtil;

/**
 * 2小时轮询一次，取 access_token
 * @author lijianfeng
 *
 */
@Component
public class WxAccessToken {
	
	private static Logger log = LoggerFactory.getLogger(WxAccessToken.class);
	
	@Autowired
	private AccessToken accessToken;
	
	@Autowired
	private Token token;

	@Scheduled(fixedDelay = 7200000)
	protected void execute() {
		try {
//			long ms = System.currentTimeMillis();
//			Token t = TokenUtil.getToken(accessToken.getAppid(), accessToken.getAppsecret());
//			token.setAccessToken(t.getAccessToken());
//			token.setExpiresIn(t.getExpiresIn());
//			log.info("{}: 获取access_token: {}", new Date(ms), token.getAccessToken());
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		WxAccessToken wx = new WxAccessToken();
		wx.execute();
	}

}
