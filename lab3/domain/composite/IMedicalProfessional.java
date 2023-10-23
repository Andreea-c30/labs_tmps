package domain.composite;

public interface IMedicalProfessional {
    void prescribeMedication(Patient patient, String medication);
    String getName();
}
