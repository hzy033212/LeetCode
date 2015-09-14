public class MaxProfitII{
	public static void main(String args[]){
		// Test sample
		int[] profit = {1, 2, 4, 3, 7, 4, 9, 2};
		int length = profit.length;
		int maxProfit = 0;
		int dif = 0;
		if(length < 2){
			System.out.println("The max profit is " + maxProfit);
		}
		for(int i = 0; i < length-1; i++){
			if(profit[i] < profit[i+1]){
				dif = profit[i+1] - profit[i];
				maxProfit += dif;
			}
		}
		
		System.out.println("The max profit is " + maxProfit);
		
	}
}