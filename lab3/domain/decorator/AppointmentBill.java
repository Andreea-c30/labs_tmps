package domain.decorator;

public class AppointmentBill implements IBilling {

    private  String name;
    private double cost;

    public AppointmentBill(String name,double cost) {
        this.name = name;
        this.cost=cost;
    }

    @Override
    public void bill() {
        System.out.println("Fee for the appointment " + name + " cost " + cost);
    }

}