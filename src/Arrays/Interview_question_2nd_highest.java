package Arrays;

import java.util.Arrays;
public class Interview_question_2nd_highest {
    public static void main(String[]args){
        int numbers[]={20,30,40,50,60,70};

       // Arrays.sort(numbers);
        //System.out.println(numbers[numbers.length-2]);

        int higest=0;
        int secondhigest=0;

        for(int num:numbers){

            if(num>higest){
                secondhigest=higest;
                higest=num;
            } else if (num>secondhigest && num !=higest) {

                secondhigest=num;
                
            }

        }
        System.out.println(secondhigest);
    }
}
