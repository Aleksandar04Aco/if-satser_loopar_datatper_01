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
        //uppg5();
        //uppg6();
        //uppg7();
        slutovning();
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
        String passWord = (myScan.nextLine());


        while (true) {

            System.out.println("Password is: " + passWord);

            if (Objects.equals(passWord, "Cake")) {
                break;
            } else {
                System.out.println("Incorect password");
                System.out.println("Enter password");
                passWord = (myScan.nextLine());
            }

       /* public static void livTest(){
        int i= 0;
            while (true){
                if(i==5) {
                    break;
                }
                    System.out.println(i);
                    i++;
         */

        }
    }

    public static void uppg6() {
        Scanner myScan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("skriv in ett nummer");
            String str = myScan.nextLine();

            int number = Integer.parseInt(str);
            System.out.println(number);

            if (number > 5) {
                System.out.println("Högre än 5!");
                break;

            } else {
                System.out.println("Nummret är inte högre än 5");
            }
        }

    }

    public static void uppg7() {
        Scanner myScan = new Scanner(System.in);
        int ord= 0;
        while(true) {


            try {
                System.out.println("ett tal tack");
                ord = myScan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("inte ett tal");
                myScan.next();

            }
        }



    }

    public static void slutovning() {
        Scanner myScan = new Scanner(System.in);
        int rattTal = 64;
        int gissatTal=0;

        while (true) {


            try {
                System.out.println("gissa Tal");
                gissatTal = myScan.nextInt();
                if (gissatTal == rattTal) {
                    System.out.println("Du gissa rätt!");
                    break;
                }else if (gissatTal > rattTal) {
                    System.out.println("Du gissade för högt! Gissa igen");
                } else {
                    System.out.println("Du gissade för lågt! Gissa igen"); }
            } catch (InputMismatchException e) {
                System.out.println("Inte ett tal");
                myScan.next(); }
        }
    }
}