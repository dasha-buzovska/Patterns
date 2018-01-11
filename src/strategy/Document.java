package strategy;

public class Document implements Delivery {
    @Override
    public void send() {
        Transport transport = new LightCar();
        transport.ship(this);
        System.out.println("Document sending...");
    }
}
