
package domain.strategy;


public class PhysicalTherapy implements IPrescriptionStrategy {
    private String treatmentPlan;
    private boolean complete;

    public PhysicalTherapy(String  treatmentPlan, boolean complete) {
        this.treatmentPlan = treatmentPlan;
        this.complete = complete;
    }
    public void prescriptionType() {
        System.out.println("Prescribing physical therapy");
    }

    public void writePrescription() {  

        System.out.println("Executing treatment plan:");
       
        System.out.println("Plan: " + treatmentPlan);

    }

    public boolean validation() {
        return complete;
    }
}

