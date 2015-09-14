import java.util.*;

public class PascalSS{
	
	public static ArrayList<ArrayList<Integer>> generate(int numRows){
		ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
		if(numRows == 0){
			return rst;
		}
		
		ArrayList<Integer> firstRow = new ArrayList<Integer>();
		firstRow.add(0, 1);
		rst.add(firstRow);
		
		for(int i = 1; i < numRows; i++){
			ArrayList<Integer> temp = new ArrayList<Integer>(i+1);
			for(int j = 0; j < i+1; j++){
				temp.add(-1);
			}
			temp.set(0, 1);
			temp.set(i, 1);
			ArrayList<Integer> prev = new ArrayList<Integer>();
			prev = rst.get(i-1);
			for(int k = 1; k < i; k++){
				temp.set(k, prev.get(k-1) + prev.get(k));
			}
			rst.add(temp);
		}
		return rst;
	}
	
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> rst = generate(5);
		System.out.println(rst);
	}
}