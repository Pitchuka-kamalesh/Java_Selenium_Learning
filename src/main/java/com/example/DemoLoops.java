package main.java.com.example;

public class DemoLoops {
// java provided following looping statements.
//note:
// while loop and so while loop  - condition based
// * for loop and foreach loop - interaction based
// * to execute the same code repeatedly.


//Syntax:
//    while(condition){
//        stmts;
//    }
    /* * while loop used to run the same repeatedly as long as the given statement is satisfied */

    public static void main(String[] args) {
        int i = 1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
        System.out.println("value end of while loop:"+i);

        System.out.println("end the while loop");

    }
}
