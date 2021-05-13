package com.wild.spring.test12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // Указываем что эт окласс конфигурации
@PropertySource("classpath:musicPlayer.properties") // Указываем на файл с настройками
public class SpringConfig {
    /* Класс конфигурации*/

    @Bean("classic") // создаем бин с именем "classic" (по-умолчанию classicalMusic)
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean // Создаем бин и внедряем зависимость
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicalMusic(), rockMusic());
    }

}
