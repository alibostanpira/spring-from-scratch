package ex14.main;

import ex14.beans.Vehicle;
import ex14.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleFourteen {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicleOne = context.getBean(Vehicle.class);
        Vehicle vehicleTwo = context.getBean(Vehicle.class);
        Vehicle vehicleThree = context.getBean(Vehicle.class);

        vehicleOne.setName("One");
        vehicleTwo.setName("Two");
        vehicleThree.setName("Three");

        System.out.println(vehicleOne.hashCode());
        System.out.println(vehicleTwo.hashCode());
        System.out.println(vehicleThree.hashCode());

        System.out.println(vehicleOne.getName());
        System.out.println(vehicleTwo.getName());
        System.out.println(vehicleThree.getName());
    }
}
