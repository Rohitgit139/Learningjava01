package Static;

public class Static_p23{
    public static void main(String[]args){
        atbx aman=new atbx(85858585,"umesh");
        atbx rohit=new atbx(845437474,"rohit");
        System.out.println(aman.phone_no);
        System.out.println(rohit.phone_no);
        atbx.markattendance();

    }
}



 class atbx{
    int phone_no;
        String name;
        static String course_name="ATB";

     public atbx(int phone_no,String name){
         this.phone_no=phone_no;
         this.name=name;
}


void display1(){
    System.out.println(this.phone_no+this.name+this.course_name);

}
static void markattendance(){
    System.out.println("Mark attendance");
}}
