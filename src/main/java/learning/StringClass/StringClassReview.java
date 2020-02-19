package learning.StringClass;

public class StringClassReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String city;
//		city = "Manassas";
//		int citylength = city.length();
//		
////		System.out.println(city.length());
////			System.out.println(city.length());
//		
//		String firstName = "Farheen";
//		
//		int numberOfchar = firstName.length();
//		
////		System.out.println("Number of characters in my name is " + numberOfchar);
//		
//		
//		String lastName = new String("Siddiki");
//		
//		String lastNameUpperCase = "SIDDIKI";
//		
//		
//	// 	System.out.println(lastName.toUpperCase());
////		System.out.println(lastName.toLowerCase());
//		
//		
//		boolean result = lastNameUpperCase == lastName.toUpperCase();
//	//	System.out.println(result);
//		
//		
//		// String email = "dsajwda;sdhdnd;kjehrwue@gmail.com";
//		
//		
//	//	System.out.println(email.contains(";"));
		
		
//		String email = "farheen.siddiki@gmail.com";
		
//		int index = email.indexOf("@");
//		
//		System.out.println(index);
//		
//		String fullName = email.substring(0,index);
//		
//		System.out.println(fullName);
		
		
		
		// HOW TO SPEERATE FIRST AND LAST NAME FROM THE EMAIL ADDRESS //
		
		
		String email = "farheen.siddiki@gmail.com";
		
		int index  = email.indexOf("@");
		
		System.out.println(index);
		
		String fullName = email.substring(0, index);
//		System.out.println(fullName);
		
		int indexOfPoint = fullName.indexOf(".");
		
		String firstName1 = fullName.substring(0, indexOfPoint);
		
		System.out.println(firstName1);
		
		String lastName1 = fullName.substring(indexOfPoint+1);
		
		System.out.println(lastName1);
		
		
		//  HOW TO FIND THE DOMAIN NAME FROM THE EMAIL ADDRESS //
		
		
		String domainName = email.substring(index+1);
		System.out.println(domainName);
		
		
		
	}

}
