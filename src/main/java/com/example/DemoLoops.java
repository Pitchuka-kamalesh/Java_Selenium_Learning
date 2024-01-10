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
    //    int i = 1;
    //    while (i<=100){
    //        System.out.println(i);
    //        i++;
    //    }
    //    System.out.println("value end of while loop:"+i);

    //    System.out.println("end the while loop");
    //     //example2: do-while loop
    //     int j =1;
    //     do {
    //         System.out.println(j);
    //         j++;
    //     }while (j>=100);
    //     System.out.println("end the while loop");

    //     //note: for loop syntax for(start:)
    //     //note: write a program to print numbers from 1 to 10 using foe loop
    //     for (int k = 0; k <= 10; k++) {
    //         System.out.println(k);

    //     }
    // System.out.println("End of the for loop");
    // //note: write a script to print odd numbers from 1 to 10;
    // for (int k = 1; k <= 10; k = k + 2) {
    //     System.out.println(k);

    // }
    //note:
    // for (int i = 10; i > 0; i--) {
    //     System.out.println(i);

    // }

    //note: to read all elements in the array using for loop
    int[] marks = { 10, 20, 0, 40, 50, 60, 70, 80 };
    // for (int i = 0; i < marks.length; i++) {
    //     System.out.println(marks[i]);

    // }
    //note : write a program to read top 3 elments 
    // for (int i = 0; i < 3; i++) {
    //     System.out.println(marks[i]);

    // }
    //note: for-each loop : for each and every element present in the Array or arraylist 
    // it is used to access every element present in an array or ArrayList for(datatype variablename: ArrayList name){}
    for (int mark : marks) {
        System.out.println(mark);

    }

}
}
