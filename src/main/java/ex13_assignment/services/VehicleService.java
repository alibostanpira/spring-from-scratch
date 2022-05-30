package ex13_assignment.services;

import ex13_assignment.interfaces.Speakers;
import ex13_assignment.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    private Speakers speakers;
    private Tyres tyres;

    @Autowired
    public void setSpeakers(Speakers speakers) {

        this.speakers = speakers;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

}
