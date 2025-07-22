package Exceptions;

public class Exception_06 {
    public static void main(String[] args) {


        int a = 0;
        int c1 = 0;
        try {
            c1=10/a;
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

}
