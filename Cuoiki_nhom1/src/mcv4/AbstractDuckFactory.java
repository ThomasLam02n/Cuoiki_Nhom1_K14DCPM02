package ccomponuntdesignepatter.mcv4;

public abstract class AbstractDuckFactory { //xac dinh nha may truu tuong bao gom các con họ khác nhau\

    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createDuckcCall();
    public abstract Quackable createRubberDuck();
    
}
