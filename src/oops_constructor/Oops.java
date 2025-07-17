package oops_constructor;

public class Oops {
public static void main(String[]args){

    baby a1=new baby();
    new baby();
    new baby();
}

}

class baby{
    String name;

    public baby() {
        System.out.println("new object is created");

    }
}
