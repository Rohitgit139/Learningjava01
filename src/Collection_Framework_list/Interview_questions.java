package Collection_Framework_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Interview_questions {
    public static void main(String[]args){
        List <Integer>a1=new ArrayList<>();
        a1.add(5);
        a1.add(7);
        a1.add(8);
        a1.add(9);

        Collections.sort(a1,Collections.reverseOrder());
        System.out.println(a1);
        for (Integer o :a1){
            System.out.println(6*o);
        }
    }
}
