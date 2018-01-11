package strategy;

public class Main {
    public static void main(String[] args) {
        Delivery document = new Document();
        SmallDelivery smallDelivery = new SmallDelivery();
        document.send();
        smallDelivery.send();
    }
}
