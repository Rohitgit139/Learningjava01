package Exceptions;

public class Exception_01 {
    public static void main(String[]args){
        System.out.println("run the program");

        String ip  =args[0];  /// java.lang.ArrayIndexOutOfBoundsException
        int a=Integer.parseInt(ip);//java.base/java.lang.NumberFormatException.forInputString
        int b=100/a;//java.lang.ArithmeticException

        System.out.println("b");
        System.out.println("end of the program");
    }
}
