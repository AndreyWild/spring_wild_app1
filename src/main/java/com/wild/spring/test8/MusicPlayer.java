package com.wild.spring.test8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    //@Autowired // Можно внедрять зависимость через поле
    //@Qualifier("rap") // какой конкретно бин внедряем
    private Music music;


    // Inversion of Control
//    @Autowired // Можно внедрять зависимость через конструктор
//    public MusicPlayer(@Qualifier("rock") Music music) {
//        this.music = music;
//    }


    @Autowired // Можно внедрять зависимость через сеттер
    public void setMusic(@Qualifier("classic") Music music) {
        this.music = music;
    }

    //@Autowired // Можно внедрять зависимость через метод с любым названием
    public void sxdgfdfg(Music music) {
        this.music = music;
    }


    public void playMusic() {
        System.out.println("Play: " + music.getSong());
    }

}
