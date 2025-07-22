package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_exception {

    public static void main(String[]args){


        try{
            FileInputStream fileInputStream=new FileInputStream("c://log.text");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
