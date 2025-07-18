package OOPS_part2.Polymorphism.method_overloading;

public class Method_overloading {
    public static void main(String[]args){
        Math_operations m1=new Math_operations();
    int r= m1.add(4,5);
        System.out.println(r);


        double r1=m1.add(54.23,43.54);
        System.out.println(r1);

        int a1=m1.add(4,5,6);
        System.out.println(a1);
    }
}
