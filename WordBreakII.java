import java.util.*;

public class WordBreakII{
	public static int MaxLength(Set<String> dict){
		int maxLength = 0;
		for(String word : dict){
			if(word.length() > maxLength){
				maxLength = word.length();
			}
		}
		return maxLength;
	}
	
	public static List<String> WB(String s, Set<String> dict){
		// Main algorithm
		List<String> result = new ArrayList<String>();
		int maxLength = MaxLength(dict);
		int length = s.length();
		boolean[] canBreak = new boolean[length+1];
		canBreak[0] = true;
		String tempString = "";
		for(int i = 1; i < length + 1; i++){
			canBreak[i] = false;
			for(int j = 1; j <= maxLength && j <= i; j++){
				if(!canBreak[i-j]){
					continue;
				}
				String temp = s.substring(i-j, i);
				if(dict.contains(temp)){
					canBreak[i] = true;
					tempString = tempString + " " + temp;
					break;
				}
			}
			result.add(tempString);
		}
		return result;	
	}

	public static void main(String args[]){
		// Test set
		String test = "aaaaaaaaaaaaaaaaaaaaaab";
		Set<String> dict = new HashSet<String>();
		dict.add("a");
		dict.add("aa");
		dict.add("aaa");
		dict.add("aaaa");
		dict.add("aaaaa");
		dict.add("ab");
		
		// List<String> result = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		result = WB(test, dict);
		for(int i = 0; i < result.size(); i++){
			System.out.println("The result is " + result.get(i));
		}
		
	}
}