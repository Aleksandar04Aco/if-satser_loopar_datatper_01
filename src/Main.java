import javax.swing.*;
import java.awt.*;
import java.security.SignedObject;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        //uppg1();
        uppg2();
    }

    public static void uppg1(){
        if (6>=3){
            System.out.println("Hello World!");
        }
}

    public static void uppg2(){

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

    public static void uppg3(){

    }
}
