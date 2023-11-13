# Topic: Behavioral Design Patterns


# Author: Andreea CHIPER

----

## Objectives:
&ensp; &ensp; __1. SStudy and understand the Behavioral Design Patterns.__

&ensp; &ensp; __2. As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system..__

&ensp; &ensp;__3. Create a new Project or add some additional functionalities using behavioral design patterns__

## Implementation

To implement and illustrate the Behavioral design patterns, I had developed a medical appointment management system that handles patient and doctor appointments and associated data. The classes and interfaces form the basics of the medical management system, allowing for the representation of doctors, appointments, prescriptions and the interactions between them.

I have implemented 3 behavioral design patterns in various ways throughout the project such as:

1. Strategy

The strategy design pattern is a behavioral design pattern that allows you to define a family of algorithms, encapsulate each one of them, and make them interchangeable. 

This design pattern allows to define multiple prescription strategies medication and physical therapy, that all implement the same interface (IPrescriptionStrategy). Then, having a PrescriptionService class that can work with any of these strategies, allowing to switch between them without changing the service's code

IPrescriptionStrategy is an interface that defines three methods:

 ```
 public interface IPrescription {
    void prescriptionType();
    void writePrescription();
    boolean validation();

}
 ```
   
'MedicationPrescription' is a class that implements the IPrescriptionStrategy interface for medication prescriptions. It has fields for the name of the medication, the date, and a boolean indicating whether it's valid. 

The writePrescription(), prescriptionType(), and validation() methods are implemented to describe and validate medication prescriptions.
```
    public void writePrescription() {
        System.out.println("Prescription: " + name + " " + date);
    }

    public void prescriptionType() {
        System.out.println("Medical Prescription");
    }

    public boolean validation() {
        if (valid==true) {
            return true;
        } else {
            return false;
        }
    }
```

PhysicalTherapy is another class that implements the IPrescriptionStrategy interface for physical therapy prescriptions. It has fields for the treatment plan and a boolean indicating whether it's complete. 

The writePrescription(), prescriptionType(), and validation() methods are implemented accordingly.

```
public void prescriptionType() {
        System.out.println("Prescribing physical therapy");
    }

public void writePrescription() {  

        System.out.println("Executing treatment plan:");
        System.out.println("Plan: " + treatmentPlan);
    }

public boolean validation() {
        return complete;
    }
```
PrescriptionService is a class that works with prescription strategies. It has a field of type IPrescriptionStrategy to hold the current prescription strategy. It provides methods to set the strategy and process the prescription:

setStrategy(IPrescriptionStrategy prescrip): sets the strategy to be used.

processPrescription(): Writes the prescription, describes its type, and checks its validity.

```
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
```
This approach allows handling different types of prescriptions.

2. Mediator
The Mediator design pattern is a behavioral design pattern that facilitates a lack of interaction between things, by centralizing interactions between objects through a mediator object

IMediator interface defines the contract for mediators, including two methods:

 addPatient(Patient patient): Used to add a patient to the mediator.

 notifyAppointmentScheduled(String appointmentDate, String doctor): Used to notify the mediator about an appointment request.

```
public interface IMediator{
    public void addPatient(Patient patient) ;
    public void notifyAppointmentScheduled(String appointmentDate, String doctor);
}
```

AppointmentMediator class implements the IMediator interface and manages patient appointments.

It has a list of patients and can add patients to this list.
The notifyAppointmentScheduled method randomly approves or denies an appointment based on whether the isDateAvailable boolean is true or false. 
```
private List<Patient> patients;

    public AppointmentMediator() {
        patients = new ArrayList<>(); 
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void notifyAppointmentScheduled(String appointmentDate, String doctor) {
    boolean isDateAvailable = new Random().nextBoolean();

    if (isDateAvailable) {
        System.out.println("Aproved appointment ");
    } else {
        System.out.println("Denied appointment");
    } 
}
```
IUser interface defines the contract for patients who can request appointments through the mediator.

```
public interface IUser {
    void setMediator(IMediator mediator);
    void requestAppointment(String appointmentDate, String doctor);
}
```

Patient class implements the IUser interface and represents a patient. It has attributes like id, firstName, lastName, phone, and dateOfBirth to store patient information.

The setMediator method sets the mediator for the patient.
```
public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

```
The requestAppointment method is called when a patient requests an appointment. It prints a message about the request and then notifies the mediator about the appointment request.

```
 public void requestAppointment(String appointmentDate, String doctor) {
        // Implement the patient's request for an appointment.
       System.out.println("Patient " + firstName + " requested an appointment on " + appointmentDate + " with " + doctor);
       
         // Notify the mediator about the request.
        mediator.notifyAppointmentScheduled(appointmentDate, doctor);
}
```
Thus it facilitates communication between patients and the scheduling system, allowing patients to request appointments and relaying those requests to the system, which then decides whether to approve or deny the appointments.

3. Observer

Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically. 

I have implemeted observer design pattern for managing medical appointments and notifying clients about changes in those appointments. 

IAppointment interface that defines the contract for managing appointments.
It includes methods for registering, removing, and notifying observers, as well as methods for getting appointment information like date, doctor and status.

```
 public interface IAppointment {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    String getAppointmentDate();
    String getDoctor();
    String getStatus();

}
```

ConcreteAppointment class implements the IAppointment interface. It maintains a list of observers which are the clients, who want to be notified of changes in appointments.
```
private List<Observer> observers = new ArrayList<>();
```
The class includes setters for appointment details (date, doctor, client, etc.), and getter methods for retrieving appointment information.

It also implements the observer registration, removal, and notification methods.

```
public void registerObserver(Observer observer) {
        observers.add(observer);
    }


public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

 
public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
```
Observer interface defines the contract for observers, which  are entities interested in receiving notifications about appointment changes.
```
public interface Observer {
    void update(IAppointment appointment);
}
```
Client class represents a specific type of observer. It implements the Observer interface, defining the update method to handle appointment notifications.

When a client is notified of an appointment change, it prints relevant information about the appointment.

```
public void update(IAppointment appointment) {
        System.out.println("Notification for Client: " + name);
        System.out.println("Appointment Date: " + appointment.getAppointmentDate());
        System.out.println("Doctor: " + appointment.getDoctor());
        System.out.println("Status: " + "Appointment " + appointment.getStatus() + "\n");
        
    }
```
This design allows for the separating of the appointment management system from the specific actions taken by clients, making it easier to extend and maintain the code
## Conclusions / Screenshots / Results
In this laboratory work, I created an healthcare management system while combining the required Observer, Strategy and Mediator design patterns.

The Observer pattern was used to notify clients about changes in medical appointments, ensuring updates. The Strategy pattern allowed for flexible and interchangeable algorithms to manage prescriptions strategies, enhancing the system's adaptability. Lastly, the Mediator pattern provided a centralized communication channel for patients to request for appointments.