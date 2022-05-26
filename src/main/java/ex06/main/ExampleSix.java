package ex06.main;

import ex06.beans.Vehicle;
import ex06.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleSix {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name from " + "Spring Context is: " + vehicle.getName());
        vehicle.printHello();
        context.close();
    }
}