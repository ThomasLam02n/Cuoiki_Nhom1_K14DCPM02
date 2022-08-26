package ccomponuntdesignepatter.mvc6;

public interface QuackObservable {
    public void registerObserver(Observer observer); //phuong thuc dang ki
    public void notifyObservers(); //methods thong bao cho cac nha dang ki
}
