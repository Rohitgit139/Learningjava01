package Collection_Framework_list;

import java.util.ArrayList;
import java.util.List;

public class Array_list_01 {
    public static void main(String[]args){
        List list=new ArrayList<>();
        list.add("1");
        list.add("6");
        list.add("7");
        list.add("18");
        list.add("1");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("18"));

        System.out.println(list);

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));

        }

        for (Object o:list){
            System.out.println(o);
        }
    }
}
