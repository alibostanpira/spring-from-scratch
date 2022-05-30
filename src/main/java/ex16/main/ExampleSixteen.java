package ex16.main;

import ex16.beans.Person;
import ex16.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleSixteen {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person personOne = context.getBean(Person.class);
        Person personTwo = context.getBean(Person.class);

        personOne.setName("Ali");
        personTwo.setName("Alex");

        personOne.getVehicle().setName("BMW");
        personTwo.getVehicle().setName("Audi");

        personOne.getSharedVehicle().setName("This name will be overridden");
        personTwo.getSharedVehicle().setName("VW");

        System.out.println("PersonOne[#]: " + personOne.hashCode());
        System.out.println("PersonTwo[#]: " + personTwo.hashCode());

        System.out.println("VehicleOne[#]: " + personOne.getVehicle().hashCode());
        System.out.println("VehicleTwo[#]: " + personTwo.getVehicle().hashCode());

        System.out.println("SharedVehicleOne[#]: " + personOne.getSharedVehicle().hashCode());
        System.out.println("SharedVehicleTwo[#]: " + personTwo.getSharedVehicle().hashCode());

        System.out.println(personOne.getVehicle().getName());
        System.out.println(personTwo.getVehicle().getName());

        System.out.println(personOne.getSharedVehicle().getName());
        System.out.println(personTwo.getSharedVehicle().getName());

        System.out.println(personOne.getName());
        System.out.println(personTwo.getName());


    }
}
