package com.springioc.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    		// TODO Auto-generated method stub
    		ApplicationContext context=new ClassPathXmlApplicationContext("com/springioc/assignment1/Config.xml");
    		Employee e=(Employee) context.getBean("employee");
    		System.out.println(e);

    	}
    
}
