package urunova.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic  implements Music{
    private List <String> songs = new ArrayList<>();
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }


    private ClassicalMusic () {
    }

    public static ClassicalMusic getClassicalMusic () {
        return new ClassicalMusic();
    }



    @Override
    public List<String> getSong() {
        return songs;
    }

    @PostConstruct
    public void doMyInit () {
        System.out.println("инициализация");
    }

    @PreDestroy
    public void doMyDestroy () {
        System.out.println("удаление");
    }
}
