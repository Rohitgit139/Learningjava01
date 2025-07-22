package Exceptions;

public class Exception_09 {
    public static void main(String[]args){
        try {
            String ip=args[0];
            int a=Integer.parseInt(ip);
            int b=100/a;
            System.out.println(b);
        } catch (NumberFormatException |ArithmeticException|ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("always call");
        }
    }
}
