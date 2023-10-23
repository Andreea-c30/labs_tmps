package domain.adapter;

public class PhysicalTherapyAdapter implements IPrescription {
    private PhysicalTherapy physicalTherapy;

    public PhysicalTherapyAdapter(PhysicalTherapy physicalTherapy) {
        this.physicalTherapy = physicalTherapy;
    }

    @Override
    public void prescriptionType() {
        physicalTherapy.prescribePhysicalTherapy();
    }

    @Override
    public void writePrescription() {
        physicalTherapy.executeTreatmentPlan();
    }

    @Override
    public boolean validation() {
        return physicalTherapy.treatmentCompleted();
    }
}