package Super_abstraction;

public class ACK {
    public static void main(String[]args){
Audi car =new Audi();
car.driver();
    }
}


class Audi extends Engine implements Tyre.gear,Tyre{


    void driver(){
        startEngine();
        stopEngine();
        changegear1();
        buriningtyre();
        blacktwotyre();

    }
@Override
    void startEngine(){
        System.out.println("starting the audi");
    }

    @Override
    public void buriningtyre() {

    }

    @Override
    public void blacktwotyre() {

    }

    @Override
    public void m2() {
        Tyre.super.m2();
    }

    @Override
    public void changegear1() {

    }
}
abstract class Engine{
    abstract void startEngine();


    void stopEngine(){
        System.out.println("stop");
    }
}


interface Tyre{
    void buriningtyre();
    void blacktwotyre();


    default void m2(){

    }
    static void k2(){

    }
    interface gear{
        void changegear1();

    }
}