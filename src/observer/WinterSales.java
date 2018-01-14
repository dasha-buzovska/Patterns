package observer;

class WinterSales implements Advertisement {
    private ConcreteCustomer customer;

    WinterSales(ConcreteCustomer customer) {
        this.customer = customer;
    }
    @Override
    public void update() {
        System.out.println("Winter sales for client with id: " + customer.getDiscountCardId());
    }
}
