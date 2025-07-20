package Static;

public class real_automation_Example {
    public static void main(String[]args){
automation1 a1=new automation1();
        System.out.println(a1.driver);
        System.out.println(automation1.driver1);
        automation1.driver="safari";
        System.out.println(a1.driver);
        System.out.println(a1.driver1);
    }
}

class automation1{
    static String driver="Chrome";
    static String driver1="firefox";
}
