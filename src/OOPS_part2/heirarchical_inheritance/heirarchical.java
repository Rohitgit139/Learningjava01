package OOPS_part2.heirarchical_inheritance;

public class heirarchical {
    public static void main(String[]args){
        brother1 b1=new brother1();
        b1.home();
        b1.bike();

        brother2 b2=new brother2();
        b2.home();
        b2.brotherhome2();

        sister1 s1=new sister1();
        s1.home2();
        s1.home();
    }
}
