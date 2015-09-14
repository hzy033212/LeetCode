public class BuySellStock2{
	public static void main(String args[]){
		int[] prices = {4, 10, 2, 6};
		if (prices == null || prices.length == 0) {
            System.out.println("Not enough price!");
        }

        int min = Integer.MAX_VALUE;  //just remember the smallest price
        int profit = 0;
        for (int i : prices) {
            min = i < min ? i : min;
            profit = (i - min) > profit ? i - min : profit;
        }
		
		// 避免二层循环的思想方法：
		//	遍历数组；
		//	变量min标记当前所有扫描的数中最小的数；
		//	变量profit标记所有遍历的数与当前最小的数的差；
		//	取当前的profit和当前最好的profit中较大的一个。
		
        System.out.println("The max profit is " + profit);
		
	}
}