import observable.IphoneObservableImpl;
import observable.StocksObservable;
import observers.EmailAlertObserverImpl;
import observers.MobileObserverImpl;
import observers.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new MobileObserverImpl(iphoneStockObservable,9999999);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl(iphoneStockObservable, "abc@gmail.com");
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.setData(10);



    }
}