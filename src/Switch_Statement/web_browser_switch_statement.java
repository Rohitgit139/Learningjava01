package Switch_Statement;

import java.util.Scanner;

public class web_browser_switch_statement {

    public static void main (String []args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a browser name");
        String browser=scanner.next();
        browser=browser.toLowerCase();


        switch  (browser){

            case "chrome" :
                System.out.println("starting the chrome");
                System.out.println("t1");
                break;

            case "firefox" :
                System.out.println("Starting the firefox");
                break;

            case "opera":
                System.out.println("starting the opera");
                break;


            default :
                System.out.println("enter valid browser");



        }
    }
}
