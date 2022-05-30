package ex13_assignment.implementation;

import ex13_assignment.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {

    @Override
    public void makeSound() {
        System.out.println("Sony speakers...");
    }
}
