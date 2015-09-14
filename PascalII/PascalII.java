import java.util.*;

public class PascalII{
	public static void main(String args[]){
		int rows = 4;
		ArrayList<Integer> rst = new ArrayList<Integer>();
		if(rows == 0){
			rst.add(1);
			System.out.println(rst);
		}else if(rows == 1){
			rst.add(1);
			rst.add(1);
			System.out.println(rst);
		}else{
			ArrayList<Integer> row1rst = new ArrayList<Integer>();
			row1rst.add(1);
			row1rst.add(1);
			rst = row1rst;
			for(int i = 2; i < rows+1; i++){
				ArrayList<Integer> tmp = new ArrayList<Integer>();
				tmp.add(1);
				for(int j = 1; j < i; j++){
					tmp.add(-1);
				}
				tmp.add(1);
				
				for(int k = 1; k < i; k++){
					tmp.set(k, rst.get(k-1)+rst.get(k));
				}
				
				rst = tmp;
			}
		System.out.println(rst);
		}
	}
}