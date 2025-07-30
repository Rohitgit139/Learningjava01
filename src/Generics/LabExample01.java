package Generics;

public class LabExample01 {
    public static void main(String[]args) {
        int a = sum(3, 4);
        double result_double=sum(15.3,60.4);
        System.out.println(a);
        System.out.println(result_double);
    }



        static  int sum(int a,int b){
         return a+b;
        }
    static  double sum(double a,double b){
        return a+b;
    }
    }

