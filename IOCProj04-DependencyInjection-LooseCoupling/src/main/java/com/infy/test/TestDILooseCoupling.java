package com.infy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.beans.Flipkart;

public class TestDILooseCoupling {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/infy/cfgs/applicationContext.xml");
		Flipkart bean = ctx.getBean("fpkt", Flipkart.class);
		bean.shopping(new String[] { "pant", "belt", "saree"});
		((AbstractApplicationContext) ctx).close();
	}
}
