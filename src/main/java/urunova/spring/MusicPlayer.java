package urunova.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private JazzMusic jazzMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, JazzMusic jazzMusic) {// внедрили 2 зависимости
        this.classicalMusic = classicalMusic;
        this.jazzMusic = jazzMusic;
    }

    //IoC

//    public MusicPlayer (Music music) {
//        this.music = music;
//    }

    public void playMusic () {
            System.out.println("Playing  " + classicalMusic.getSong());
            System.out.println("Playing  " + jazzMusic.getSong());
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
