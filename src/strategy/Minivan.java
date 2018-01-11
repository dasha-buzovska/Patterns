package strategy;

public class Minivan implements Transport {
    public void ship(String address) {
        System.out.println("Your delivery will be at " + address + " tomorrow");
    }
}
