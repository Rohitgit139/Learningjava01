package Increment_decrement;

public class Task_02 {
    public static void main (String[]args){

        int a=11;
        int b=22;
        int c=a+b+a++ +b++ + ++a + ++b;
        System.out.println(c);

        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("c=" +c);


    }
}


//11 + 22+11 +22 +13 +24

//14 +11