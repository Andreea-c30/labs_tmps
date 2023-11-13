package domain.observer;
public interface IAppointment {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    String getAppointmentDate();
    String getDoctor();
    String getStatus();

}
