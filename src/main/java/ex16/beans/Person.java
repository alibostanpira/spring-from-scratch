package ex16.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Person {

    private String name;
    private final Vehicle vehicle;
    private final SharedVehicle sharedVehicle;

    public SharedVehicle getSharedVehicle() {
        return sharedVehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Autowired
    public Person(Vehicle vehicle, SharedVehicle sharedVehicle) {
        System.out.println("Person bean is created.");
        this.vehicle = vehicle;
        this.sharedVehicle = sharedVehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
