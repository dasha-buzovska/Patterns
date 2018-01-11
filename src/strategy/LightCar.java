package strategy;

public class LightCar implements Transport {

    public void ship(String address) {
        System.out.println("Your delivery will be at " + address + " tonight");
    }
}
