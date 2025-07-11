package Arrays;

import java.util.Scanner;

public class Array_User_input_06 {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the size of array");

        int size= scanner.nextInt();


        String []number_of_marks=new String[size];

        for (int i=0;i< number_of_marks.length;i++){
            System.out.println("print the elements");
            number_of_marks[i]=scanner.next();
        }
        System.out.println("-----print the values");

        for(String marks :number_of_marks){
            System.out.println(marks);
        }
    }
}
