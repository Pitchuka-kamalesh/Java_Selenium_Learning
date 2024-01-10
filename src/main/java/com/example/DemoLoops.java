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
//    do-while loop first excite the statements after executing the statement one time verify the  condition.
//syntax:
// do {
//     System.out.println(j);
//      j++;
//     }while (j<=100);

//note: do loop  first excuite the statement and later verify the condition to continue.


    public static void main(String[] args) {
//        int i = 1;
//        while (i<=100){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("value end of while loop:"+i);
//
//        System.out.println("end the while loop");
        //example2: do-while loop
        int j =1;
        do {
            System.out.println(j);
            j++;
        }while (j>=100);
        System.out.println("end the while loop");


    }
}
