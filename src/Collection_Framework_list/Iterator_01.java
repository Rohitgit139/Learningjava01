package Collection_Framework_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_01 {
    public static void main(String[]args){
        List<String> names=new ArrayList<>();
        names.add("rohit");
        names.add("ravindra");
        names.add("gaikwad");
        System.out.println(names);

        for(String str:names){
            System.out.println(str);
        }

        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }


        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

