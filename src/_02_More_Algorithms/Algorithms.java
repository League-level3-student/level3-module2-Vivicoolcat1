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
	
	public static List<Double> sortScores (List <Double> results){
		for (int j = 0; j < results.size()-1; j++) {
			
		
		for (int i = j+1; i < results.size(); i++) {
			if(results.get(j)>results.get(i)) {
			Double z=results.get(j);
			results.set(j, results.get(i));
			results.set(i, z);
						
			}
		}}
		return results;
	}
	
	public static List<String> sortDNA (List <String> DNA){
		for (int j = 0; j < DNA.size()-1; j++) {
			for (int i = j+1; i < DNA.size(); i++) {
				if (DNA.get(j).length()>DNA.get(i).length()) {
					String s = DNA.get(j);
					DNA.set(j, DNA.get(i));
					DNA.set(i, s);
				}
			}
		}
		return DNA;
	}
	public static List<String> sortWords ( List<String> s){
		for (int j = 0; j <s.size()-1; j++) {
			for (int i = j+1; i < s.size(); i++) {
				int a = s.get(j).compareTo(s.get(i));
				if(a>=1){
					
					String b = s.get(j);
					s.set(j, s.get(i));
					s.set(i, b);
				}
					}
	}
		return s;
}}
