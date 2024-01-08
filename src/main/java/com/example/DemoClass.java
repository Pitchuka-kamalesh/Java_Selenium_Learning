/**
 * 
 */
package main.java.com.example;

import java.util.ArrayList;
import java.util.Collections;

/**
 * student has6 subject mrks 
 */
public class DemoClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> markList = new ArrayList<Integer>();
		
		
		// check wheather the list is empty 
		
		System.out.println("Checking wheather the ArrayList is empty or not:"+ markList.isEmpty());
		
		markList.add(90);
		markList.add(98);
		markList.add(80);
		markList.add(86);
		
		// printing all the elements in the array 
		
		System.out.println(markList);
		
		
		//Print the the size of the array 
		
		System.out.println(markList.size());
		
		//print the first element in an array 
		
		System.out.println(markList.get(0));
		
		// printing all the elements in the array 
		
		System.out.println(markList);
		
		// Sorting of an array .
		Collections.sort(markList);
		
		System.out.println("sorting of an array usimg the inbuilt method"+markList);
		
		Collections.reverse(markList);
		
		System.out.println("Sorting in the reverse order:"+markList);
		
		
		
		
		// remove the element present in the index(0)
		
		System.out.println(markList.remove(0));
		
		
		System.out.println("Checking whether the ArrayList is empty or not:"+ markList.isEmpty());
		
		
		// 
		
		System.out.println("check whether removed element is present in the Array List or not:"+ markList.indexOf(90));
		

	}

}
