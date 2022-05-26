package ex05.main;

import ex05.beans.Vehicle;
import ex05.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleFive {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name from Spring Context is: " + vehicle.getName());
        vehicle.printHello();
    }
}