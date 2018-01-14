package observer;

public interface Customer {
    void subscribe(Advertisement o);
    void cancelSubscription(Advertisement o);
    void notifyObserver();
}
