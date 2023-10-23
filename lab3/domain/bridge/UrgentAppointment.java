package domain.bridge;

public class UrgentAppointment extends Appointment{

@Override
public void schedule(){
    System.out.println("Urgent Appointment:");
    System.out.println("Id: "+ id);
    System.out.println("Patient: "+ patient);
    appointmentDate="31.10.2023";
    System.out.println("Date: "+ appointmentDate);

}

@Override
public void update(){
    System.out.println("\nUrgent appointment ID " + id+ " has been rescheduled to 01.11.2023");
   
    
}


}