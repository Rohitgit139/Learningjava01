package Funtions;

import java.util.Scanner;

public class user_defined_funtion {

    public static void main (String[]args){

        //WITHOUT PARAMETER AND WITHOUT RETTURN TYPE
        wp_wr_greet();
        //without parameters but with return type
        String msg =greet_with_wp_with_rt();
        System.out.println(msg);

        //3.with parameters and without return type

        greet_with_details( "rohit" ,26, 9000);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name");
        String name=scanner.next();
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        System.out.println("enter your salary");
        double salary=scanner.nextDouble();


        //4.
        int sum=sum_of_two_numbers(20,30);
        int sum2=sum_of_three_numbers(20,30,40);
        System.out.println(sum);
        System.out.println(sum2);


    }
    //1.WITHOUT PARAMETER AND WITHOUT RETTURN TYPE
    static void wp_wr_greet(){
        System.out.println("how are you?");
    }
//2.without paratmeter but with return type

    static String greet_with_wp_with_rt(){
        System.out.println("hii");
        return "hii how are you?";

    }
//3.with parameters and without return type

    static void greet_with_details(String name,int age,double salary){
        System.out.println("your name is->"+name+"\nyour age is "+age+"\n your salary is"+salary);
    }

//4.with parameter and with return type

    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
    static int sum_of_three_numbers(int a,int b,int c){
        return a+b+c;
    }



}




