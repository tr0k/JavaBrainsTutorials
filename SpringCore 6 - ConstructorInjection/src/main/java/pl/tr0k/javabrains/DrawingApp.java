package pl.tr0k.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tr0k on 2014-07-16.
 */
public class DrawingApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Triangle triangle = context.getBean("triangle", Triangle.class);
        System.out.println("Triangle: ");
        triangle.draw();

        triangle = context.getBean("triangle1", Triangle.class);
        System.out.println("Triangle1: ");
        triangle.draw();

        triangle = context.getBean("triangle2", Triangle.class);
        System.out.println("Triangle2: ");
        triangle.draw();

        triangle = context.getBean("triangle3", Triangle.class);
        System.out.println("Triangle3: ");
        triangle.draw();

        triangle = context.getBean("triangleIndexes", Triangle.class);
        System.out.println("TriangleIndexes: ");
        triangle.draw();
    }

}