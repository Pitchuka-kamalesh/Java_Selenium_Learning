package main.java.com.example;

public class InterviewQuestiosOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String reversal 
		
		/*
		 * String inputString,reverseString = ""; inputString = "Data is not given";
		 * 
		 * int inputStringLength = inputString.length();
		 * 
		 * for(int i=inputStringLength-1;i>=0;i--) {
		 * 
		 * reverseString = reverseString+inputString.charAt(i);
		 * 
		 * }
		 * 
		 * char[] inputstr = inputString.toCharArray();
		 * 
		 * int lenchararray = inputstr.length;
		 * 
		 * System.out.println(lenchararray);
		 * 
		 * for(int i=lenchararray-1;i>=0;i--) {
		 * 
		 * System.out.print(inputstr[i]);
		 * 
		 * 
		 * }
		 * 
		 * 
		 * System.out.println(); System.out.println("First method:"+reverseString);
		 */
		
		
		// fibanocie serices
		
		/*
		 * int first,second;
		 * 
		 * first = 0;
		 * 
		 * System.out.println(first); second = 1; System.out.println(second);
		 * 
		 * for(int i = 0;i<=10;i++) {
		 * 
		 * int sum = first+second; System.out.println(sum);
		 * 
		 * first = second; second = sum; }
		 */
		
		// 
		int sum =1;
		
		for(int i = 1;i<=10;i++) {
			for(int j = 1;j<=i;j++) {
				
				System.out.print(" "+sum+ " ");
				sum++;
				
			}
			System.out.println("");
			
		}

	}

}
