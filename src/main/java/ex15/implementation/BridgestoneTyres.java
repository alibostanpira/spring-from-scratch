package ex15.implementation;

import ex15.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgestoneTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("Bridgestone tyres...");
    }
}
