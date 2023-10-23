package domain.bridge;
public abstract class Registry{
    protected Appointment appointment;
    protected Registry(Appointment appointment)
    {
        this.appointment=appointment;
    }
    
    abstract void addId();
    abstract void addDoctor();
    abstract void addPatient();
    public void createappointment(){
        addDoctor();
        addPatient();
        addId();
        appointment.schedule();
        System.out.println("Appointment Created Scuccessfully!");

    }
}