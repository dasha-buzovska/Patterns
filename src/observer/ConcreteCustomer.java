package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCustomer implements Customer{
    private List<Advertisement> observers = new ArrayList<>();

    private int discountCardId;

    public void setValue(int value) {
        this.discountCardId = value;
        notifyObserver();
    }

    public int getDiscountCardId() {
        return discountCardId;
    }

    @Override
    public void subscribe(Advertisement o) {
        observers.add(o);
    }

    @Override
    public void cancelSubscription(Advertisement o) {
        observers.remove(o);
    }
    @Override
    public void notifyObserver() {
        for (Advertisement o : observers) {
            o.update();
        }
    }
}
