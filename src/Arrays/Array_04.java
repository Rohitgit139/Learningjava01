package Arrays;

public class Array_04 {
    public static void main(String[]args){
        int []marks={91,92,93,94,100,102};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);


        }
        System.out.println("-----Enhanced for loop----");
        for (int mark :marks){
            System.out.println(mark);
        }

    }
}
