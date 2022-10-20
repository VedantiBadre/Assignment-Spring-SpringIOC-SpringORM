package com.springioc.assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springioc/assignment4/Config.xml");
		ConstrctMessage bean = context.getBean("cm",ConstrctMessage.class);
		System.out.println(bean);
}
}
 