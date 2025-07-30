package Collection_Framework_list;


import java.util.ArrayList;
import java.util.List;

public class List_01 {
    public static void main(String[]args){
        List fruits = List.of("oranges", "Banana", "mango");
        System.out.println(fruits);

        List arrayList=new ArrayList<>();////dynamic dispatch
        arrayList.add("rohit");
        arrayList.add("gaikwad");
        arrayList.add("kailash");
        arrayList.add("gaikwad");//duplicate
        arrayList.add(1);//different data type
        System.out.println(arrayList.size());
        System.out.println(arrayList);

    }
}
