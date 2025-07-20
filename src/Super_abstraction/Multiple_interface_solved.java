package Super_abstraction;

public class Multiple_interface_solved {

    public static void main(String[]args){
        stepson new1=new stepson();
        new1.see();
    }
}






class stepson implements DAD,mother{
    @Override
    public void money() {
        System.out.println("money received");
    }

    @Override
    public void bhk() {
        System.out.println("received bhk");

    }
void see(){
        money();
        bhk();
    }
    @Override
    public void f1() {

    }
}

interface DAD{
    void money();
    void f1();

    default void de(){
        System.out.println("this is default");
    }
}

interface mother{
    void money();
    void bhk();

}




