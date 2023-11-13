package domain.strategy;
import java.util.Date;
public class MedicationPrescription implements IPrescriptionStrategy {
    String name;
    Date date;
    boolean valid;

    public MedicationPrescription(String name, Date date, boolean valid) {
        this.name = name;
        this.date = date;
       
    }

    public void writePrescription() {
        System.out.println("Prescription: " + name + " " + date);
    }

    public void prescriptionType() {
        System.out.println("Medical Prescription");
    }

  
    public boolean validation() {
        if (valid==true) {
            return true;
        } else {
            return false;
        }
    }
}
