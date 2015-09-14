import java.util.*;

public class Candy2{
	public static void main(String args[]){
		int[] ratings = {1, 3, 3, 1};
		
        if(ratings == null || ratings.length == 0) {
            System.out.println("Not enough ratings!");
        }

        int[] count = new int[ratings.length];
        Arrays.fill(count, 1);
        int sum = 0;

		for(int i = 1; i < ratings.length; i++){
			if(ratings[i-1] < ratings[i]){
				count[i] = count[i-1] + 1;
			}
		}
		for(int i = ratings.length-1; i > 0; i--){
			if(ratings[i-1] > ratings[i] && count[i-1] <= count[i]){
				count[i-1] = count[i] + 1;
			}
		}
		for(int i = 0; i < ratings.length; i++){
			sum += count[i];
        }
		
		System.out.println("The result is " + sum);

	}
}