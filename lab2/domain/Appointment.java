
package domain;
public abstract class Appointment {
   private int id;
   private String appointmentDate;
   private Patient patient;
   private Doctor doctor;

   public Appointment(int id, String appointmentDate, Patient patient, Doctor doctor) {
       this.id = id;
       this.appointmentDate = appointmentDate;
       this.patient = patient;
       this.doctor = doctor;
   }

   // Getters and Setters
   public int getId() {
       return id;
   }

   public String getAppointmentDate() {
       return appointmentDate;
   }

   public void setAppointmentDate(String appointmentDate) {
       this.appointmentDate = appointmentDate;
   }

   public Patient getPatient() {
       return patient;
   }

   public void setPatient(Patient patient) {
       this.patient = patient;
   }

   public Doctor getDoctor() {
       return doctor;
   }

   public void setDoctor(Doctor doctor) {
       this.doctor = doctor;
   }


   public abstract void rescheduleAppointment(String newDate);

   @Override
   public String toString() {
       return "Appointment ID: " + id +
              "\nAppointment Date: " + appointmentDate +
              "\nPatient: " + patient.getFirstName() + " " + patient.getLastName() +
              "\nDoctor: " + doctor.getName() ;       
   }
}



