package com.wild.spring.test5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext5.xml");

        ClassicalMusic classicalMusic =
                context.getBean("musicBean", ClassicalMusic.class);


        System.out.println(classicalMusic.getSong());

        ClassicalMusic classicalMusic2 =
                context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic == classicalMusic2);

        context.close();
    }
}
