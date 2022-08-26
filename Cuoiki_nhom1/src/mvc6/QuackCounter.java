package ccomponuntdesignepatter.mvc6;

public class QuackCounter implements Quackable {//trien khai tager

    Quackable duck;

    static int numberOfQuacks; // bien dem 

    //nhan tham chieu Quackable
    public QuackCounter(Quackable duck){
        this.duck =duck;
        
    }
    @Override
    public void quack() {
        // TODO Auto-generated method stub
            duck.quack();
            numberOfQuacks++;
    } 

    //tao pt getQuack
    public static int getQuack(){
        return numberOfQuacks;
    }
    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        duck.registerObserver(observer);
    }
    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        duck.notifyObservers();
    }
}
