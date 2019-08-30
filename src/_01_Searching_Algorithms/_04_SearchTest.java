package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	 @Test  public void testLinearSearch() { //1. use the assertEquals
	 //method to test your linear search method. 
		 String []s= {"50","49","100","2"};
		 String value = "2";
		 String val = "3";
		 assertEquals(3, _00_LinearSearch.linearSearch(s,value));
		 assertEquals(-1,_00_LinearSearch.linearSearch(s,val));
	 }
	
 
	 
	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array = {2,3,4,5};
		int start=2;
		int end=3;
		int value =3;
		int val = 0;
		assertEquals(1,_01_BinarySearch.binarySearch(array,start,end,value));
		assertEquals(-1,_01_BinarySearch.binarySearch(array, start, end,val));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] array = {200,300,400,500,600};
		int value = 400;
		
		assertEquals(2,_02_InterpolationSearch.interpolationSearch(array, value));
		assertEquals(-1,_02_InterpolationSearch.interpolationSearch(array, 1));
		
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	int[]array = {0,1,2,3,4,5};
	int value=2;
	assertEquals(2,_03_ExponentialSearch.exponentialSearch(array, value));
//	assertEquals(,_03_ExponentialSearch.exponentialSearch(array, 1));
	
	
}}
