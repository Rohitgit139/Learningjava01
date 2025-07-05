package String;

public class Interview_question_02 {
    public static void main(String[]args){
        String a="hello" ;
        String a2="hello" ;
        String a3="hello" ;
        String a5="hello" ;


        String a6=new String("manoj");
        String a7=new String("manoj");
        String a8=new String("manoj");


        System.out.println(a==a7);
        System.out.println(a6==a7);
        System.out.println(a8==a7);
        System.out.println(a==a5);

        /// equals -->check content

        System.out.println(a.equals(a7));
        System.out.println(a6.equals(a7));
        System.out.println(a8.equals(a3));
        System.out.println(a.equals(a2));
        System.out.println(a.equals(a7));


    }
}
