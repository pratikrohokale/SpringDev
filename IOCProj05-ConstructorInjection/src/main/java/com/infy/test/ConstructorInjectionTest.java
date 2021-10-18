package com.infy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.beans.Student;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/infy/cfgs/applicationContext.xml");
		Student bean = ctx.getBean("student", Student.class);
		bean.showDetails();
		((AbstractApplicationContext) ctx).close();
	}
}
