package Exceptions;

import java.io.FileReader;

public class Interview_QS_03 {
    public static void main(String[]args){
        try {
            FileReader fileReader=new FileReader("c//asdf");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }
    }
}
