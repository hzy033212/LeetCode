public class GasStation{
	public static void main(String args[]){
		// Test set
		int[] gas = {1, 2, 3, 5, 4, 9, 7};
		int[] cost = {2, 4, 5, 1, 3, 6, 7};
		
		if (gas == null || cost == null || gas.length == 0 || cost.length == 0) {
            System.out.println("Not valid input!");
        }

        int sum = 0;
        int total = 0;
        int index = -1;
		
		//总体思想：
		//一共两个变量，sum记录刚到当前站i的富余油量（可以为负），
		//一旦sum是负数，说明到达不了i站，那么从i站继续开始计算，
		//total计算整个环绕一圈的话，gas的总量是否够用，
		//如果不够用，就直接返回-1。
		
        for(int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(sum < 0) {
                index = i;
                sum = 0;
            }
        }
		
		System.out.println(total < 0 ? -1 : index + 1);
	}
}