import java.util.*;

public class GrayCode{

	public static ArrayList<Integer> reverse(ArrayList<Integer> head){
		ArrayList<Integer> rev = new ArrayList<Integer>();
		for(int i = head.size()-1; i >= 0; i--){
			rev.add(head.get(i));
		}
		return rev;
	}
	
	public static ArrayList<Integer> grayCode(int n){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(n == 0){
			result.add(0);
			return result;
		}else if(n == 1){
			result.add(0);
			result.add(1);
			return result;
		}else{
			result = grayCode(n-1);
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp = reverse(result);
			int x = 1 << (n-1);
		
			for(int i = 0; i < temp.size(); i++){
				temp.set(i, temp.get(i) + x);
			}
			result.addAll(temp);
			return result;
		}
		
	}

	public static void main(String args[]){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int n = 4;
		result = grayCode(n);
		
		//Output
		for(int i = 0; i < result.size(); i++){
			System.out.print( result.get(i) + " ");
		}
	}
}