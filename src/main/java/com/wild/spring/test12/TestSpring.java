package com.wild.spring.test12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  context=
                new AnnotationConfigApplicationContext(SpringConfig.class);


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}
