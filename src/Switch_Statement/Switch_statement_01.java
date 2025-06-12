package Switch_Statement;

import java.util.Scanner;

public class Switch_statement_01 {

    public static void main (String []args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the day to 1 to 7");
        int day=scanner.nextInt();


        switch (day){
            case 1:
            System.out.println("MON");
            break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
            default:
                System.out.println("enter no. between 1 to 7");


        }
    }
}
