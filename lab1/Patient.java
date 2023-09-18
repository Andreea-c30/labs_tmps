public class Patient implements IRecords,IBilling {
   private int id;
   private String firstName;
   private String lastName;
   private String phone;
   private String dateOfBirth;

   // Constructors
   public Patient(int id, String firstName, String lastName, String phone, String dateOfBirth) {
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
       this.phone=phone;
       this.dateOfBirth = dateOfBirth;
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

   public String getPhone() {
       return phone;
   }

   public void setPhone(String phone) {
       this.phone = phone;
   }

   public String getDateOfBirth() {
       return dateOfBirth;
   }

   public void setDateOfBirth(String dateOfBirth) {
       this.dateOfBirth = dateOfBirth;
   }


   @Override
   public String toString() {
       return "Patient ID: " + id +
              "\nName: " + firstName + " " + lastName +
              "\nPhone number: " + phone +
              "\nDate of Birth: " + dateOfBirth ;
   }

    @Override
   public void updateRecord(String newRecord) {
       System.out.println("Record updated: \n " + newRecord);
   }
    @Override
    public void bill(Patient patient, double amount) {
        System.out.println("Patient bill: " + patient.getFirstName() + " " + patient.getLastName() + " - " + amount+" lei");


    }
}

