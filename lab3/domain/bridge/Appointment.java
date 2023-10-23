package domain.bridge;
public abstract class Appointment{
    int id;
    String appointmentDate;
    String patient,doctor;

    public abstract void schedule();
    public abstract void update();

    public void setappointmentDate(String appointmentDate) {
       this.appointmentDate = appointmentDate;
   }
   public void setDoctor(String doctor) {
       this.doctor = doctor;
   }

   public void setPatient(String patient) {
       this.patient = patient;
   }
   public void setId(int id) {
       this.id = id;
   }
}
