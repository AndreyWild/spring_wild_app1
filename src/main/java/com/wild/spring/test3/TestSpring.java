package com.wild.spring.test3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext3.xml");

        // Из applicationContext вернется Classical либо Rock music
        //Music music = context.getBean("musicBean", Music.class);

        // Создаем объект и вручную записываем зависимость
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        // Получаем объект из контекста с уже внедренной зависимостью
        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer);

        // По-умолчанию Singleton (англ. Одиночка) оба ссылаются на один объект
        MusicPlayer musicPlayer2 = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer2.playMusic();
        System.out.println(musicPlayer2);

        System.out.println(musicPlayer.equals(musicPlayer2)); // true



        MusicPlayer musicPlayer3 = context.getBean("musicPlayerBeanList", MusicPlayer.class);
        musicPlayer3.playMusicList();
        System.out.println(musicPlayer3);





        context.close();
    }
}
