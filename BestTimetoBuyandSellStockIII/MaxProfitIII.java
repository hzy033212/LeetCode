public class MaxProfitIII{
	public static void main(String args[]){
	
	// Test Case
	// int[] profit = {1 , 2, 4,3 ,6, 5, 9, 12, 4};
	int[] profit = {1, 2, 2, 2, 2, 100};
	
	int length = profit.length;
	int maxProfit = -1;
	
	// Find the largest profit through only one transaction.
	int curMin = profit[0];
	int tempMaxProfit = -1;
	for(int j = length-1; j > 0; j--){
		for(int k = 0; k < j; k++){
			if(profit[k] < curMin){
				curMin = profit[k];
			}
		}
		tempMaxProfit = profit[j] - curMin;
		if(tempMaxProfit > maxProfit ){
			maxProfit = tempMaxProfit;
		}
	}
	System.out.println("Max profit for only one transaction is " + maxProfit);
	
	// Find from 0 to i'th(Max = n-1!) largest profit through only one transaction.
	int[] forward = new int[length];
	forward[0] = 0;
	curMin = profit[0];
	for(int i = 1; i < length; i++){
		curMin = Math.min(profit[i], curMin);
		forward[i] = Math.max(forward[i-1], profit[i]-curMin);
	}
	// System.out.println(forward[6]);
	
	// Find from i'th to 1 largest frofit through only one transaction.
	int[] backward = new int[length];
	backward[length-1] = 0;
	int curMax = profit[length-1];
	for(int i = length-2; i >= 0; i--){
		curMax = Math.max(profit[i], curMax);
		backward[i] = Math.max(backward[i+1], curMax-profit[i]);
	}
	// System.out.println(backward[4]);
	
	// Add forward and backward together to find out the maximum profit.
	for(int i = 0; i < length; i++){
		maxProfit = Math.max(maxProfit, forward[i] + backward[i]);
	}
	System.out.println("The maximum profit for two transactions is " + maxProfit);
	
	}
}