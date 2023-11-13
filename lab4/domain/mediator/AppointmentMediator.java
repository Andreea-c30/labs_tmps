package domain.mediator;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class AppointmentMediator implements IMediator {
    private List<Patient> patients;

    public AppointmentMediator() {
        // patients list
        patients = new ArrayList<>(); 
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void notifyAppointmentScheduled(String appointmentDate, String doctor) {
    boolean isDateAvailable = new Random().nextBoolean();

    if (isDateAvailable) {
        System.out.println("Aproved appointment ");
    } else {
        System.out.println("Denied appointment");
    } 
    }
    
   
}
