package ex13_assignment.implementation;

import ex13_assignment.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgestoneTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("Bridgestone tyres...");
    }
}
