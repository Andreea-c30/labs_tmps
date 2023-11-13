package domain.mediator;

public interface IUser {
    void setMediator(IMediator mediator);
    void requestAppointment(String appointmentDate, String doctor);
}

