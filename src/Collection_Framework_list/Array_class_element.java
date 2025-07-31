package Collection_Framework_list;

import java.util.ArrayList;
import java.util.List;

public class Array_class_element {

    public static void main(String[]args){
        Student s1=new Student("666","rohit");
        Student s2=new Student("55","rk");
        Student s3=new Student("1","sg");


        List<Student>mystudents=new ArrayList<>();
        mystudents.add(s1);
        mystudents.add(s2);
        mystudents.add(s3);

        System.out.println(mystudents);
    }
}
