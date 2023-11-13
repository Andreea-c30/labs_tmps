package domain.strategy;
import java.util.Random;

public class PrescriptionService{
    public IPrescriptionStrategy prescrip;
 
    public void setStrategy(IPrescriptionStrategy prescrip) {
       this.prescrip = prescrip;
   }
   public void processPrescription() {
        prescrip.writePrescription();
        prescrip.prescriptionType();
        if (prescrip.validation()) {
            if (isValid()) {
                System.out.println("Treatment completed");
            } else {
               
                System.out.println("Treatment not valid");
            }
        }else
             System.out.println("Treatment in progress");
    }

    public boolean isValid() {
        Random random = new Random();
        return random.nextBoolean();
    }
}