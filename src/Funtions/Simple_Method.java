package Funtions;

public class Simple_Method {
    public static void main(String[]args){
// non return type does not return anything
        non_return_type_funtion();
 int a=return_type_func();
        System.out.println(a);}
//non return type only print data but not return anything
         static  void non_return_type_funtion(){
            System.out.println("hii non return type funtion");
        }
//return type funtion,it will return a particular data it will be string,boolean,byte,long
        static int return_type_func(){
            System.out.println("return type of funtion");
            return 10;
        }

    }

