public class MaximumProSubarray{
	public static void main(String args[]){
		// Test case
		int[] Test = {2, -4, -3, -2, 2};
		
		// Main algorithm
		int MaxP = Integer.MIN_VALUE;
		if(Test.length == 0 || Test == null){
			MaxP = 0;
		}else if(Test.length == 1){
			MaxP = Test[0];
		}else{
			int prod = 1;
			int flag = 0;
			int temp = 1;
			int temp2 = Integer.MIN_VALUE;
			for(int i = 0; i < Test.length; i++){
				if(Test[i] < 0){
					if(flag == 0){
						flag = 1;
						MaxP = prod;
						prod *= Test[i];
						temp = prod;
						prod = 1;
					}else{
						flag = 0;
						prod *= Test[i];
						prod *= temp;
						MaxP = prod;
						temp = 1;
					}
				}else if(Test[i] > 0){
					prod *= Test[i];
					MaxP = prod;
				}else{
					prod = 1;
					flag = 0;
					temp = 1;
					MaxP = Math.max(temp2, temp);
				}
				
			}
		}
		
		
		
		// Result
		System.out.println(MaxP);
	}
}