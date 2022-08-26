package ccomponuntdesignepatter.mvc6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable{
    //su dung arraylist trong flock de moi quackable thuoc ve flock
    
    List<Quackable> quackers = new ArrayList<Quackable>();
    //them 1 phuong thuc add() quackable 
    public void add(Quackable quacker){
            quackers.add(quacker);
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        Iterator<Quackable> tIterator = quackers.iterator();
        while(tIterator.hasNext()){
            Quackable duck = tIterator.next();
            duck.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable duck = iterator.next();
            duck.quack();
        }
        
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        
    }   
    
}
