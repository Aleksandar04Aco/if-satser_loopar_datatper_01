import javax.swing.*;
import java.awt.*;
import java.security.SignedObject;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        //uppg1();
        //uppg2();
        //uppg3();
        //uppg4();
        uppg5();
    }

    public static void uppg1() {
        if (6 >= 3) {
            System.out.println("Hello World!");
        }
    }

    public static void uppg2() {

        Scanner name = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = name.nextLine();
        System.out.println("Username is: " + userName);

        if (userName.equals("noname")) {
            System.out.println("Welcome!");
        }
        System.out.println(userName.compareTo("noname"));
        System.out.println("noname ==" + userName);
    }

    public static void uppg3() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myScan.nextLine();

        System.out.println("Enter password");
        String passWord = myScan.nextLine();

        System.out.println("Username is: " + userName);
        System.out.println("Password is: " + passWord);
        if (userName.equals("noname") && passWord.equals("nopass")) {
            System.out.println("Welcome");
        } else {
            System.out.println("wrong username or password");
        }
    }

    public static void uppg4() {
        for (int i = 0; i < 32; i++) {
            System.out.println("Hello, World");
        }
    }

    public static void uppg5() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter password");
        String passWord = myScan.nextLine();

        while (passWord) {

            if (passWord = true)
                break;7
        }

    }


}
