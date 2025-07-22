package Exceptions;

public class Exception_04 {
    public static void main(String[]args){
        String name=null;
        try {
            name.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
