package com.wild.spring.test13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration // Указываем что эт окласс конфигурации
@PropertySource("classpath:musicPlayer.properties") // Указываем на файл с настройками
public class SpringConfig {
    /* Класс конфигурации*/

    @Bean // создаем бин с именем "classic" (по-умолчанию classicalMusic)
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){ return new RockMusic(); }

    @Bean
    public JazzMusic jazzMusic(){return new JazzMusic();}

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean // Создаем бин и внедряем зависимость
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

}
