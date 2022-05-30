package ex15.implementation;

import ex15.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {

    @Override
    public void makeSound() {
        System.out.println("Sony speakers...");
    }
}
