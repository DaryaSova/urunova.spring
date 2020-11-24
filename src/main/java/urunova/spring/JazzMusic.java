package urunova.spring;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "jazzzzz";
    }
//    @Override
//    public String getSong() {
//        return "A Night Like This";
//    }
}
