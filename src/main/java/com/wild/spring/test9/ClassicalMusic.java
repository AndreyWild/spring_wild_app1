package com.wild.spring.test9;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("classic") // указываем спрингу что можно создать бин из класса
// (присвоили имя бину, по-умолчпанию было бы "classicalMusic")
public class ClassicalMusic implements Music {
    String[] songs = {"Hungarian Rhapsody", "Ave Maria", "Messiah"};

    @Override
    public String[] getSong() {
        return songs;
    }
}
