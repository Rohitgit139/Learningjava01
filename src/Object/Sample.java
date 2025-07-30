package Object;

public class Sample extends LabObject{

    public String toString(){
        System.out.println("this is coming from object class");

        return null;
    }
    public int hashCode(){
        System.out.println("coming from object");
        return 0;
    }

    public boolean equals(Object obj){
        System.out.println("this is also coming from object class");
        return true;
    }
}
