public class PediatricAppointment extends Appointment {
   private String peds_reason; 


   public PediatricAppointment(int id, String appointmentDate, Patient patient, Doctor doctor, String peds_reason) {
       super(id, appointmentDate, patient, doctor);
       this.peds_reason = peds_reason;
   }


   public String getpeds_reason() {
       return peds_reason;
   }

   public void setpeds_reason(String peds_reason) {
       this.peds_reason = peds_reason;
   }

   @Override
   public void rescheduleAppointment(String newDate) {
       System.out.println("\nPediatric appointment ID " + getId() + " has been rescheduled to " + newDate);
   }
}


