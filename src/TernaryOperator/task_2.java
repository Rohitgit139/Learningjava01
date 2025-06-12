package TernaryOperator;

public class task_2 {

    public static void main (String []args){

        int a=30;
        int b=40;
        int c=60;


        int max =(a>b)?(a>c)?a:c:((b>c)?b:c);
        System.out.println(max);
    }
}
