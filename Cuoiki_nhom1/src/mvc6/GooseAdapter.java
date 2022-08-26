package ccomponuntdesignepatter.mvc6;

//trien khai implement Quackable từ GooseApdapter 
//nen nhơ rang nó van la goose khong phải vit
public class GooseAdapter  implements Quackable{
    Goose goose;


    //khoi tao goose se thich nghi
    public GooseAdapter(Goose goose){
        this.goose = goose;
    }
    @Override
    public void quack() {
        //goi pt quack sao đó sẽ được ủy quyền cho honk() cua goose
            goose.honk();        
    }
    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        
    }
    
    
}
