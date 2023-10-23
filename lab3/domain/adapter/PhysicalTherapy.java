
package domain.adapter;


public class PhysicalTherapy {
    private String treatmentPlan;
    private boolean complete;

    public PhysicalTherapy(String  treatmentPlan, boolean complete) {
        this.treatmentPlan = treatmentPlan;
        this.complete = complete;
    }
    public void prescribePhysicalTherapy() {
        System.out.println("Prescribing physical therapy");
    }

    public void executeTreatmentPlan() {  

        System.out.println("Executing treatment plan:");
       
        System.out.println("Plan: " + treatmentPlan);

    }

    public boolean treatmentCompleted() {
        return complete;
    }
}

