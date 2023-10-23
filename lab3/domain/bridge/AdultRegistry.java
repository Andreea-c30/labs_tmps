package domain.bridge;
import java.util.Random;
public class AdultRegistry extends Registry{
    public AdultRegistry(Appointment appointment)
{
    super(appointment);
}    

    @Override
    public void addId()
    {
        Random random = new Random();
         int nr = random.nextInt(100) + 1;
        appointment.setId(nr);
    }
    @Override
     public void addPatient(){
        appointment.setPatient("XPatient");
     }
  
    @Override
    public void addDoctor(){
        appointment.setDoctor("Specialized doctor");

    }
    
}