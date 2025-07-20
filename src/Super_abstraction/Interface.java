package Super_abstraction;

public class Interface {
    public static void main(String[]args){
        carf1 b1=new carf1();
        b1.drive();
    }
}
class carf1 implements Breaks, Breaks.Engine1 {

    @Override
    public void pressbreak() {

    }

    @Override
    public void stunt() {
        Engine1.super.stunt();
    }

    void drive(){

        pressbreak();
        running();
        stunt();
        skitting();

   }



    @Override
    public void running() {
        System.out.println("running");

    }

    @Override
    public void skitting() {
        System.out.println("skit");

    }
}




interface Breaks{
    void pressbreak();


    interface Engine1{
        void running();
        void skitting();

        default  void stunt(){
            System.out.println("fantastic stunt");
        }
    }
}

