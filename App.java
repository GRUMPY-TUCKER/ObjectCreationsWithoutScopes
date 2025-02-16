package org.maven;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates the container
        Alien obj = (Alien) context.getBean("alien1");
        obj.code();
        System.out.println(obj.age);
        System.out.println( "Hello World!" );
        Alien obj2 = (Alien) context.getBean("alien1");
        obj2.code();
        System.out.println(obj2.age);
        obj.age = 21;
        System.out.println(obj.age);
        System.out.println(obj2.age);
        Alien obj3 = (Alien) context.getBean("alien2");
        obj3.code();
        System.out.println(obj3.age);
        obj3.age = 90;
        System.out.println(obj3.age);
    }
}
