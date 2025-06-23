package While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Guessing_no_while_loop {
    public static void main(String[]args){

        Random random=new Random();
        int numberToGuess= random.nextInt(100)+1;
        System.out.println(numberToGuess);

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int guess;
        int attempts=0;

        while (true){
            if(!scanner.hasNextInt()){
                System.out.println("INVALID NO,PLEASE ENTER NO.");
                scanner.next();
                continue;
            }


            guess= scanner.nextInt();
            attempts++;

            if(guess<numberToGuess){
                System.out.println("too low,try again");
            }else if(guess>numberToGuess){
                System.out.println("too high,try again");
            }else {
                System.out.println("correct,you guessed->" +attempts+ "attempts");
                break;
            }
        }
    }
}
