
package domain.decorator;
public class MedicationBillDecorator extends BaseBillDecorator {
    double cost;
    public MedicationBillDecorator(IBilling wrapped,double cost) {
        super(wrapped);
        this.cost=cost;
    }

    @Override
    public void bill() {
        super.bill();
        System.out.println("Fee for medication : " + " cost " + cost);
    }

}