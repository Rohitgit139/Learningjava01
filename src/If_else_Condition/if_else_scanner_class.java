package If_else_Condition;

import java.util.Scanner;

public class if_else_scanner_class {
    public static void main(String[]args){
        System.out.println("Enter your age");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        if (age>18){
            System.out.println("Your are allow to vote");
        }else {
            System.out.println("YOur are not allow to vote");
        }
    }
}
