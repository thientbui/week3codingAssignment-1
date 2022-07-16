class Main {
  public static void main(String[] args) {
    // Coding Steps: 
      
  // 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28,     93.
  
    int[] ages  = {3, 9, 23, 64, 2, 8, 28, 93}; 
      
  // a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.

  int firstElement = ages [0];
  int lastElement = ages[ages.length - 1];
  System.out.println(lastElement - firstElement); 
      
  // b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
  int[] ages2  = {3, 9, 23, 64, 2, 8, 28, 93, 100};

  int firstElement2 = ages2 [0];
  int lastElement2 = ages2[ages2.length - 1];
  System.out.println(lastElement2 - firstElement2);
    
  // c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		int sumAges = 0; 
		for (int age : ages) { 
			sumAges += age;
		} 
		double averageAge = sumAges / ages.length;  
		System.out.println("Average age is: " + averageAge); // 
		
  // 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
		
		int sumOfLetters = 0;  
		for (String name : names) {
			int numOfLetters = name.length(); 
			sumOfLetters += numOfLetters;
		}
		double averageNumOfLetters = sumOfLetters / names.length; 
		System.out.println("average number of letters per name is: " + averageNumOfLetters); 
		
		String allNames = "";
		for (String name : names) { 
			if (name == names[0]) { 
				allNames += name;
			} else {
				allNames += " " + name;
			}

// 3.	How do you access the last element of any array?
		// array[array.length – 1];

// 4.	How do you access the first element of any array?
		// array[0];

// 5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[names.length]; 
		
		int i = 0; 
		for (String name : names) { 
			
			int nameLength = name.length(); 
			nameLengths[i] = nameLength; 
			i++; 
		}
		
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
		int sumOfLength = 0; 
		for (int length : nameLengths) 
			sumOfLength += length;
      
		System.out.println("the sum of all the elements in the array is: " + sumOfLength); 
      
//	7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	
	// public static String multiplyString(String word, int n) {
		// String result = "";
		// for (int i = 0; i < n; i++) {
			// result += word;
		// }
		// return results
	// }
	
//	8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	
	}
	
//	9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	
	public static void isSumOver100 (int[] array) {
		int sumOfNumbers = 0;
		for (int numbers : array) {
			sumOfNumbers += numbers;
		}
		if (sumOfNumbers > 100) {
			System.out.println((sumOfNumbers > 100));
		}
	}
		
		
//	10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		
	public static double arrayAverage (double[] array) {
		double sumOfDouble = 0;
		for (double doubleNum : array) {
			sumOfDouble += doubleNum;
		}
		return sumOfDouble / array.length;
	}
		
		
//	11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	
	public static void isFirstArrayGreater (double[] array1, double[] array2) {
		double sumOfDouble1 = 0;
		for (double doubleNum1 : array1) {
			sumOfDouble1 += doubleNum1;
		} double average1 = sumOfDouble1 / array1.length;
		
		double sumOfDouble2 = 0;
		for (double doubleNum2 : array1) {
			sumOfDouble2 += doubleNum2;
		} double average2 = sumOfDouble2 / array2.length;
		
		if (average1 > average2) {
			System.out.println(average1 > average2);
		}
	}
	
//	12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	public static void willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.5) {
			System.out.println(true);
		}
	}



// 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.


	public static void isSumOver100 (int[] array) {
		int sumOfNumbers = 0;
		for (int numbers : array) {
			sumOfNumbers += numbers;
		}
		if (sumOfNumbers > 100) {
			System.out.println((sumOfNumbers > 100));
		}
	}

// 10.	Write a method that takes an array of double and returns the average of 
//all the elements in the array.


	public static double arrayAverage (double[] array) {
		double sumOfDouble = 0;
		for (double doubleNum : array) {
			sumOfDouble += doubleNum;
		}
		return sumOfDouble / array.length;
	}

  // 11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

		public static void isFirstArrayGreater (double[] array1, double[] array2) {
		double sumOfDouble1 = 0;
		for (double doubleNum1 : array1) {
			sumOfDouble1 += doubleNum1;
		} double average1 = sumOfDouble1 / array1.length;
		
		double sumOfDouble2 = 0;
		for (double doubleNum2 : array1) {
			sumOfDouble2 += doubleNum2;
		} double average2 = sumOfDouble2 / array2.length;
		
		if (average1 > average2) {
			System.out.println(average1 > average2);
		}
	}

  // 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

public static void willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.5) {
			System.out.println(true);
		}
}


  // 13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.


  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 21, print "access denied"
    if (age < 21) {
      System.out.println("Access denied. You are not old enough!");

    // If age is greater than, or equal to, 21, print "access granted"
    } else {
      System.out.println("Access granted. You are old enough!");
    }
}
}


