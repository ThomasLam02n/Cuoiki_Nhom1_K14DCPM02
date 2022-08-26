package ccomponuntdesignepatter.mcv5;

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
            Quackable quacker = tIterator.next();
            quacker.quack();
        }
    }   
    
}
