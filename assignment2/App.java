package com.springioc.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springioc/assignment2/Config.xml");
		PrintMessage e=(PrintMessage) context.getBean("print");
		System.out.println(e);
	}
}
