package Arrays;

import java.util.Scanner;

public class Right_Traingle {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = scanner.nextInt();


        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
        }
            System.out.println();
    }
}}
