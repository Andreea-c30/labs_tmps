
package domain;
public class Doctor {
   private String name, specialization;


   public Doctor(String name, String specialization) {
       this.name=name;
       this.specialization = specialization;
   }

   public String getName() {
       return name;
   }


   public void setName(String name) {
       this.name = name;
   }

 public String getSpecialization() {
       return specialization;
   }


   public void setSpecialization(String specialization) {
       this.specialization = specialization;
   }
  
}

