package Collection_Framework_list;

import java.util.ArrayList;
import java.util.List;

public class Nested_ArrayList {
    public static void main(String[]args){
        List <String>Fruits=new ArrayList<>();
        Fruits.add("mango");
        Fruits.add("apple");
        Fruits.add("banana");
        System.out.println(Fruits);


        List Fruits2=new ArrayList<>();
        Fruits2.add("strawberry");
        Fruits2.add("chiku");
        Fruits2.add("guvava");
        System.out.println(Fruits2);

        List vegetables=new ArrayList<>();
        vegetables.add("tomato");
        vegetables.add("potato");
        vegetables.add("bhindi");
        System.out.println(vegetables);


        List All_combined=new ArrayList<>();
        All_combined.add(Fruits);
        All_combined.add(Fruits2);
        All_combined.add(vegetables);
        System.out.println(All_combined);
        System.out.println(All_combined.size());
        System.out.println(All_combined.get(0));

    }
}
