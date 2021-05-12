package com.wild.spring.test7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext7.xml");

//        MusicPlayer musicPlayer =
//                context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playAllMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());



        context.close();


    }
}
