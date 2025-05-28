package observable;

import observers.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    List<NotificationAlertObserver> observersList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver obj){
        observersList.add(obj);
    }
    @Override
    public void remove(NotificationAlertObserver obj){
        observersList.remove(obj);
    }

    @Override
    public void notifyObservers(){
        for(NotificationAlertObserver obj: observersList){
            obj.update();
        }
    }
    public int getData(){
        return stockCount;
    }
    public void setData(int newStocksAdded){

        stockCount = newStocksAdded;
        notifyObservers();
    }

}
