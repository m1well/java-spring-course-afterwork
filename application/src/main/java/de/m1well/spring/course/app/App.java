package de.m1well.spring.course.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author: Michael Wellner<br/>
 * date: 23.09.17<br/>
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("de.m1well.spring.course");//This will load the configured components UserService, UserRepository,
        applicationContext.refresh();

        System.out.println(applicationContext);
    }
}
