package Collection_Framework_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_list_input {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList<>();


        List<String> names = new ArrayList<>();

        String ContinueInput = "Y";
        while (ContinueInput.equalsIgnoreCase("Y")) {
            System.out.println("enter the name");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();


            System.out.println("do you want to add another name");
            ContinueInput=scanner.nextLine();

        }
        for (String name:names){
            System.out.println(name);
        }
        scanner.close();
    }
}
