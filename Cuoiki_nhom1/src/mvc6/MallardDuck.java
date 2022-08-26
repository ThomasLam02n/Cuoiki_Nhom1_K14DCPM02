package ccomponuntdesignepatter.mvc6;

public class MallardDuck implements Quackable{

    Observable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        observable.notifyObservers();
    }
    
}
