public class BuySellStock{
	public static void main(String args[]){
		int[] price = {4, 10, 2, 6};
		int length = price.length;
		int maxProfit = 0;
		int tempMax = 0;
		int dif = 0;
		for(int i = 0; i < length; i++){
			for(int j = 0; j <= i; j++){
				dif = price[i] - price[j];
				if(dif >= 0 && dif > tempMax){
					tempMax = dif;
				}
			}
		}
		maxProfit = tempMax;
		System.out.println("The max profit is " + maxProfit);
	}
}