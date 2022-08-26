package ccomponuntdesignepatter.mcv1;

public class TestDrive {
    public static void main(String[] args) {
        TestDrive testDrive = new TestDrive(); //tạo testDrive
        testDrive.simulate(); //gọi pt simulate
    }

    void simulate(){

        //thêm một số vịt
        Quackable mallakDuck = new MallardDuck();
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable duckCall = new Duckcall();
        Quackable rubberDuck = new RubberDuck();

        Quackable goose = new GooseAdapter(new Goose());

        System.out.println(" \n duckSimulatoor");

        //mo phong duck
        simulate(mallakDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
    }


    //phuong thuc mo phong duck
    void simulate(Quackable duck){
        //da hinh 
        //bat ki con vit nao khi qua mo phong nay se bat buoc "quack"
        duck.quack();
    }
}
