package domain.composite;

import java.util.ArrayList;
import java.util.List;

public class MedicalGroup implements IMedicalProfessional {
    private List<IMedicalProfessional> professionals = new ArrayList<>();

    public void addMedicalProfessional(IMedicalProfessional professional) {
        professionals.add(professional);
    }

    public void removeMedicalProfessional(IMedicalProfessional professional) {
        professionals.remove(professional);
    }

    @Override
    public void prescribeMedication(Patient patient, String medication) {
        for (IMedicalProfessional professional : professionals) {
            professional.prescribeMedication(patient, medication);
        }
    }

    @Override
    public String getName() {
        
        return "Medical Team";
    }
}
