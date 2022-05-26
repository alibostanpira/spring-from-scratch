package ex02.main;

import ex02.beans.Vehicle;
import ex02.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleTwo {

    public static void main(String[] args) {

        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // Vehicle veh = context.getBean(Vehicle.class);
        Vehicle veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
    }
}
