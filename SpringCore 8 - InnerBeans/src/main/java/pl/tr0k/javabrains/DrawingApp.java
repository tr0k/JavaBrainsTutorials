package pl.tr0k.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tr0k on 2014-07-16.
 */
public class DrawingApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = context.getBean("triangle-alias", Triangle.class);
        triangle.draw();
    }

}