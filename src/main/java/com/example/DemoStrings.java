package main.java.com.example;

public class DemoStrings {

	public static void main(String[] args) {
		
		// Methods used in the Strings 
		
		String cources = "java";
		
		System.out.println("lengthe of the String:"+ cources.length());
		
		System.out.println("Element at partucler element:"+ cources.charAt(0));
		
		System.out.println("characters are in lower case:"+cources.toLowerCase());
		
		System.out.println("Character are in upper case:"+ cources.toUpperCase());
		
		System.out.println("Check weather the two string are equals:"+cources.equals("java"));
		
		System.out.println("Check weather the two string are equals with out conserding the case :"+cources.equalsIgnoreCase("java"));
		
		
		String str1,str2,str3;
		
		str1 = "Welcome to java class";
		
		System.out.println(" Check whenther the one string is contains in aonther string:" +str1.contains(cources));
		
		str2 = "A";
		str3 = "A";
		
		System.out.println("comparing two string str2 and str3:" + str2.compareTo(str3));
		
		str2 = "A";
		str3 = "B";
		
		System.out.println("comparing two string str2 and str3:" + str2.compareTo(str3));
		
		str3 = "A";
		str2 = "B";
		
		System.out.println("comparing two string str2 and str3:" + str2.compareTo(str3));
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
