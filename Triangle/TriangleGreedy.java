import java.util.*;

public class TriangleGreedy{
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
		System.out.println(test);
		
		//Main Algorithm
		if(test == null){
			System.out.println("Null test!");
		}
		int length = test.size();
		int result = 0;
		int left = 0;
		int right = 1;
		if(length == 1){
			result += test.get(0).get(0);
		}else{
			result += test.get(0).get(0);
			for(int i = 1; i < length; i++){
				if(test.get(i).get(left) <= test.get(i).get(right)){
					result += test.get(i).get(left);
				}else{
					result += test.get(i).get(right);
					left += 1;
					right += 1;
				}
			}
		}
		
		
		//Display result
		System.out.println(result);
		
	}
}