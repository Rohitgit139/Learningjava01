package OOPS_part2.Polymorphism.method_overriding;

public class Real_example {
    public static void main(String[]args){


        tc_chrome tc=new tc_chrome();
        tc.browser();
    }

}
class Commontoalltc{
    void browser(){
        System.out.println("open the browser");
    }
}

class tc_chrome extends Commontoalltc{
    @Override
      void browser(){
          System.out.println("open crome browser");
      }}