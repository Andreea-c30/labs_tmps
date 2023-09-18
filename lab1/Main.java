public class Main {
   public static void main(String[] args) {

       Patient patient1 = new Patient(1, "Mike", "Drew", "067342389", "04.10.2000");
       Patient patient2 = new Patient(2, "Jane", "Milo", "074364598", "09.07.1990");
       Patient patient3 = new Patient(3, "Kate", "Wash", "054323456", "04.10.1996");
       Doctor doctor1 = new Doctor(101, "Dr. Liam", "Smith", "Cardiologist");
       Doctor doctor1 = new Doctor(101, "Dr. Anna", "Jane", "Pediatrician");

     
       IRecords patientRecordable = patient1;
       IBilling pacientbill1=patient1;
       IBilling pacientbill2=patient2;
       IBilling pacientbill3=patient3;

       // Create appointments
       Appointment appointment1 = new RegularAppointment(1001, "04.09.2023 10:00", patient1, doctor1, "Regular checkup");
       Appointment appointment2 = new PediatricAppointment(1002, "20.09.2023 09:00", patient2, doctor2, "Pediatric consult");
       Appointment appointment3 = new RegularAppointment(1003, "29.09.2023 08:00", patient3, doctor1, "Blood testing");

       System.out.println("\nAppointments:  ");

       System.out.println(appointment1);
       System.out.println("Medical records: ");
       patientRecordable.updateRecord("Heart surgery");
       doctor1.prescribeMedication(patient1, "Painkillers");
       pacientbill1.bill(patient1,100);

       String newDate1 = "04.10.2023 15:30";
       appointment2.rescheduleAppointment(newDate1);
       pacientbill2.bill(patient2,2000);

       System.out.println(appointment3);
       String newDate2 = "10.10.2023 08:00";
       appointment3.rescheduleAppointment(newDate2);
       pacientbill3.bill(patient3,500);

       
   
   }
}













