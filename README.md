# Topic: Creational Design Patterns


# Author: Andreea CHIPER

----

## Objectives:
&ensp; &ensp; __1. Study and understand the Creational Design Patterns.__

&ensp; &ensp; __2.Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms__

&ensp; &ensp;__3.Use some creational design patterns for object instantiation in a sample project.__

## Implementation

To implement and illustrate the  Creational design patterns, I had developed a medical appointment management system that handles patient appointments and associated data.
The classes and interfaces form the basics of the medical management system, allowing for the representation of patients, doctors, appointments and the interactions between them.

I have implemented 4 creational design patterns in various ways throughout the project such as:

1. Factory Method

    The Factory Method is a creational design pattern that provides an interface for creating objects in a super class but allows subclasses to alter the type of objects that will be created. 

    IAppointmentFactory is the factory interface that defines a method createAppointment for creating instances of the Appointment class.

    ```
    public interface IAppointmentFactory {
        Appointment createAppointment(int id, String appointmentDate, Patient patient, Doctor doctor);
    } 
    ```

    PediatricAppointmentFactory and RegularAppointmentFactory this classes implement the IAppointmentFactory interface.

    They override the createAppointment method from the interface and create PediatricAppointment and RegularAppointment instances and initialize them with the provided parameters along with an additional attribute "reason"

    ```
    public class PediatricAppointmentFactory implements IAppointmentFactory {
    @Override
    public Appointment createAppointment(int id, String appointmentDate, Patient patient, Doctor doctor) {
        return new PediatricAppointment(id, appointmentDate, patient, doctor, "Pediatric Reason");
    }
    }
    ```
    ```
    public class RegularAppointmentFactory implements IAppointmentFactory {
    @Override
    public Appointment createAppointment(int id, String appointmentDate, Patient patient, Doctor doctor) {
        return new RegularAppointment(id, appointmentDate, patient, doctor, "Regular Type");
    }
    }
    ```

2. Singleton design pattern

    The Singleton design pattern ensures that a class has only one instance and provides a global point of access to that instance. It ensures that there is only one Billing instance throughout the application, which can be accessed by multiple parts

    Having a private constructor, it cannot be instantiated from outside the class.

    The class maintains a private static variable bill to hold the single instance of the Billing class.
    The getbill() method is a public static method that provides access to the single instance of the Billing class

   ```
   public static Billing getbill() {
        if (bill == null) {
            synchronized (Billing.class) {
                if (bill == null) {
                    bill = new Billing();
                }
            }
        }
        return bill;
    }
   ```

   The bill method is a public method for performing billing operations. It takes a Patient object and a cost as parameters and it prints a message indicating the billing amount for the patient.

   ```
     public void bill(Patient patient, double cost) {
        System.out.println("Billing " + patient.getFirstName() + cost+"lei");
    }
   ```
   
3. Builder design pattern

    Builder design pattern is a useful mathod when you have classes with many properties, and it allows for more readable and maintainable code when constructing objects. I implemented this pattern for the Physician class, which allows us to construct Physician objects easily
    
    Physician Class represents a Physician object with various properties like id, firstName, lastName, email, experience_years, specialization, and position.
        
    The IBuilder Interface - defines a set of methods that represent building steps for constructing a Physician object

    ```
    public interface IBuilder {
    IBuilder id(int id);
    IBuilder firstName(String firstName);
    IBuilder lastName(String lastName);
    IBuilder email(String email);
    IBuilder expirience_years(int expirience_years);
    IBuilder specialization(String specialization);
    IBuilder position(String position) ;
     }
    ```

    PhysicianBuilder Class implements the IBuilder interface, providing methods for setting the values of the Physician properties.
    It has private fields to store the properties of a Physician, such as id, firstName, lastName, etc.


    For each property, there is a corresponding method in the builder class. When you call one of these methods, it sets the value of the associated property and returns the builder instance itself. This is an example of such method that returns the id:
    ```
    public PhysicianBuilder id(int id) {
        this.id = id;
        return this;
    }
    ```
    The build method creates a new Physician object using the values set for the properties and returns it.

    ```
    public Physician build() {
        return new Physician(id, firstName, lastName, email, expirience_years,specialization, position);
    }
    ```
4. Prototype design pattern

    The Prototype pattern allows us to create new objects by copying an existing object, which can be useful when you want to create objects with similar initial states

    IPrescriptionPrototype interface declares a method clone(), which returns a clone of an object that implements this interface.
    By extending Cloneable, it indicates that the implementing classes are cloneable.
    ```
    public interface IPrescriptionPrototype extends Cloneable {
    IPrescriptionPrototype clone(); 
    }

    ```
    MedicationPrescription class implements the IPrescriptionPrototype interface. It has a constructor that prints a message when a MedicationPrescription object is created.
    The clone method is implemented to create a clone of the MedicationPrescription object. 
    The clone method is used to create a copy.
    ```
    	public IPrescriptionPrototype clone() {
		System.out.println("MedicationPrescription was copied");
		MedicationPrescription medicine = null;
		try {
			medicine = (MedicationPrescription) super.clone();
		}
		catch (CloneNotSupportedException e) {  
			System.out.println("exception");
			e.printStackTrace();
		 }
		return medicine;
	}
    ```

    CloneFactory class is responsible for creating clones of objects that implement the IPrescriptionPrototype interface 
    The getClone method takes a IPrescriptionPrototype object as an argument and calls its clone method to create a copy of the object.
    ```
    public class CloneFactory {
            public IPrescriptionPrototype getClone(IPrescriptionPrototype sample) {
                return sample.clone();
            }
        }
    ```


## Conclusions / Screenshots / Results
In this laboratory work, I created an healthcare management system while combining the required Factory, Singleton, Builder, and Prototype design patterns. These design patterns enabled me to easily clone prescription items, ensure a single instance of the billing system, and boost up the construction of complex objects.  These design patterns are useful tools for enhancing the scalability and quality of applications.
