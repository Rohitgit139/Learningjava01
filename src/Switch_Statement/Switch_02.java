package Switch_Statement;

import java.util.Scanner;

public class Switch_02 {
    public static void main (String[]args){
        System.out.println("Enter a day between (1 to 7)");
        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();


        switch (day){

            case 1 :
                System.out.println("mon");
                break;

            case 2 :
                System.out.println("tue");
                break;
                }


        }

    }


