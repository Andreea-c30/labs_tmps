package domain.mediator;
public interface IMediator{
    public void addPatient(Patient patient) ;
    public void notifyAppointmentScheduled(String appointmentDate, String doctor);
}