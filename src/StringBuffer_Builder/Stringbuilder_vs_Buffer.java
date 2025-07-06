package StringBuffer_Builder;

public class Stringbuilder_vs_Buffer {
    public static void main(String[]args){


        String s="rohit";
        String s1=new String("rg");


        StringBuffer stringBuffer=new StringBuffer("Rohit");
        StringBuilder stringBuilder=new StringBuilder("Rohit");
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
    }
}
