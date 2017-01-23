package com.ximelon.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplicationContext {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		Car car = (Car)ctx.getBean("car");
		System.out.println(car.getColor());
	}

}
