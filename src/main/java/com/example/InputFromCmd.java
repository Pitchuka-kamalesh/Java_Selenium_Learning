package main.java.com.example;

import java.util.Scanner;

public class InputFromCmd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the integer value");
////        int value = sc.nextInt();
//        System.out.println("The integer value is "+value);
        System.out.println("Enter the string value");
        String inputValue = sc.nextLine();
        if (inputValue.equalsIgnoreCase("j")){
            System.out.println("Java");
        }else {
            if (inputValue.equalsIgnoreCase("p")){
                System.out.println("Python");

            }else System.out.println("Testing");
        }


    }
}
