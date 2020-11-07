package urunova.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
                // создаем объект ApplicationContext
        //класс ApplicationContext обращается к applicationContext.xml, считывает его и помещает бины , которые в нем описаны, в WEB applicationContext

//        TestBean testBean = classPathXmlApplicationContext.getBean("testBean", TestBean.class);
        //у объекта контекста вызываем метод для получаения бина (объекта) по id класса TestBean и присваиваем ссылке testBean

//       Music music = classPathXmlApplicationContext.getBean("musicBean", Music.class);
//       MusicPlayer musicPlayer = new MusicPlayer(music);

       MusicPlayer firstmusicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
       MusicPlayer secondmusicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);

       boolean c = firstmusicPlayer == secondmusicPlayer;
//
        System.out.println(c);
        System.out.println(firstmusicPlayer);
        System.out.println(secondmusicPlayer);

        firstmusicPlayer.setVolume(10);
        System.out.println(firstmusicPlayer.getVolume());
        System.out.println(secondmusicPlayer.getVolume());

//        musicPlayer.playMusic();// вызываем метод у объекта
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

         classPathXmlApplicationContext.close(); //закрываем context
    }
}


//        TestBean testBean = classPathXmlApplicationContext.getBean("testBean", TestBean.class);
//у объекта контекста вызываем метод для получаения бина (объекта) по id класса TestBean и присваиваем ссылке testBean
//System.out.println(misic.getName()); // вызываем метод у объекта
//        classPathXmlApplicationContext.close(); //закрываем context

