package com.springorm.main.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.Dao.StudentDao;
import com.springorm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println( "Hello World!" );
         ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
         StudentDao studao=context.getBean("studentDao",StudentDao.class);
         Student stu=new Student(3,"Meera");
         int msg=studao.insert(stu);
         System.out.println(msg + "insertion done");
     }
    
}
