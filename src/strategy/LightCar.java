package strategy;

public class LightCar implements Transport {

    public void ship(Delivery document) {
        System.out.println("Wait tonight");
    }
}
