package Generics;



public class Generic_class {
    public static void main(String[]args){
 Genericclass g1=new Genericclass(10);
        Genericclass g2=new Genericclass("rohit");
        Genericclass g3=new Genericclass(3.14);
    }
}

class Genericclass <T>{
    private T data;


    public T getData() {
        return data;
    }

    public Genericclass(T data){
        this.data=data;

    }
}