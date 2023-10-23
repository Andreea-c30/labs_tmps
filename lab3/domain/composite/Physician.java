package domain.composite;

public class Physician implements IMedicalProfessional {
   private int id;
   private String firstName;
   private String lastName;
 
   public Physician(int id, String firstName, String lastName) {
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
   }


   public int getId() {
       return id;
   }


   public String getFirstName() {
       return firstName;
   }


   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }


   public String getLastName() {
       return lastName;
   }



   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   @Override
   public String toString() {
       return "ID: " + id +
              "\nName: " + firstName + " " + lastName ;
   }
    @Override
    public void prescribeMedication(Patient patient, String medication) {
        System.out.println(this.getFirstName() + " " + this.getLastName() + " prescribes " + medication + " to " + patient.getFirstName()+" "+patient.getLastName());
    }

    @Override
    public String getName() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
