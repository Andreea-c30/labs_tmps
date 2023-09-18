public class Doctor extends Physician {
   private String specialization;


   public Doctor(int id, String firstName, String lastName,String specialization) {
       super(id, firstName, lastName);
       this.specialization = specialization;
   }


 public String getSpecialization() {
       return specialization;
   }


   public void setSpecialization(String specialization) {
       this.specialization = specialization;
   }
    @Override
   public void prescribeMedication(Patient patient, String medication) {
       System.out.println(getFirstName() + " " + getLastName() + " prescribes " + medication + " to " + patient.getFirstName() + " " + patient.getLastName());
   }
}

