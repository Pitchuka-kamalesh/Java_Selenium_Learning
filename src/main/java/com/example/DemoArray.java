package main.java.com.example;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Note : Working with the Array 

		/*
		 *  Scalar variable can hold only one value at given any point of time ;
		 *  
		 *  Array are used to store values.
		 *  
		 *  Arrays are fix in size.
		 *  
		 * - Arrays are used to store multiple values.
		 *  - Arrays are fixed size.
		 *  - Array will accept both primitive and non-primitive.
		 *  - Syntax for declaring the array.
		 *  
		 *  -- datatype[number of values] varname;
		 *   - String[5] car;
		 *   - int[6] marks;
		 */
		
		String[] car= {"Audi","BMW","Volvo","Tesla","Polo"};
		int[] marks = {60,65,70,90,80,95};
		
		// counting number of elements present in an array variablename.length
		System.out.println(car.length);
		System.out.println(marks.length);

		// note: how to acess data in an array
		// syntax:array[index]
		System.out.println(car[0]);
		System.out.println(marks[4]);


		// replacing exceting elemnt in an array

		car[0] = "Wox";
		
		
		//object is a java class can be used as refrence data datatype.
		
		// any kind of data we can stored in the object 
		
		Object x;
		x = "abc";
		x = 10;
		x = true;
		// it will occipes more memory space and we can't performance airthmatc comparaction and logical operaction on object data type.
		System.out.println(x);
		
		
		


		
		
		
		
		
		

	}

}
