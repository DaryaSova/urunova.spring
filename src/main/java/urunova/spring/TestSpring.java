package urunova.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
//
//        Music music = classPathXmlApplicationContext.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music1 = classPathXmlApplicationContext.getBean("jazzMusic", Music.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        musicPlayer1.playMusic();

         classPathXmlApplicationContext.close(); //закрываем context
    }
}


