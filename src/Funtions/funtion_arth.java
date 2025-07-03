package Funtions;

import java.util.Scanner;

public class funtion_arth {

    public static void main (String[]args){




                Scanner sc = new Scanner(System.in);
                int a = getInt(sc, "Enter the first number:");
                int b = getInt(sc, "Enter the second number:");
                System.out.println("You entered: " + a + " and " + b);
                sc.close();

                int result_sum=sum(a,b);
                int result_sub=sub(a,b);
                int result_mul=mul(a,b);
                int result_div=div(a,b);


                System.out.println(result_sum);
                System.out.println(result_div);
                System.out.println(result_mul);
                System.out.println(result_sub);
            }

            static int getInt(Scanner sc, String msg) {
                System.out.println(msg);
                if (sc.hasNextInt()) return sc.nextInt();
                System.out.println("Enter an int only.");
                System.exit(0);
                return 0; // Unreachable, but required for compilation
            }


            static int sum (int a, int b){
                return a+b;
        }
        static int sub(int a , int b){
                return a-b;

        }
static int mul(int a, int b){
                return a*b;
}
static int div(int a , int b) throws ArithmeticException{
                if(b==0){
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return a/b;
}
    }


