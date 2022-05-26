package ex08.main;

import ex08.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleEight {
    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("ex08/beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());

    }
}
