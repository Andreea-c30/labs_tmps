package factory;
import domain.Appointment;
import domain.Doctor;
import domain.Patient;

public interface IAppointmentFactory {
    Appointment createAppointment(int id, String appointmentDate, Patient patient, Doctor doctor);
}