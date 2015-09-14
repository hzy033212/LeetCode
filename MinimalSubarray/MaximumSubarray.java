public class MaximumSubarray{
	public static void main(String args[]){
		//Test case
		int[] Test = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
		
		//Main algorithm
		int Max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < Test.length; i++){
			sum += Test[i];
			Max = Math.max(sum, Max);
			sum = Math.max(sum, 0);
		}
		
		//Result
		System.out.println(Max);
	}
}