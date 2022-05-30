package ex15.implementation;

import ex15.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeakers implements Speakers {

    @Override
    public void makeSound() {
        System.out.println("Bose speakers...");
    }
}
