package factory;
import domain.Appointment;
import domain.PediatricAppointment;
import domain.Doctor;
import domain.Patient;

public class PediatricAppointmentFactory implements IAppointmentFactory {
    @Override
    public Appointment createAppointment(int id, String appointmentDate, Patient patient, Doctor doctor) {
        return new PediatricAppointment(id, appointmentDate, patient, doctor, "Pediatric Reason");
    }
}