package domain.adapter;

import java.util.Date;

public class MedicationPrescription implements IPrescription {
    String name;
    Date date;
    boolean valid;

    public MedicationPrescription(String name, Date date, boolean valid) {
        this.name = name;
        this.date = date;
        this.valid = valid;
    }

    @Override
    public void writePrescription() {
        System.out.println("Prescription: " + name + " " + date);
    }

    @Override
    public void prescriptionType() {
        System.out.println("Medical Prescription");
    }

    @Override
    public boolean validation() {
        if (valid) {
            System.out.println("Prescription is valid");
            return true;
        } else {
            System.out.println("Prescription is not valid");
            return false;
        }
    }
}
