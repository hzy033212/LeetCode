// This program's space complexity is O(1) !!!!!
import java.util.*;

public class TriangleRem{

	public static int search(int x, int y, ArrayList<ArrayList<Integer>> test){
		int length = test.size();
		if(length == 0){
			return 0;
		}
		if(x == length-1){
			return test.get(length-1).get(y);
		}else{
			return Math.min(search(x+1, y, test), search(x+1, y+1, test)) + test.get(x).get(y);
		}
	}
	
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
		
		//Main Algorithm
		int result = search(0, 0, test);
		
		//Display Result
		System.out.println(result);
		
	}
}