import java.util.*;

public class Candy{
	public static void main(String args[]){
		int[] ratings = {1, 2, 3, 2 ,2 , 1, 2, 1, 1, 2};
		
        if(ratings == null || ratings.length == 0) {
            System.out.println("Not enough ratings!");
        }

        int[] count = new int[ratings.length];
        Arrays.fill(count, 1);
        int sum = 0;
        for(int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i - 1]) {
                count[i] = count[i - 1] + 1;
            }
        }

        for(int i = ratings.length - 1; i >= 1; i--) {
            sum += count[i];
            if(ratings[i - 1] > ratings[i] && count[i - 1] <= count[i]) {  // second round has two conditions
                count[i-1] = count[i] + 1;
            }
        }
        sum += count[0];
        
		System.out.println("The result is " + sum);

	}
}