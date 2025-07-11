package Arrays;

public class Array_Max_min_05 {

    public static void main(String[]args){


        int [] array={100,20,30,40,50,60,70};
        int max=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }


        }
        System.out.println("max is  "+max);
    }
}
