package com.wild.spring.test9;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("rock") // указываем спрингу что можно создать бин из класса
// (присвоили имя бину, по-умолчпанию было бы "rockMusic")
public class RockMusic implements Music {
    String [] songs = {"Bohemian Rhapsody", "Layla", "Hotel California"};

    @Override
    public String[] getSong() {
        return songs;
    }
}
