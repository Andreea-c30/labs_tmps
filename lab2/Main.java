import domain.*;
import model.*;
import factory.*;
import prototype.*;

public class Main{
    public static void main(String[] args) {

       //Create doctors and patients
        Doctor doc1=new Doctor("John Miller","Pediatrician");
        Doctor doc2=new Doctor("Matt William","Cardiologist");
        Patient patient1=new Patient(1,"Kate","Lil","067543217","01.01.2004");
        Patient patient2=new Patient(2,"Anne", "Simson","078965476","12.10.2000");

       // Create pediatric and regular appointment factories
        IAppointmentFactory pediatricFactory = new PediatricAppointmentFactory();
        IAppointmentFactory regularFactory = new RegularAppointmentFactory();
        // Create appointments using the factories
        Appointment pediatricAppointment = pediatricFactory.createAppointment(1, "2023-10-10", patient1, doc1);
        Appointment regularAppointment = regularFactory.createAppointment(2, "2023-10-15", patient2, doc2);

        // print the created appointments
        System.out.println("Appointments---------------------------");
        System.out.println(pediatricAppointment+"/n");
        regularAppointment.rescheduleAppointment("2023-10-25");

        System.out.println(regularAppointment+"/n");

        // reschedule appointment
        pediatricAppointment.rescheduleAppointment("2023-10-20");
        
        //instance of Billing
        Billing billing = Billing.getbill();
        double cost = 100.0;

        // generate a bill
        billing.bill(patient2, cost);


         //create a Physician using the PhysicianBuilder
        Physician physician = new PhysicianBuilder()
                .id(1)
                .firstName("Will")
                .lastName("Don")
                .email("Will.don123@gmail.com")
                .specialization("Cardiology")
                .expirience_years(15)
                .position("Head of Cardiology")
                .build();

        System.out.println(physician);

        CloneFactory prescription = new CloneFactory();

		MedicationPrescription initialpresc = new MedicationPrescription();
		MedicationPrescription cloned = (MedicationPrescription) prescription.getClone(initialpresc);

		System.out.println(initialpresc);
		System.out.println(cloned);
    }

}