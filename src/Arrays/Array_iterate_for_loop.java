package Arrays;

public class Array_iterate_for_loop {
    public static void main(String[]args){
        int [][] array_ex={{1,2,3},{4,5,6},{7,8,9}};


        for (int i=0;i< array_ex.length;i++){
            for (int j=0;j< array_ex[i].length;j++){
               // System.out.println(array_ex[i][j]);
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
