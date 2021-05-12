package com.wild.spring.test7;

import org.springframework.stereotype.Component;

@Component("classic") // указываем спрингу что можно создать бин из класса
// (присвоили имя бину, по-умолчпанию было бы "classicalMusic")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
