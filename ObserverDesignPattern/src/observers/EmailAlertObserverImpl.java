package observers;

import observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    StocksObservable observable;
    String emailId;
    public EmailAlertObserverImpl(StocksObservable observable,String emailId){
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update(){
        int newStocksAdded = observable.getData();
        sendMail(emailId,newStocksAdded,"product is in stock hurry up!!!");
    }

    public void sendMail(String emailId,int newStocksAdded, String message){
        System.out.println("mail sent  to : "+ emailId + " that " + newStocksAdded + "new stocks are added");
    }
}
