package ccomponuntdesignepatter.mvc6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Observable implements QuackObservable {

    List<Observer> observers = new ArrayList<Observer>();
    QuackObservable duck;
        
    public Observable(QuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
     
        Iterator iterator = observers.iterator();

        while(iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    } 
    
}