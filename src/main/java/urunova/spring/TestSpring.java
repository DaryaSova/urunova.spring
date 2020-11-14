package urunova.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);

//        musicPlayer.playMusic(MusicGenre.CLASSICAL);
//        musicPlayer.playMusic(MusicGenre.ROCK);

        ClassicalMusic classicalMusic = classPathXmlApplicationContext.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = classPathXmlApplicationContext.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic == classicalMusic2);

         classPathXmlApplicationContext.close(); //закрываем context
    }
}


