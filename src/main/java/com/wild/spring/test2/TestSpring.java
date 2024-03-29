package com.wild.spring.test2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        // Из applicationContext вернется Classical либо Rock music
        //Music music = context.getBean("musicBean", Music.class);

        // Создаем объект и вручную записываем зависимость
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        // Получаем объект из контекста с уже внедренной зависимостью
        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusic();



        context.close();
    }
}
