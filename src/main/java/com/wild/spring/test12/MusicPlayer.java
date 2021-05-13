package com.wild.spring.test12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MusicPlayer {
    private Music music1;
    private Music music2;


    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    public MusicPlayer(@Qualifier("classic") Music music1, @Qualifier("rock") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Plying: " + music1.getSong() + ", " + music2.getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //    @Override
//    public String toString() {
//        return "MusicPlayer{" +
//                "name='" + name + '\'' +
//                ", volume=" + volume +
//                '}';
//    }
}
