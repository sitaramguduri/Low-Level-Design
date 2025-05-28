package observable;

import observers.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver obj);
    public void remove(NotificationAlertObserver obj);
    public void notifyObservers();
    public int getData();
    public void setData(int newStockAdded);

}
