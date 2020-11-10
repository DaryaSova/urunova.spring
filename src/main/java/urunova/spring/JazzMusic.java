package urunova.spring;

import org.springframework.stereotype.Component;

@Component ("jazzMusic")
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "A Night Like This";
    }
}
