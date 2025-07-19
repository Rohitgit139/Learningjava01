package oops_super_Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        car f1 = new car(100);
        f1.display();
    }


}


class vehicle{
    public int maxspeed=180;


    void notest () {
        System.out.println("Empty!");
    }


        vehicle(){
            System.out.println("default constructor");
        }

        vehicle(int a){
            System.out.println("parame constructor");
        }
    vehicle(int a,int b){
        System.out.println("parame constructor");
    }

    void message(){
        System.out.println("no return");
    }
    void message(int a ){
        System.out.println();
    }
    void display(){
        System.out.println("vehicle parent");
    }

}

class car extends vehicle{
     int maxspeed =281;

     car(){
         super(100);

     }
     void test(){}

    car(int a){
        System.out.println("pc car");
    }
@Override
    void display(){
        System.out.println("override of car");
    System.out.println(super.maxspeed);
    System.out.println(this.maxspeed);
    super.notest();
    this.test();
    }

}
