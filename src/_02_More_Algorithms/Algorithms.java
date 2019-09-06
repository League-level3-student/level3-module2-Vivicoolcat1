package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
			
		}
		return 0;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int pearl =0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i).equals(true)) {
				pearl++;
			}
			
		}
		return pearl;
	}
	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>tallest) {
				tallest = peeps.get(i);
			}
			
		}
		return tallest;
		
	}
	public static String findLongestWord(List<String> words) {
String longest = "";
for (int i = 0; i < words.size(); i++) {
	if(words.get(i).length()>longest.length()) {
		longest=words.get(i);
		
	}
	
	
}
return longest;
		
		
}
	
	public static Boolean containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			if(message1.get(i).contains("... --- ...")) {
				return true;
			}
			
		}
		return false;
	}
	
}
