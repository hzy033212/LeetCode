import java.math.*;

public class Sqrt{
	public static void main(String args[]){
		int test = 100001;
		double min = 0;
		double max = (double) (test/2.0);
		double avg = 0;
		double dif = (double) test;
		
		while(dif > 1 || dif < -1){
			avg = (min+max)/2.0;
			dif = test - avg*avg;
			if(dif > 0){
				min = avg;
			}else if(dif < 0){
				max = avg;
			}
		}
		System.out.println("The result is " + (int) avg );
	}
}