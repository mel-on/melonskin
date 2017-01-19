package com.melonskin.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.melonskin.wxgzh.quartz.WxAccessToken;
import com.melonskin.wxgzh.util.SignUtil;

/**
 * 验证token
 * @author lijianfeng
 *
 */
@Controller
@RequestMapping("wxSignController")
public class WxSignController {
	
	private static Logger log = LoggerFactory.getLogger(WxSignController.class);
	
	private final static String ACCOUNT_TOKEN = "melonskin";
	
	@RequestMapping(value="wechat.html", method = RequestMethod.GET)
	public void wechatGet(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value = "signature") String signature,
			@RequestParam(value = "timestamp") String timestamp,
			@RequestParam(value = "nonce") String nonce,
			@RequestParam(value = "echostr") String echostr) {

		if (SignUtil.checkSignature(ACCOUNT_TOKEN, signature,timestamp, nonce)) {
			try {
				response.getWriter().print(echostr);
				log.info("公众号验证成功！！！！！");
			} catch (IOException e) {
				log.error("公众号验证失败，{}", e.getMessage());
				e.printStackTrace();
			}
		}
	}

//	@RequestMapping(params = "wechat", method = RequestMethod.POST)
//	public void wechatPost(HttpServletResponse response,
//			HttpServletRequest request) throws IOException {
//		String respMessage = wechatService.coreService(request);
//		PrintWriter out = response.getWriter();
//		out.print(respMessage);
//		out.close();
//	}

}
