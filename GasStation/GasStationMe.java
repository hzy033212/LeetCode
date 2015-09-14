// WHY solutions guarantee to be unique???

public class GasStationMe{
	public static void main(String args[]){
		// Test set
		int[] gas = {1, 2, 3, 5, 4, 9, 7};
		int[] cost = {2, 4, 5, 1, 3, 6, 7};
		
		int index = -1;
		if(gas == null || cost == null || gas.length == 0 || cost.length == 0){
			System.out.println(index);
		}
		
		int total = 0;
		for(int i = 0; i < gas.length; i++){
			total += gas[i] - cost[i];
		}
		if(total < 0){
			System.out.println(index);
		}else{
			int sum = 0;
			for(int j = 0; j < gas.length; j++){
				sum += gas[j] - cost[j];
				if(sum < 0){
					index = j;
					sum = 0;
				}
			}
		}
		System.out.println(index+1); //Note here that it is impossible for j to get to gas.length-1, under such condition, index will firstly be -1.
		
	}
}