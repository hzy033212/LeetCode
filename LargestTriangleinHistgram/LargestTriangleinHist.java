import java.util.*;

public class LargestTriangleinHist{
	public static void main(String args[]){
		// Test case
		int[] height = {4, 1, 2, 4};
		
		// Main algorithm
		Stack<Integer> curh = new Stack<Integer>();
		curh.push(height[0]);
		int curMax = 0;
		int curHeight = 0;
		for(int i = 1; i < height.length; i++){
			if(curh.peek() <= height[i]){
				curh.push(height[i]);
			}else{
				int count = 0;
				while(!curh.isEmpty() && curh.peek() >= height[i]){
					curHeight = curh.pop();
					count++;
					curMax = Math.max(curMax, count*curHeight); 
				}
				count++;
				for(int j = 0; j < count; j++){
					curh.push(height[i]);
				}
				curHeight = height[i];
				curMax = Math.max(curMax, count*curHeight);
			}
		}
		
		// Output result
		// System.out.println(curh);
		System.out.println(curMax);
	}
}