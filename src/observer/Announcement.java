package observer;

class Announcement implements Advertisement {
    private ConcreteCustomer customer;

    Announcement(ConcreteCustomer customer) {
        this.customer = customer;
    }

    @Override
    public void update() {
        System.out.println("Announcement for customer with id: " + customer.getDiscountCardId());
    }

}
