import java.util.*;

public class TriangleForce{
	
	public static void main(String args[]){
		//Test case
		ArrayList<ArrayList<Integer>> test = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> lli1 = new ArrayList<Integer>();
		lli1.add(2);
		test.add(lli1);
		lli1 = new ArrayList<Integer>();
		lli1.add(2);
		lli1.add(1);
		test.add(lli1);
		lli1 = new ArrayList<Integer>();
		lli1.add(1);
		lli1.add(4);
		lli1.add(5);
		test.add(lli1);
		lli1 = new ArrayList<Integer>();
		lli1.add(4);
		lli1.add(1);
		lli1.add(3);
		lli1.add(2);
		test.add(lli1);
		// System.out.println(test);
		
		//Main Algorithm
		int length = test.size();
		int[][] result = new int[length][length];
		if(test == null){
			System.out.println("Null test!");
		}
		if(length == 1){
			System.out.println(test.get(0).get(0));
		}
		for(int i = 0; i < length; i++){
			result[length-1][i] = test.get(length-1).get(i);
		}
		for(int j = length-2; j >= 0; j--){
			for(int k = 0; k <= j; k++){
				result[j][k] = Math.min(result[j+1][k], result[j+1][k+1]) + test.get(j).get(k);
			}
		}
		
		
		//Display result
		for(int i = 0; i < length; i++){
			for(int j = 0; j < length; j++){
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
}