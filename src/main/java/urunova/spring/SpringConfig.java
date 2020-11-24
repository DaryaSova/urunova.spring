package urunova.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //указали, что данный класс является конфигурационным (заместо applicationContext.xml)
//@ComponentScan ("urunova.spring") //указалаи на папку с классами (просканирует и найдет аннотации, по которым создаст бины)
@PropertySource("classpath:musicPlayer.properties") // указали путь до внешнего файла
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic () {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic () {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer () {
        return new MusicPlayer(rockMusic(), classicalMusic());
    }

    @Bean
    public Computer computer () {
        return new Computer(musicPlayer());
    }


}
