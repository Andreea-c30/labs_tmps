public abstract class Physician {
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

   public abstract void prescribeMedication(Patient patient, String medication);

   @Override
   public String toString() {
       return "ID: " + id +
              "\nName: " + firstName + " " + lastName ;
   }
}