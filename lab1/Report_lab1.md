# Topic: SOLID Principles


# Author: Andreea CHIPER

----

## Objectives:
&ensp; &ensp; __1. Study and understand the SOLID Principles.__

&ensp; &ensp; __2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.__

&ensp; &ensp;__3. Create a sample project that respects SOLID Principles.__

## Implementation

To illustrate the SOLID principles in action, I had developed a medical appointment management system that handles patient appointments and associated data.
The classes and interfaces form the basics of the medical management system, allowing for the representation of patients, doctors, appointments, and the interactions between them.

The SOLID principles have been implemented in various ways throughout the project such as:

1. Single responsibility principle

    Appointment Class - has a single responsibility, representing an appointment and managing its related data, such as date, patient, and doctor. PediatricAppointment and RegularAppointment classes are handling their own type of appointments.

    Patient and Doctor Classes - focus on individual responsibilities, representing patients and doctors, respectively. They do not attempt to handle unrelated concerns.

2. Open-closed principle 

    The code allows for the extension of classes through inheritance. For instance, PediatricAppointment and RegularAppointment extending Appointment. In this way, is is possible to add new types of appointments without modifying existing code. 
   Also, using the Physician class which represents a general medical worker, the Doctor class is an inherited class from it. Therefore, it is possbile to add new types of medical workers that extend the Physician class and not break the Open-closed principle.
   
3. Liskov substitution principle 

    The Liskov substitution principle is one of the SOLID principles that focuses on the behavior of subclasses when they are used in place of their parent class.
 The Appointment class serves as the base class, defining the common attributes and behaviors related to appointments. It contains properties like appointmentDate, patient, and doctor.
Both RegularAppointment and PediatricAppointment are subclasses of Appointment. They inherit the properties and methods of the parent class.

    The key point of LSP is that instances of the derived classes (RegularAppointment and PediatricAppointment) can be used interchangeably with instances of the base class (Appointment) without causing unexpected behavior or violating the principle.

5. Interface segregation principle

    The IBilling and IRecords interfaces seem focused on specific responsibilities.
    The IBilling interface defines a clear contract related to billing operations. It includes a single method, ```bill(Patient patient, double cost)```, which is directly related to billing and invoicing patients.

    The IRecords interface similarly relates to ISP by focusing on a specific contract related to medical record management. It defines a single method, ```updateRecord(String newRecord)```, which is directly related to updating patient medical records.

6. Dependency inversion principle 

    Doctor Class depends on the abstract Physician class rather than concrete implementations. This sticks to dependency inversion by relying on abstractions.

    Moreover, Patient Class implements interfaces IBilling and IRecords rather than depending on concrete implementations, aligning with the principle


## Conclusions / Screenshots / Results
In this laboratory work, it was implemented an appointment management system to illustrate the practical application of SOLID principles. These rules, which are taken into account in order to write clean code, guided the development process. I was able to create a well-structured system by following SOLID. It was prioritized single responsibilities, supported extensibility, made sure that classes could be substituted correctly, reduced interface disorder, and supported abstraction in dependencies.

