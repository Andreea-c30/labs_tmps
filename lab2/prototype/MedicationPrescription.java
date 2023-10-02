

package prototype;
public class MedicationPrescription implements IPrescriptionPrototype {
// Fields and methods specific to MedicationPrescription
public MedicationPrescription(){
		System.out.println("MedicationPrescription was created");	
	}
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

	public String toString(){
		return "This is a medical prescription!";
	}
	
 
}