package ccomponuntdesignepatter.mcv2;

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

        //tạo ra goose như các con vit thông qua bộ chuyển đồi goose
        Quackable goose = new GooseAdapter(new Goose());


        System.out.println("\nDuck Simulator: With Goose Adapter");


        //mo phong duck
        simulate(mallakDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        //khi goose đã được chuyển đổi thì ngỗng sẽ thực hiện như những con vịt khã
        simulate(goose);


    }


    //phuong thuc mo phong duck
    void simulate(Quackable duck){
        //da hinh 
        //bat ki con vit nao khi qua mo phong nay se bat buoc "quack"
        duck.quack();
    }
}
