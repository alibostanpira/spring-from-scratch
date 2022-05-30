package ex13_assignment.implementation;

import ex13_assignment.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

    @Override
    public void rotate() {
        System.out.println("Michelin tyres...");
    }
}