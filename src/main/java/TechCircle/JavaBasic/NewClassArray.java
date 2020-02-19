package TechCircle.JavaBasic;

import java.lang.reflect.Array;
import java.util.Scanner;

public class NewClassArray {

	private static final int PlayerTotal = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String []fruits;
//		fruits = new String[6];
//		
//		fruits[0] = "Apples";
//		fruits[1] = "organges";
//		fruits[2] = "grapes";
//		fruits[3] = "bananas";
//		fruits[4] =  "Hello World";
//	
//		System.out.println(fruits[0]);
//		
		///////////////////////////////
		
//
//
//		
//		String months[] = new String[12];
//		
//		
//		months[0] = "January";
//		months[1] = "February";
//		months[2] = "March";
//		months[3] = "April";
//		months[4] = "May";
//		months[5] = "June";
//		months[6] = "July";
//		months[7] = "August";
//		months[8] = "September";
//		months[9] = "October";
//		months[10] = "November";
//		months[11] = "December";
//		
//		for (int i = 0; i < months.length;) {
//			
//			System.out.println("This is the month " + months[i]);
//			i++;
//		}
//		
//		
//		int[] number = { 10, 3, 11, 6, 1};
//		
//		Array.getShort(numbers);
//		
//		System.out.println(Array.binaryseach(number, 6));
//		
//		
//		
		
//		
//		int a[] = {1, 8, 3};
//		int b[]  = new int[a.length];
//		
//		System.out.println("before pointing" + a);
//		System.out.println("before pointing" + b);
//		
//		b = a;
//		
//		
//		
//		for (int i = 0; i < b.length:) {
//			 System.out.println("number " + b[i]);
//		}
			
		
		
		// MULTIDEMNTINAL  ARRAY 
		
//		int a = 1;
//		int [] b ={1,3,4,5,54};
//		
//		int[][] c = {b,{4,5,6,6,4},{4,5,6,6,4},{4,5,6,6,4}};
//		;
//		int x = c[4][1];
//		System.out.println(x);
//	
		
		
//	int a [] = {-113,-113,-113,-113,-113,-113,-113,-113,-113,-113,}	;
//		
//	System.out.println("this is first value is an array ----"+ a[0]);
//		System.out.println("this is sec value is an array ----"+ a[0]);
//		System.out.println("this is thurth value is an array ----"+ a[0]);
//		System.out.println("this is fourt value is an array ----"+ a[0]);
//		System.out.println("this is fifth value is an array ----"+ a[0]);
//		System.out.println("this is sixth value is an array ----"+ a[0]);
//		System.out.println("this is seven value is an array ----"+ a[0]);
//		System.out.println("this is euhgth value is an array ----"+ a[0]);
//		System.out.println("this is nine value is an array ----"+ a[0]);
//		System.out.println("this is ten value is an array ----"+ a[0]);
//		
//		
//		//----------------------------// Here you know the length of your loop
//		
//		int b[] = {1, 12, 25, 36, 45, 53, 62, 73, 84, 99};
//		
//		for (int i = 0;i<b.length; i++ ) {
//			System.out.println(b[i]);
//		}
//		
//		//  OR here you your going through the entire loop
//		
//		
//		for(Integer var: b) {
//			System.out.println(var);
//		}
//		
//		////////----------------------------------//
////		
////		int question3Int[] = { 1, 12, 25, 36, 45, 53, 62, 73, 84, 99	};
////		int copyOfAboveArray[] = question3Int.clone();
//		
//		////////----------------------///
//		
//		int question4Int[] = { 1, 12, 25, 36, 45, 53, 33, 22, 42, 32 };
//		Scanner Scan = new Scanner(System.in);
//		
//		System.out.println("The Numbers Are --->" + Array.toString(question4Int));
//		
//		System.out.println("Please enter a random integer between 1 and 50 ----");
//		
//		int userInput = Scan.nextInt();
//		
//		for(int i = 0; i < question4Int.length; i++) {
//			
//			System.out.println(question4Int[i]);
//			
//			if(userInput == question4Int[i])  {
//				System.out.println("user input is present at index --> " + i);
//			}
//		}
//		
//		/////// -------------------- ///////
//		
//		int question5Array[] = { 1, 23424, 25, 234234234, 45, 23452345, 62, 73, 84, 99 };
//		System.out.println("The numbers are ---> " + Array.toString(questionArray));
//		
//		Array.sort(question5Array);
//		
//		System.out.println(question5Array[question5Array.length - 1]);
//		
//		//////// -------------- // //
		
		
//		{	
//    int a=1;
//    for (; a<= 10; a++)
//    {
//    	printf ("I am awesome");
//    	
//    	
//    	System.out.println("I am awesome");
//    }
//		} 
		
		
		
		/////////////--------------------//
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a number ---- ");
//		
//		int userInput = scan.nextInt();
//		
//		do {
//			System.out.println(userInput);
//			userInput--;
//			
//		}while(userInput>0);
//		/////
//		
//		for (int i=0; i<=userInput; i++) {
//			System.out.println(i);
//			
//		}
//		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter number 1 -- ");
//		int number1 = scan.nextInt();
//		
//		System.out.println("Enter number 2 -- ");
//		int number2 = scan.nextInt();
//		
//		System.out.println("Enter number 3 -- ");
//		int number3 = scan.nextInt();
//		
//		
//		for(int a = number1;a<number2;a+=number3) {
//		
//		System.out.println(a);
//		
//	

////// BLACKJACK///////
		
//		
//		
//		System.out.println("WELCOME TO BLACKJACK");
//		
//		Scanner scan = new Scanner(System.in);
//		int PlaylerTotal = 0;
//		int DealerTotal = 0;
//		
//		System.out.println("Enter Player hand 1 - ");
//		int playerHand1 = scan.nextInt();
//		System.out.println("Enter player hand 2 - ");
//		int playerHand2 = scan.nextInt();
//		
//		if (playerHand1 > 0 && playerHand1 <= 10 && playerHand2 > 0&& playerHand2 <= 10) {
//		} else {
//			System.out.println("Please enter a valid card number between 1 and 10");
//			
//		}
//		
//		if (PlayerTotal > DealerTotal) {
//			System.out.println("Player Wins");
//		}else if (DealerTotal > PlayerTotal) {
//			System.out.println("Dealer Wins");
//		} else if (DealerTotal == 0 && PlayerTotal == 0) {
//			System.out.println();
//		
//		
		
		
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();

		int n = 0;
		while ( n < 5 )
		{
			System.out.println( (n+1) + ". " + message );
			n++;
		}
	
	}


	private static void printf(String string) {
		// TODO Auto-generated method stub
		
	}

}
