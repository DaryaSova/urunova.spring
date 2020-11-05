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

        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
       musicPlayer.playMusic();// вызываем метод у объекта
        classPathXmlApplicationContext.close(); //закрываем context
    }
}


//        TestBean testBean = classPathXmlApplicationContext.getBean("testBean", TestBean.class);
//у объекта контекста вызываем метод для получаения бина (объекта) по id класса TestBean и присваиваем ссылке testBean
//System.out.println(misic.getName()); // вызываем метод у объекта
//        classPathXmlApplicationContext.close(); //закрываем context

