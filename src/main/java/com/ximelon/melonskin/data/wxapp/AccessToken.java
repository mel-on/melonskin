package com.ximelon.melonskin.data.wxapp;

/**
 * 请求获取access_token带的参数
 * @author lijianfeng
 *
 */
public class AccessToken {
	
	private String appid;
	
	private String appsecret;
	
	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAppsecret() {
		return appsecret;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

}
