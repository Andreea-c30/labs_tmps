package domain.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAppointment implements IAppointment {
    private List<Observer> observers = new ArrayList<>();
    private String appointmentDate;
    private String doctor;
    private String client; 
    private String status;

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setDoctor(String doctor) { 
        this.doctor = doctor;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getAppointmentDate() {
        return appointmentDate;
    }

    @Override
    public String getDoctor() { 
        return doctor;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

