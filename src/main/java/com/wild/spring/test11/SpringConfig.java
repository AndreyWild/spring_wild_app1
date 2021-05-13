package com.wild.spring.test11;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // Указываем что эт окласс конфигурации
@ComponentScan("com.wild.spring.test11") // Указываем область сканирования бинов
@PropertySource("classpath:musicPlayer.properties") // Указываем на файл с настройками
public class SpringConfig {
    /* Класс конфигурации*/

}
