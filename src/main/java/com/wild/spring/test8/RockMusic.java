package com.wild.spring.test8;

import org.springframework.stereotype.Component;

@Component("rock") // указываем спрингу что можно создать бин из класса
// (присвоили имя бину, по-умолчпанию было бы "rockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }
}
