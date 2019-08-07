package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
public static boolean intArraySorted (int [] ints ) {
	
	boolean answer=true;
	for (int i = 0; i < ints.length -1; i++) {
		if(ints[i]>ints[i+1]) {
			
			answer = false;
		}
		
	}
return answer;
	
}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
public static boolean doubleArraySorted(double [] doubles) {
	boolean answer = true;
	for (int i = 0; i < doubles.length -1; i++) {
		if(doubles[i]>doubles[i+1]) {
			
			answer = false;
		}
		
	}
return answer;
}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
public static boolean charArraySorted(char [] c) {
	boolean answer = true;
	for (int i = 0; i < c.length -1; i++) {
		if(c[i]>c[i+1]) {
			
			answer = false;
		}
		
	}
return answer;
}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
public static boolean stringArraySorted(String [] s) {
	boolean answer = true;
	for (int i = 0; i < s.length -1; i++) {
		if(s[i].compareTo(s[i+1])>0) {
			
			answer = false;
		}
		
	}
return answer;
}
}
