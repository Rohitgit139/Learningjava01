package While_Loop;

import java.util.Scanner;

public class while_loop_factorial_program {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("welcome to the program");
        System.out.println("enter the factorial no.");

        if (!scanner.hasNextInt()){
            System.out.println("Enter valid no");
        }
        int number=scanner.nextInt();
        int factorial=1;

        if(number<=0){
            System.out.println("factorial->"+factorial);
        }
        int i=1;
        while (i<=number){
            factorial=factorial*i;
            i++;
        }
        System.out.println("factorial->"+factorial);
    }
}
