package com.wild.spring.test11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classic") // указываем спрингу что можно создать бин из класса
// (присвоили имя бину, по-умолчпанию было бы "classicalMusic")
@Scope("singleton")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
