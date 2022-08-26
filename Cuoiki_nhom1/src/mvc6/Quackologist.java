package ccomponuntdesignepatter.mvc6;

public class Quackologist implements Observer{

    @Override
    public void update(QuackObservable duck) {
        // TODO Auto-generated method stub
        System.out.println("Quackologist: " + duck + " just quacked");
    }
    
}
