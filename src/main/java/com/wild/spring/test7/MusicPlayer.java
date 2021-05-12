package com.wild.spring.test7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    //@Autowired // Можно внедрять зависимость через поле
    private Music music;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;


    // Inversion of Control
    //@Autowired // Можно внедрять зависимость через конструктор
    public MusicPlayer(Music music) {
        this.music = music;
    }

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    //@Autowired // Можно внедрять зависимость через сеттер
    public void setClassicalMusic(Music music) {
        this.music = music;
    }

    //@Autowired // Можно внедрять зависимость через метод с любым названием
    public void sxdgfdfg(Music music) {
        this.music = music;
    }



    public void playMusic(){
        System.out.println("Play: " + music.getSong());
    }

    public void playAllMusic(){
        System.out.println("Play: " + classicalMusic.getSong());
        System.out.println("Play: " + rockMusic.getSong());
        System.out.println("Play: " + rapMusic.getSong());
    }


    public String playMusicString() {
        return "Playing: \n"
                + classicalMusic.getSong() + "\n"
                + rockMusic.getSong() + "\n"
                + rapMusic.getSong();
    }
}
