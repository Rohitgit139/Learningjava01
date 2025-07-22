package Exceptions;

public class Exception_05 {
    public static void main(String[] args) {


    int a = 0;
    int c1 = 0;
        try {
            c1=10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
