
import domain.strategy.*;
import domain.observer.*;
import domain.mediator.*;
import java.util.Date;
import java.util.List;
public class Main {
   public static void main(String[] args) {
      AppointmentMediator mediator = new AppointmentMediator();
      Patient patient = new Patient(1, "Mike", "Drew", "067342389", "04.10.2000");
      patient.setMediator(mediator);

      
      mediator.addPatient(patient);

      // Patient requests an appointment through the mediator
      patient.requestAppointment("2023-11-15", "Dr. Smith");

      PrescriptionService service1=new PrescriptionService();
      service1.setStrategy(new MedicationPrescription("Medicine Aspirin", new Date(), true));
      service1.processPrescription();

      PrescriptionService service2=new PrescriptionService();
      service2.setStrategy(new PhysicalTherapy("Strengthening exercises",true));
      service2.processPrescription();
      
      // Create a new appointment
      ConcreteAppointment appointment = new ConcreteAppointment();
      appointment.setAppointmentDate("2023-11-15");
      appointment.setDoctor("Dr. Jones");
      
      appointment.setStatus("scheduled"); // Set the status to indicate scheduling

      // Register clients as observers
      Client client1 = new Client(1, "Mia Smith");
      Client client2 = new Client(2, "Mike Johnson" );

      appointment.registerObserver(client1);
      appointment.registerObserver(client2);

      // Notify observers about the appointment (scheduling in this case)
      appointment.notifyObservers();

         
      
      

   
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      // Patient patient = new Patient(1, "Mike", "Drew", "067342389", "04.10.2000");

      // //create adult regular appointment using bridge dp

      // AdultRegistry adult=new AdultRegistry(new RegularAppointment());
      // adult.createappointment();

      // //Composite
      // System.out.println("==========================================");
      // Physician doctor1 = new Physician(1, "Kate", "Blake");
   
      //  //adding doctors using composite dp
      // MedicalGroup medicalgroup = new MedicalGroup();
      // medicalgroup.addMedicalProfessional(doctor1);
   
      // // Prescribing medication through the MedicalTeam
      // medicalgroup.prescribeMedication(patient, "Painkillers");

      // //create pediatric urgent appointment using bridge dp
      // PediatricRegistry child=new PediatricRegistry(new UrgentAppointment());
      // child.createappointment();

      // // Create a prescriptions using Adaptor dp
      // MedicationPrescription prescription = new MedicationPrescription("Medicine Aspirin", new Date(), true);

      // // methods on the prescription object
      // prescription.prescriptionType();
      // prescription.writePrescription();
      // prescription.validation();

      // System.out.println("\n");
      // String treatment = "Strengthening exercises";
      // // Create a PhysicalTherapy instance
      // PhysicalTherapy physicalTherapy = new PhysicalTherapy("Strengthening exercises",true);

      // // Create a PhysicalTherapyAdapter using the PhysicalTherapy instance
      // PhysicalTherapyAdapter therapyAdapter = new PhysicalTherapyAdapter(physicalTherapy);

      // //use PhysicalTherapyAdapter to interact with the IPrescription interface
      // therapyAdapter.prescriptionType();
      // therapyAdapter.writePrescription();

      // //if treatment is completed
      // if (therapyAdapter.validation()) {
      //     System.out.println("Treatment is completed.");
          
      // } 
      // else {
      //       System.out.println("Treatment is not completed yet.");

      //   }
    

      // //DEcorator adding bills
      // System.out.println("==========================================");
      // IBilling bills = new MedicationBillDecorator(new AppointmentBill("consulation",200),300);
      // bills.bill();


   
   }
}













