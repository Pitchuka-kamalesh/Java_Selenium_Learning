package main.java.com.example;

import java.util.Scanner;

public class DemoSwitch {

    // TODO: Switch case
    /*
     * it is also used to check multiple conditions
     * if you want to check multiple conditions instead of implement a complex nested if better to go with with switch case
     *
     * //Syntax:
     *  switch (variable) {
            case value:
                stmts;
                stmts2;
                break;
            case value2:
                stmts;
                stms;
            default:
                stmsts;

        }

     * */
    public static void main(String[] args) {

        System.out.println("Enter Course Code");
        Scanner sc = new Scanner(System.in);
        String courseCode = sc.nextLine();
        switch (courseCode.toLowerCase()){
            case "j":
                System.out.println("java");
                break;
            case "p":
                System.out.println("python");
                break;
            case "t":
                System.out.println("Testing");
                break;
            default:
                System.out.println("Course doesn't exits");
        }



    }

}
