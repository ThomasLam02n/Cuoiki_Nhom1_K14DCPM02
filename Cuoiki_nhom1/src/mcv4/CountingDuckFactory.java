package ccomponuntdesignepatter.mcv4;

public class CountingDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck() {
        // TODO Auto-generated method stub
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        // TODO Auto-generated method stub
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckcCall() {
        // TODO Auto-generated method stub
        return new QuackCounter(new Duckcall());
    }

    @Override
    public Quackable createRubberDuck() {
        // TODO Auto-generated method stub
        return new QuackCounter(new RubberDuck());
    }
    
}
