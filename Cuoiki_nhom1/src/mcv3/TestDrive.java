package ccomponuntdesignepatter.mcv3;

public class TestDrive {
    public static void main(String[] args) {
        TestDrive testDrive = new TestDrive(); //tạo testDrive
        testDrive.simulate(); //gọi pt simulate
    }

    void simulate(){
        //dua nhung con vit vao trinh dem neu khong dua vao thi chung se khong duoc dem
        Quackable mallakDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new Duckcall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());
        

        //tạo ra goose như các con vit thông qua bộ chuyển đồi goose
        System.out.println("\nDuck Simulator: With Decorator");

 


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
