import java.util.*;

public class MaximalRectangle{
	public static void main(String args[]){
		// Test case
		int[][] board = {{1, 0,1,1},{1,1,0,1},{1,0,1,1},{1,1,1,1},{0,0,0,0}};
		
		// Main algorithm
		int rows = board.length;
		int cols = board[0].length;
		int[] dp = new int[cols];
		int curMax = 0;
		for(int i = 0; i < cols; i++){
			for(int j = 0; j < rows; j++){
				if(board[j][i] == 1){
					curMax += 1;
				}else{
					if(curMax > dp[i]){
						dp[i] = curMax;
					}
					curMax = 0;
				}
			}
		}
		for(int k = 0; k < cols; k++){
			System.out.print(dp[k] + " ");
		}
		System.out.println("");
		
		Stack<Integer> height = new Stack<Integer>();
		height.push(dp[0]);
		int count = 0;
		int curHeight = 0;
		for(int i = 1; i < cols; i++){
			if(dp[i] >= height.peek()){
				height.push(dp[i]);
			}else{
				count = 0;
				while(!height.isEmpty() && height.peek() >= dp[i]){
					curHeight = height.pop();
					count++;
					curMax = Math.max(curMax, curHeight*count);
				}
				count++;
				for(int j = 0; j < count; j++){
					height.push(dp[i]);
				}
				curHeight = dp[i];
				curMax = Math.max(curMax, curHeight*count);
			}
		}
		
		// Display result
		System.out.println(height);
		System.out.println(curMax);
	}
}