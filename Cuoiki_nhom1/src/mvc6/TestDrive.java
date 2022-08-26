package ccomponuntdesignepatter.mvc6;

public class TestDrive {
    public static void main(String[] args) {
        TestDrive duckSimulator = new TestDrive();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        
        duckSimulator.simulate(duckFactory);
        
    }

    void simulate(AbstractDuckFactory duckFactory){

        Quackable mallakDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckcCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Composite - Flocks");

        //tao flock va load no len QuackAble
        //dan vit
        Flock flockOfDuck = new Flock();
        flockOfDuck.add(redHeadDuck);
        flockOfDuck.add(duckCall);
        flockOfDuck.add(rubberDuck);
        flockOfDuck.add(gooseDuck);
        flockOfDuck.add(mallakDuck);
        

        Flock flockOfMallards = new Flock();
        //tao ra 1 dan mallards duck
        Quackable mallard1 = duckFactory.createMallardDuck();
        Quackable mallard2 = duckFactory.createMallardDuck();
        Quackable mallard3 = duckFactory.createMallardDuck();
        Quackable mallard4 = duckFactory.createMallardDuck();

        //them nhung con mallard duck nay vao flock

        flockOfMallards.add(mallard1);
        flockOfMallards.add(mallard2);
        flockOfMallards.add(mallard3);
        flockOfMallards.add(mallard4);
        
        //add dan vit  mallard vào đàn vịt chính
        flockOfDuck.add(flockOfMallards);
        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        
        simulate(flockOfDuck); //toàn bộ đàn vịt

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards); //đàn vịt mallards


     

        System.out.println("\nDuck Simulator: With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDuck.registerObserver(quackologist);
        

        simulate(flockOfDuck);

       //thuc hien dem
       System.out.println("the duck quacked " + QuackCounter.getQuack() + " times");

            }
       //phuong thuc mo phong duck
       void simulate(Quackable duck){
        //da hinh 
        //bat ki con vit nao khi qua mo phong nay se bat buoc "quack"
        duck.quack();
    }
}
