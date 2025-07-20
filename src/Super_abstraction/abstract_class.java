package Super_abstraction;

public class abstract_class {

    public static void main(String[]args){
 son s1=new son();
 s1.loan50k();


    }
}


class normal{
    //concrete class---complete class
}

abstract class Father{
    abstract void loan50k();
}

class son extends Father{

    @Override
    void loan50k() {

    }
}