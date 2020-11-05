package urunova.spring;

public class MusicPlayer {
    private Music music; //сможем играть музыку любого жанра


    //IoC
    public MusicPlayer (Music music) {
        this.music = music;
    }

    public void playMusic () {
        System.out.println("Playing  " + music.getSong());
    }
}
