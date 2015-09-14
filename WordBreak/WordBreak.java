import java.util.*;

public class WordBreak{

	public static int MaxLength(Set<String> dict){
		int maxLength = 0;
		for(String word : dict){
			if(word.length() > maxLength){
				maxLength = word.length();
			}
		}
		return maxLength;
	}
	
	public static boolean WB(String s, Set<String> dict){
		// Main algorithm
		int length = s.length();
		int maxLength = MaxLength(dict);
		boolean[] canBreak = new boolean[length + 1];
		canBreak[0] = true;
		for(int i = 1; i < length+1; i++){
			canBreak[i] = false;
			for(int j = 1; j <= maxLength && j <= i; j++){ // NOTE that there is a "=" here for middle j!
				if(!canBreak[i-j]){ // NOTE that "j" is LENGTH instead of position!
					continue;
				}
				String temp = s.substring(i-j,i);
				if(dict.contains(temp)){
					canBreak[i] = true;
					// break;
				}
			}
		}
		return canBreak[length];
	}
	
	// 算法主要思想：
	// 设定i为外层循环，来找到到i这个位置是可以分为词典中的词吗？
	// 设定j为内层循环，注意j表示从i这个位置开始往前移动j长度，这里分下面两个步骤进行判断：
	//		首先，如果i-j这个位置为false，那么无论后面字符串能够分割字典，直接放弃；
	//		其次，如果i-j这个位置为true，那么如果后面的字符串，从位置i-j到i，可以被分为字典，那么到位置i就可以分为字典。
	// 注意在30行加上break可以大大减少程序的运行时间。

	public static void main(String args[]){
		// Test set
		String test = "aaaaaaaaaaaaaaaaaaaaaab";
		Set<String> dict = new HashSet<String>();
		dict.add("a");
		dict.add("aa");
		dict.add("aaa");
		dict.add("aaaa");
		dict.add("aaaaa");
		// dict.add("ab");
		
		int maxLength = MaxLength(dict);
		boolean result = WB(test, dict);
		System.out.println("MaxLenght of dict is " + maxLength);
		System.out.println("The result is " + result);
		
	}
}