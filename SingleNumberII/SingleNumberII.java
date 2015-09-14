public class SingleNumberII{
	public static void main(String args[]){
		int[] a = {1, 1, 1, 3, 2, 3, 2, 19, 3, 2, 4, 6, 6, 4, 6, 4};
		int result = 0;
		
		// algorithm
		int[] bit = new int[32];
		for(int i = 0; i < 32; i++){
			bit[i] = 0;
			for(int j = 0; j < a.length; j++){
				bit[i] += ((a[j] >> i) & 1);
			}
			if(bit[i]%3 != 0){
				result += (1<<i);
			}
		}
		
		System.out.println("The only one is " + result);
	}
}