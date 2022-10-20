package Springciiiiii.SpringCI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Second Spring using reference ");
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e=(Employee)context.getBean("empci");
		System.out.println(e);
	}

}
