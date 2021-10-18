package com.infy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.beans.WishGenerator;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/infy/cfgs/applicationContext.xml");
		WishGenerator wishBean = ctx.getBean("wish", WishGenerator.class);
		System.out.println(wishBean.generateWishMsg());
		((AbstractApplicationContext) ctx).close();
	}
}
