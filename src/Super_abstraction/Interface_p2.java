package Super_abstraction;

public class Interface_p2 {
}
class f2 implements t1,t2{

    @Override
    public void task() {

    }

    @Override
    public void task2() {

    }

    @Override
    public void imagination() {

    }
}




interface t1{
    void task();
}
interface t2{
    void task2();
    void imagination();

    default void task5(){
        System.out.println("i like chess");
    }
}