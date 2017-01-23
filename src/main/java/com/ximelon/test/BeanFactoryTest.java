package com.ximelon.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.ximelon.melonskin.data.wxapp.AccessToken;

public class BeanFactoryTest {
	
	public static void main(String[] args) {
		ResourcePatternResolver resolve = new PathMatchingResourcePatternResolver();
		Resource res = resolve.getResource("classpath:applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		System.out.println("start");
		
		AccessToken at = (AccessToken)bf.getBean("accessToken");
		System.out.println(at.getAppid());
	}

}
