package domain.mediator;
public class Patient implements IUser{
   private IMediator mediator;
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

   
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    public void requestAppointment(String appointmentDate, String doctor) {
        // Implement the patient's request for an appointment.
       System.out.println("Patient " + firstName + " requested an appointment on " + appointmentDate + " with " + doctor);
       
         // Notify the mediator about the request.
        mediator.notifyAppointmentScheduled(appointmentDate, doctor);
    }
    
    
}