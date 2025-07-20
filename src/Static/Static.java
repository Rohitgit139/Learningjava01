package Static;

public class Static {

    public static  void main(String[]args){
        student s1=new student(23);
        student s2=new student(45);

        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(student.course_name);
        System.out.println(s1.course_name);
    }
}
class student{
    int age;
    static String course_name="ATB";


    public student(int age_c){
        this.age=age_c;
    }

    static void m1(){
        System.out.println("I am the static method");
    }
}

