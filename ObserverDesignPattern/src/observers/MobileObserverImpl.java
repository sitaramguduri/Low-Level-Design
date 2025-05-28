package observers;

import observable.StocksObservable;

public class MobileObserverImpl implements NotificationAlertObserver{

    StocksObservable observable;
    int phoneNumber;
    public MobileObserverImpl(StocksObservable observable, int phoneNumber){
        this.observable = observable;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void update(){
        int newStocksAdded = observable.getData();
        sendMessageToPhone(newStocksAdded, "new stocks are added hurry up ");
    }
    public void sendMessageToPhone(int newStocksAdded, String message){
        System.out.println(newStocksAdded + message + phoneNumber );
    }
}
