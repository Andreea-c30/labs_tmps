package domain;
public class RegularAppointment extends Appointment {
   
   private String type;  

   public RegularAppointment(int id, String appointmentDate, Patient patient, Doctor doctor, String type) {
       super(id, appointmentDate, patient, doctor);
       this.type = type;
   }

   public String getType() {
       return type;
   }

   public void setType(String type) {
       this.type = type;
   }

   @Override
   public void rescheduleAppointment(String newDate) {
       System.out.println("\nRegular appointment ID " + getId() + " has been rescheduled to " + newDate);
   }
}


