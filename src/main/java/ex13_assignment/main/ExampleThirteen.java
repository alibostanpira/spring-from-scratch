package ex13_assignment.main;


import ex13_assignment.beans.Person;
import ex13_assignment.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleThirteen {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        person.getVehicle().getVehicleService().getTyres().rotate();
        person.getVehicle().getVehicleService().getSpeakers().makeSound();
        System.out.println(person.getVehicle().getName());
    }
}
