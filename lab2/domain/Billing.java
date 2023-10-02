
package domain;
public class Billing {
    private static Billing bill;

    //private constructor to prevent external instantiation
    private Billing() {
    }

    //public method to get the single instance of Billing
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

    public void bill(Patient patient, double cost) {
        System.out.println("Billing " + patient.getFirstName() + cost+"lei");
    }
}
