# Topic: Structural Design Patterns


# Author: Andreea CHIPER

----

## Objectives:
&ensp; &ensp; __1. Study and understand the Structural Design Patterns.__

&ensp; &ensp; __2. As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user.__

&ensp; &ensp;__3. Implement some additional functionalities, or create a new project using structural design patterns__

## Implementation

To implement and illustrate the Structural design patterns, I had developed a medical appointment management system that handles patient appointments and associated data. The classes and interfaces form the basics of the medical management system, allowing for the representation of doctors, appointments,bills, prescriptions and the interactions between them.

I have implemented 4 structural design patterns in various ways throughout the project such as:

1. Adapter

Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together. 

The IPrescription is an interface that defines an interface for prescriptions. It has three methods: prescriptionType(), writePrescription(), and validation()

 ```
 public interface IPrescription {
    void prescriptionType();
    void writePrescription();
    boolean validation();

}
 ```
   
MedicationPrescription class represents a medication prescription and can implement directly the IPrescription interface. It provides specific functionality for medication prescriptions, including writing the prescription and validating it.

However PhysicalTherapy class represents a physical therapy treatment plan. It has its own methods for prescribing and executing the treatment plan and can not implement directly the IPrescription interface. For intance this are the methods from the class:

```
public void prescribePhysicalTherapy() {
        System.out.println("Prescribing physical therapy");
    }

    public void executeTreatmentPlan() {  

        System.out.println("Executing treatment plan:");
       
        System.out.println("Plan: " + treatmentPlan);

    }

```
Thus it will use PhysicalTherapyAdapter to adapt to the interface.

PhysicalTherapyAdapter is the adapter class that allows instances of PhysicalTherapy to be treated as IPrescription. It delegates the calls to the appropriate methods of the PhysicalTherapy class such as:
```
  @Override
    public void prescriptionType() {
        physicalTherapy.prescribePhysicalTherapy();
    }

    @Override
    public void writePrescription() {
        physicalTherapy.executeTreatmentPlan();
    }

```

This approach allows us to work with different types of prescriptions in a consistent way.

2. Bridge

The Bridge pattern is used to separate an object's abstraction from its implementation, allowing both to vary independently. 

Havin an abstract class Appointment contains common attributes such as id, appointmentDate, patient, and doctor.
It also declares abstract methods schedule() and update()

```
public abstract class Appointment{
    int id;
    String appointmentDate;
    String patient,doctor;

    public abstract void schedule();
    public abstract void update();
}
```

RegularAppointment and UrgentAppointment classes extend Appointment and implement the schedule() and update() methods specific to regular and urgent appointments

Registry is the abstract class that serves as the implementor. It contains a reference to an Appointment object.
``` 
protected Appointment appointment;
```
It declares abstract methods addId(), addDoctor(), and addPatient(), which are used to set appointment attributes.
```
    abstract void addId();
    abstract void addDoctor();
    abstract void addPatient();
```
It has a createappointment() method that orchestrates the creation of appointments by first adding attributes and then scheduling the appointment
```
public void createappointment(){
        addDoctor();
        addPatient();
        addId();
        appointment.schedule();
        System.out.println("Appointment Created Scuccessfully!");
    }
```  
PediatricRegistry and AdultRegistry these classes extend Registry and implement the abstract methods to set attributes specific to pediatric and adult appointments, such as the patient's name and doctor's name.
For instance the PediatricRegistry:
```
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
```
The bridge pattern allows to separate the abstraction, the type of appointment and its attributes, from the implementation and provides flexibility in creating various types of appointments.

3. Decorator

The Decorator pattern is a structural design pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.
   
IBilling is the interface that defines the common interface for all billing objects
```
public interface IBilling {
    void bill();
}
```

AppointmentBill class implements the IBilling interface and represents a basic billing object for appointments. It has attributes like name and cost and provides a bill method to print the appointment cost.

BaseBillDecorator is an abstract class that implements the IBilling interface. It contains a reference to another IBilling object named wrapped and asign the bill method to the wrapped object.
```
 @Override
    public void bill() {
        wrapped.bill();
    }
```
This serves as the base class for concrete decorators.

MedicationBillDecorator class extends BaseBillDecorator and represents a decorator for medication billing. It adds medication costs to the bill by overriding the bill method.
```
@Override
    public void bill() {
        super.bill();
        System.out.println("Fee for medication : " + " cost " + cost);
    }
```

With decorator design pattern we can create various billing components and decorate them with additional functionalities without altering their core behavior. In this case, the MedicationBillDecorator adds costs to the appointment bill.

4. Composite

The Composite pattern is a structural design pattern that allows you compose objects into tree structures to represent part-whole hierarchies.

IMedicalProfessional is the interface that defines the common interface for both individual medical professionals and medical groups

```
public interface IMedicalProfessional {
    void prescribeMedication(Patient patient, String medication);
    String getName();
}

```

MedicalGroup class represents a group of medical professionals, which is a composite object. 

It maintains a list of I
IMedicalProfessional objects:

``` 
private List<IMedicalProfessional> professionals = new ArrayList<>();
```


It provides methods to add and remove medical professionals:
```
public void addMedicalProfessional(IMedicalProfessional professional) {
        professionals.add(professional);
    }

    public void removeMedicalProfessional(IMedicalProfessional professional) {
        professionals.remove(professional);
    }
```

The prescribeMedication method is implemented to prescribe medication prescription to all the medical professionals within the group.
```
@Override
    public void prescribeMedication(Patient patient, String medication) {
        for (IMedicalProfessional professional : professionals) {
            professional.prescribeMedication(patient, medication);
        }
    }
```
The getName method returns the name of the medical group.
```
@Override
    public String getName() {
        
        return "Medical Team";
    }
```
Physician also named as the leaf is the class that represents an individual medical professional, in this case, a physician.
It implements the IMedicalProfessional interface and provides specific functionality for a physician.
The prescribeMedication method allows the physician to prescribe medication to a patient.
```
 @Override
    public void prescribeMedication(Patient patient, String medication) {
        System.out.println(this.getFirstName() + " " + this.getLastName() + " prescribes " + medication + " to " + patient.getFirstName()+" "+patient.getLastName());
    }
```
The getName method returns the physician's name.

```
 @Override
    public String getName() {
        return this.getFirstName() + " " + this.getLastName();
    }
```

## Conclusions / Screenshots / Results
In this laboratory work, I created an healthcare management system while combining the required Adapter, Bridge, Composite, and Decorator design patterns.The Adapter facilitated seamless integration of prescription types, the Bridge structured medical professionals and groups, the Composite organized appointments, and the Decorator dynamically enhanced billing. These design patterns made the system versatile, adaptable, and organized, ensuring its effectiveness in healthcare management.
