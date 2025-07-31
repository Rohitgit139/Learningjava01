package Collection_Framework_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.List.*;

public class Array_list_02 {
    public static void main(String[]args){
        List list=new ArrayList<>();
        list.add("milk");
        list.add("BREAD");
        list.add("HONEY");
        list.add("JAAM");
        list.add(1.5);
        list.add(1);

        System.out.println(list);
        System.out.println(list.size());


        System.out.println("----");


        for (Object o: list){
            System.out.println(o);
        }
        Iterator iterator=list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
    }
}
