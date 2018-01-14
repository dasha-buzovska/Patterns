package observer;

public class Program {
    public static void main(String[] args) {
        ConcreteCustomer customer = new ConcreteCustomer();
        Announcement ad1 = new Announcement(customer);
        WinterSales ad2 = new WinterSales(customer);
        customer.subscribe(ad1);
        customer.subscribe(ad2);
        customer.setValue(3);
        customer.setValue(8);
        customer.cancelSubscription(ad1);
        customer.setValue(4);
    }
}


