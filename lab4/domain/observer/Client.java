package domain.observer;
public class Client implements Observer {
    private int id;
    private String name;
   

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void update(IAppointment appointment) {
        System.out.println("Notification for Client: " + name);
        System.out.println("Appointment Date: " + appointment.getAppointmentDate());
        System.out.println("Doctor: " + appointment.getDoctor());
        System.out.println("Status: " + "Appointment " + appointment.getStatus() + "\n");
        
    }
}
