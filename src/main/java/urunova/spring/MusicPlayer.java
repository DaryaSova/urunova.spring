package urunova.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic; //сможем играть музыку любого жанра

    //IoC
    @Autowired
    public MusicPlayer (ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public void playMusic () {
            System.out.println("Playing  " + classicalMusic.getSong());
    }



    private String name;
    private int volume; //громкость

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }



    public MusicPlayer () {}


    public void init () {
        System.out.println("init");
    }

    public void des () {
        System.out.println("des");
    }


}
