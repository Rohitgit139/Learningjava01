package Collection_Framework_list;

import java.util.Vector;

public class vector_01 {

    public static void main(String[]args){
        Vector v= new Vector(); ////aray
        v.add("karan");
        v.add("subhash");
        v.add("nilu");
        v.add("kn");
        System.out.println(v);
        v.remove("subhash");
        System.out.println(v);
    }
}
