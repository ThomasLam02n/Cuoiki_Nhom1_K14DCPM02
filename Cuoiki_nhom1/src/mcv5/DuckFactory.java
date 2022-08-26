package ccomponuntdesignepatter.mcv5;

public class DuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck() {
        // TODO Auto-generated method stub
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        // TODO Auto-generated method stub
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckcCall() {
        // TODO Auto-generated method stub
        return new Duckcall();
    }

    @Override
    public Quackable createRubberDuck() {
        // TODO Auto-generated method stub
        return new RubberDuck();
    }
    
}
