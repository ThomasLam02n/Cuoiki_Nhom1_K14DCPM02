package ccomponuntdesignepatter.mcv4;

public class TestDrive {
    public static void main(String[] args) {
        TestDrive testDrive = new TestDrive(); //tạo testDrive
        AbstractDuckFactory duckFactory = new CountingDuckFactory(); //tạo ra duckfactory và truyen no vao simulate
        testDrive.simulate(duckFactory); //gọi pt simulate
    }

    void simulate(AbstractDuckFactory duckFactory){
        //tạo một duckFactory sử dụng no để tạo vịt thay vì tạp truc tiếp
        Quackable mallakDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckcCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        

   
        System.out.println("\nDuck Simulator: With Abstract Factory");

 


        //mo phong duck
        simulate(mallakDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        //khi goose đã được chuyển đổi thì ngỗng sẽ thực hiện như những con vịt khã
        simulate(gooseDuck);

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
