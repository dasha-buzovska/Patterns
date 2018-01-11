package strategy;

public class Context {
    private Transport transport;

    void setTransport(Transport transport) {
        this.transport = transport;
    }

    void perform(String address) {
        transport.ship(address);
    }
}
