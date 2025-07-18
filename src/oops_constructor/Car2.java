package oops_constructor;

public class Car2 {


    String name;
    int year;
    String model;

     Car2() {
        name="xxx";
        year=2025;
        model="mahidra";
        System.out.println("dc");

    }
    Car2(String model_name,int year_created,String model_has){
         this.name=model_name;
         this.year=year_created;
         this.model=model_has;

    }
}
