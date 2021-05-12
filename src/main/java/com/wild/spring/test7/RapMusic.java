package com.wild.spring.test7;

import org.springframework.stereotype.Component;

@Component("rap") // указываем спрингу что можно создать бин из класса
// (присвоили имя бину, по-умолчпанию было бы "rapMusic")
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Still D.R.E.";
    }
}
