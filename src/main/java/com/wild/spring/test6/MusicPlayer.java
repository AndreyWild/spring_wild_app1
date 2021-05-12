package com.wild.spring.test6;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public MusicPlayer() {
    }

    // Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(){
        System.out.println("Play: " + music.getSong());
    }

    public void playMusicList(){
        for (Music music : musicList){
            System.out.println("Play: " + music.getSong());
        }
    }

//    @Override
//    public String toString() {
//        return "MusicPlayer{" +
//                "name='" + name + '\'' +
//                ", volume=" + volume +
//                '}';
//    }
}
