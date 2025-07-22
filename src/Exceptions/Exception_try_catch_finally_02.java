package Exceptions;

import java.util.Scanner;

public class Exception_try_catch_finally_02 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        try {
            int v= scanner.nextInt();
            int a=10/v;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("closing sc");
        }
    }
}
