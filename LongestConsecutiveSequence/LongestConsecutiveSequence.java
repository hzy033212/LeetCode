import java.util.*;

public class LongestConsecutiveSequence {
    // Sort & search: space O(1), time O(n logn)
    // HashMap: space O(n), time O(n)
    public static int longestConsecutive(int[] num) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for(int i: num){
            hs.put(i, 0);
        }
		System.out.println("hs = " + hs);
        int maxl = 1;
        for(int i: num){
            if (hs.get(i) == 1) continue;
			System.out.println("hs2 = " + hs);
            int tmp = i;
            int current_max = 1;
            while(hs.containsKey(tmp+1)){
                current_max ++;
                tmp ++;
                hs.put(tmp, 1);
            }

            tmp = i;
            while(hs.containsKey(tmp-1)){
                current_max ++;
                tmp --;
                hs.put(tmp, 1);
            }

            maxl = Math.max(current_max, maxl);
        }

        return maxl;
    }
	
	public static void main(String args[]){
		int[] num = {3, 200, 3, 5, 4, 7, 6};
		int result = longestConsecutive(num);
		System.out.println("Longest Consecutive Sequence's result is " + result);
	}
}