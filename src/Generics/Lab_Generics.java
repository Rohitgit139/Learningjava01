package Generics;

public class Lab_Generics {
    public static void main(String[]args){
        temp_sum(3,4);
        temp_sum(3.5,6.7);
    }
    static <T>T temp_sum(T a, T b){
        System.out.println(a +""+ b);
        return null;
    }
}
