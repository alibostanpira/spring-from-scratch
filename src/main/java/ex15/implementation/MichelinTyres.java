package ex15.implementation;

import ex15.interfaces.Tyres;
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