import java.util.*;

public class PascalS{
    public static ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if (numRows == 0) {
            return rst;
        }

        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(0, 1); 
        rst.add(first); // Add first line element 1.

        for (int i = 1; i < numRows; i++) { // Add a new element for i'th row.
            ArrayList<Integer> tmp = new ArrayList<Integer>(i + 1); // The next line is longer than previous one by 1.
            for (int j = 0; j < i + 1; j++){
                tmp.add(-1);
            }
            ArrayList<Integer> prev = rst.get(i - 1);
            tmp.set(0, prev.get(0)); // put 1 as leftmost element in current row
            tmp.set(i, prev.get(i - 1)); // put 1 as rightmost element in current row
            for (int j = 1; j < i; j++){
                tmp.set(j, prev.get(j - 1)+prev.get(j));
            }
            rst.add(tmp);
        }
        return rst;
    }
	
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> rst = generate(5);
		System.out.println(rst);
	}
}