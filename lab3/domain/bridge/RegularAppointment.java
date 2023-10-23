package domain.bridge;
import java.util.Random;
public class RegularAppointment extends Appointment{

@Override
public void schedule(){
    System.out.println("Regular Appointment:");
    System.out.println("Id: "+ id);
    System.out.println("Patient: "+ patient);
    Random random = new Random();
    int day = random.nextInt(31) + 1;
    int month = random.nextInt(12) + 1;
    int year = 2023;
    appointmentDate=day + "." + month + "." + year;
    System.out.println("Date: "+ appointmentDate);

}
@Override
public void update(){
    String newDate=newdate();
    System.out.println("\nRegular appointment ID " + id+ " has been rescheduled to"+ newDate);
   
    
}
public String newdate(){
Random random = new Random();
int day = random.nextInt(31) + 1;
int month = random.nextInt(12) + 10;
int year = 2023;
String newd=day + "." + month + "." + year;
return newd;
}

}