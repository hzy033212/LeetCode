public class PlusOne{
	public static void main(String args[]){
		// Test case
		int[] digits = {7, 9, 9, 6, 9, 9};
		
		// Main algorithm
		int[] result = digits;
		int overflow = 1;
		for(int j = result.length-1; j >= 0; j--){
			result[j] = result[j] + overflow;
			if(result[j] > 9){
				overflow = 1;
			}else{
				overflow = 0;
			}
			result[j] = result[j] % 10;
		}
		int[] newResult = new int[result.length+1];
		if(overflow == 1){
			newResult[0] = 1;
			for(int k = 1; k < result.length+1; k++){
				newResult[k] = result[k-1];
			}
		}
		
		// Output
		if(overflow == 1){
			for(int i = 0; i < newResult.length; i++){
				System.out.print(newResult[i]);
			}
			System.out.println("");
		}else{
			for(int i = 0; i < result.length; i++){
				System.out.print(result[i]);
			}
			System.out.println("");
		}
	}
}