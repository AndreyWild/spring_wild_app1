package com.wild.spring.test4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext4.xml");


        // Получаем объект из контекста с уже внедренной зависимостью
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        System.out.println(firstMusicPlayer);
        firstMusicPlayer.setVolume(15);

        // По-умолчанию Singleton (англ. Одиночка) оба ссылаются на один объект
        // Prototype - при вызове бина создается нвоый объект
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        System.out.println(secondMusicPlayer);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        System.out.println(firstMusicPlayer == secondMusicPlayer);


        context.close();
    }
}
