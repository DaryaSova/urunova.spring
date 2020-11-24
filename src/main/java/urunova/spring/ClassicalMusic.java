package urunova.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

//@Component
//@Scope("singleton")
public class ClassicalMusic  implements Music{


    @Override
    public String getSong() {
        return "Hug";
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
