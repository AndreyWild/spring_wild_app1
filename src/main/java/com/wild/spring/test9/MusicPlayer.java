package com.wild.spring.test9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    @Autowired // Можно внедрять зависимость через поле
    @Qualifier("classic") // какой конкретно бин внедряем
    private Music music1;

    @Autowired
    @Qualifier("rock")
    private Music music2;


    // Inversion of Control
//    @Autowired // Можно внедрять зависимость через конструктор
//    public MusicPlayer(@Qualifier("rock") Music music) {
//        this.music = music;
//    }


//    @Autowired // Можно внедрять зависимость через сеттер
//    public void setMusic(@Qualifier("classic") Music music) {
//        this.music = music;
//    }
//
//    //@Autowired // Можно внедрять зависимость через метод с любым названием
//    public void sxdgfdfg(Music music) {
//        this.music = music;
//    }


    public void playMusic(Genres genres) {
        Random random = new Random();
        int randomSong = random.nextInt(3);
        if(genres == Genres.CLASSICAL){
            System.out.println("Play: " + music1.getSong()[randomSong]);
        } else {
            System.out.println("Play: " + music2.getSong()[randomSong]);
        }

    }

}
