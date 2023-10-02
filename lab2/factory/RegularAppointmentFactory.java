package factory;
import domain.Appointment;
import domain.RegularAppointment;
import domain.Doctor;
import domain.Patient;
public class RegularAppointmentFactory implements IAppointmentFactory {
    @Override
    public Appointment createAppointment(int id, String appointmentDate, Patient patient, Doctor doctor) {
        return new RegularAppointment(id, appointmentDate, patient, doctor, "Regular Type");
    }
}
