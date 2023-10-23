package domain.bridge;
import java.util.Random;
public class PediatricRegistry extends Registry{
    public PediatricRegistry(Appointment appointment)
{
    super(appointment);
}    
   @Override
    public void addId()
    {
        Random random = new Random();
         int nr = random.nextInt(200) + 100;
        appointment.setId(nr);
    }
    @Override
     public void addPatient(){
        appointment.setPatient("Y Patient");
     }
  
    @Override
    public void addDoctor(){
        appointment.setDoctor("Pediatric doctor");

    }
    
}