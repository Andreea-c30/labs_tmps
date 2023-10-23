
package domain.decorator;
public abstract class BaseBillDecorator implements IBilling {

    private final IBilling wrapped;

    BaseBillDecorator(IBilling wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void bill() {
        wrapped.bill();
    }

}