package String;

public class Lab_String_example {
    public static void main(String[]args){
        int index="java".indexOf("a");
        System.out.println(index);


        int indx2="java".lastIndexOf("a" );
        System.out.println(indx2);

        boolean b= "".isEmpty();
        System.out.println(b);

        CharSequence s="rohit".subSequence(1,3);
        System.out.println(s);
        CharSequence s1="promod".subSequence(1,4);
        System.out.println(s1);



    }
}
