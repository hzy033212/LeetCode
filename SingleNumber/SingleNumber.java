import java.util.*;

public class SingleNumber{
	public static void main(String args[]){
		int[] a = {1, 1, 2, 2, 3, 4, 3, 5, 6, 5, 6};
		
		// Find Single Number without using extra memory.
		int result = 0;
		if(a.length == 0){
			result = -1;
		}else{
			for(int i = 0; i < a.length; i++){
				result ^= a[i];
			}
		}
		
		// Find Single Number with extra memory.
		
		
		System.out.println("Single number is " + result);
	}
}