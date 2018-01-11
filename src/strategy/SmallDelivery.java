package strategy;

public class SmallDelivery implements Delivery {
    @Override
    public void send() {
        Transport transport = new Minivan();
        transport.ship(this);
        System.out.println("Small delivery sending...");
    }
}
