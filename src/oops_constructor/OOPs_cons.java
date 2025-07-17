package oops_constructor;

public class OOPs_cons {
    public static void main(String[]args){

        Car2 tesla=new Car2();
        System.out.println(tesla.model);
        System.out.println(tesla.name);
        System.out.println(tesla.year);


Car2 nano=new Car2("nano",2025,"mahidrathar");
        System.out.println(nano.model);
        System.out.println(nano.year);

        Car2 bmw=new Car2("bmw",2025,"bmwa");
        System.out.println(bmw.model);
        System.out.println(bmw.year);



}}