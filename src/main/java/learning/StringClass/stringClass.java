package learning.StringClass;

import java.util.Scanner;

public class stringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		String str = "Java";
//				
//		String str2 = new String("Hello");
//		
//		String str3 = str+str2;
//		
//	// ----------------------- //
//		
//		//assign a literal to string variable // 
//		String name = "TechCircle";
//		
//		//calling a method on a literal string // 
//		char firstInitial = "Farheen".charAt(0); //here 0 is the first alphabet (f) and 1 is going to be (a) and so on.
//		
//		//calling a method on a string variable//
//		char anotherInitial = name.charAt(0);
//		
//		System.out.println(firstInitial);
//		System.out.println(anotherInitial);

		//IMMUTABILITY//
		
//		String word ="java";
//		char ch = Character.toUpperCase(word.charAt(0));
//		word = ch + word.substring (1);
//		
//		//EMPTY STRING// an empty string has no character its length is 0
//		
//		String word1 = "";
//		String word2 = new String();
//		
//		// NO ARGUMENT CONSTRUCTORS // 
//		
//		String empty = new String();
//		String empty = ""; // nothing between the quotes
		
		//OTHER CONSTRUCTORS // 
		
//		char [] letters = {'j','a','v','a'};
//		String word1 = new String(letters);
//		
//		System.out.println(word1);
		
		//Number of characters in the name//
		
//		String name = "farheen";
//		System.out.println(name.length());
//		char  somechar = name.charAt(5);
//		
//		System.out.println(somechar);
		
		
//		String word = "java";
//		word = "jaVa";
//		
//		
//	char a = word.charAt(0);
//	char b = word.charAt(1);
//	char c = word.charAt(2);
//	char d = word.charAt(3);
//	
//	System.out.println(a);
//	System.out.println(b);
//	System.out.println(c);
//	System.out.println(d);
	
//	String str1 = "television";
//	 		    // 0123456789
//	String str2 = "immutable";
//// index position  0123456789
//	String str3 = "bob";
//	
//	String result = str1.substring(4);
//	
//	System.out.println(result);
//	
//	System.out.println(str2.substring(4));
//	System.out.println(str2.substring(4,7));
//	
//	
//	
//		
//		
//		String email = "firstNameLastName@gmail.com";
//		int irfan = email.indexOf('@');
//		System.out.println(index);
//		
//		
//		
//		String userName = email.substring(irfan);
//		System.out.println(userName);
//		
//		
//		String domainName = email.substring(index);
//		System.out.println(domainName);
 
		
//		String name = "President George Washington";
//		
//		name.indexOf('P');
//		name.indexOf('e');
//		name.indexOf("George"); 
//		name.indexOf('e',3);
//		
//		System.out.println(name.lastIndexOf('e'));
//		
//		
//		
//		String str = "Hello TechCircle";
//		String str2 = "Hello ";
//		String str3 = "TechCircle";
//		String str4 = str2.concat(str3);
//		
//		System.out.println(str.length());
//		System.out.println(str4.length());
//		
//		
//		boolean strResult = str == str2;
		
		
		
//		System.out.println(strResult);
		
//		int num1 = 4;
//		int num2 = 4;
//		boolean result = num1==num2;
		
		
//		System.out.println(result);
		
		
//		String str = "Hello TechCircle";
//		String str2 = "Hello ";
//		String str3 = "TechCircle";
//		String str4 = str2.concat(str3);
//		String str5 = "hello TechCircle";
//		System.out.println(str.length());
//		System.out.println(str4.length());
////		
//		boolean strResult = str == str4;
//		boolean strResult1 = str.equals(str4);
//		System.out.println(strResult);
//		System.out.println(strResult1);
//		
//		System.out.println(str == str5);
//		System.out.println(str.equals(str5));
//		System.out.println(str.equalsIgnoreCase(str5));

		
		//int resultOfcompare = str.compareTo(str2);
//		int resultOfcompare = str2.compareTo(str3);
//		
		
//		System.out.println(resultOfcompare);
		
		
// --------TRIM METHOD ---------//
		
//		
//		String str7 = "     Hello        ";
//		int strLength = str7.trim().length();
//		System.out.println(strLength);
//		
//		// REPLACEMENT //  
//		
//		
//		String obj1 = "Car";
//		String obj2 = obj1.replace('r', 't');
//		
//		String obj3 = obj2.toUpperCase();
//		String obj3 = obj2.toUpperCase();
//		
//		System.out.println(obj2.toUpperCase());
	
//		
//		int age = 88;
//		String age1 = Integer.toString(age);
//		System.out.println(age1);
//		
//	
		
		
		
		//////// --- NESTED IF EXAMPLE ------ ////////
		
//		
//		int temperature = 10;
//		boolean sunny = true;
//		if (temperature>90)
//			if (sunny)
//				System.out.println("beach");
//			else 
//			System.out.println("movie");
//		else
//			if (sunny)
//					System.out.println("tennis");
//				else 
//					System.out.println("soccer");
//		
//		
		/// ---------////// MULTIPLE IF AND ELSE STATEMENT ////
		
		int score;
		char grade;
		System.out.println("Enter your score: ");
		Scanner scanner1 = new Scanner (System.in);
		score = scanner1.nextInt();
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("Score = "+score);
		System.out.println("Grade = "+grade);
		scanner1.close();
		
		
		
		
		
		
		
//		
//		if (temperature > 90) // int temperature
//			if (sunny) // boolean sunny
//				
//				System.out.println("beach");
//			else 
//				System.out.println("Movie");
//		else
//			if (sunny)
//				System.out.println("Tennis");
//			else
//				System.out.println("soccer");
		
		
		
		
		
		
		
		
//		
	}
	
	
	
	
	
	

}
