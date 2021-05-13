package com.wild.spring.test13;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(){
        Random random = new Random();
        int randomSong = random.nextInt(3);


        return "Plying: " + musicList.get(randomSong).getSong();
    }



    //    @Override
//    public String toString() {
//        return "MusicPlayer{" +
//                "name='" + name + '\'' +
//                ", volume=" + volume +
//                '}';
//    }
}
