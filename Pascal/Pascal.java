import java.util.*;

public class Pascal{
	public static void main(String args[]){
		ArrayList<ArrayList <Integer>> lli = new ArrayList<ArrayList <Integer>>();
		int numRows = 10;
		
		// Main algorithm
		
		// Use vector to implement this problem
		int length = numRows*2-1;
		int[][] result = new int[numRows][length];
		result[0][numRows-1] = 1;
		result[1][numRows-2] = 1;
		result[1][numRows] = 1;
		
		for(int m = 2; m < numRows; m++){
			for(int n = 0; n < length; n++){
				if(n == 0){
					result[m][n] = result[m-1][n+1];
				}else if(n == length-1){
					result[m][n] = result[m-1][n-1];
				}else{
					result[m][n] = result[m-1][n-1] + result[m-1][n+1];
				}
			}
		}
		
		// Output for vectors
		for(int k = 0; k < numRows; k++){
			for(int l = 0; l < length; l++){
				// System.out.print(result[k][l] + " ");
			}
			// System.out.println("");
		}
		
		// Input into arraylist
		for(int o = 0; o < numRows; o++){
			ArrayList<Integer> temp2 = new ArrayList<Integer>();
			// temp2.clear();
			for(int p = 0; p < length; p++){
				if(result[o][p] != 0){
					temp2.add((Integer)result[o][p]);
				}
			}
			// System.out.println(temp2);
			lli.add(temp2);
			
		}
		
		System.out.println(lli);
		
		// Output
		/* for(int i = 0; i < lli.size(); i++){
			for(int j = 0; j < lli.get(i).size(); j++){
				System.out.print( lli.get(i).get(j) + " ");
			}
			System.out.println("");
		}*/
	}
}