package strategy;

public class Minivan implements Transport {
    public void ship(Delivery smallDelivery) {
        System.out.println("Wait tomorrow");
    }
}
