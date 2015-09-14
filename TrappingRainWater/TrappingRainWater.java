import java.util.*;

public class TrappingRainWater{
	public static void main(String args[]){
		int[] elevation = {0,1,0,2,0,0,2,0,2,1,2,1};
		int trapWater = 0;
		int left = 0;
		int test = elevation.length;
		while(test != 0){
			test = elevation.length;
			left = 0;
			for(int i = 0; i < elevation.length; i++){
				if(elevation[i] - 1 >= 0 && left == 0){
					elevation[i] -= 1;
					left = i;
				}else if(elevation[i] - 1 >= 0 && left != 0){
					elevation[i] -= 1;
					trapWater += i - left - 1;
					left = i;
				}else{
					test--;
				}
			}
		}
		System.out.println("The total rain water trapped is " + trapWater);
	}
}

