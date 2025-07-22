package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Interview_qs_02 {
    public static void main(String[]args){
      try {
          FileReader fileReader=new FileReader("c://abc");
      }catch (FileNotFoundException e){
          System.out.println(e.getMessage());



          }
      }



        }
