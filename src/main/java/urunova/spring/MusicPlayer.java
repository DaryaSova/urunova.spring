package urunova.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music; //сможем играть музыку любого жанра

    //IoC

    public MusicPlayer (Music music) {
        this.music = music;
    }

    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic () {
            System.out.println("Playing  " + music.getSong());
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
