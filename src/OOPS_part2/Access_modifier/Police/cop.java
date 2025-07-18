package OOPS_part2.Access_modifier.Police;

public class cop {


    private int gun;
    String Idcard;


     public cop(int gun) {
         this.gun = gun;
     }
         protected void canIshoot(){
             System.out.println("yes you can shoot");

     }
}
