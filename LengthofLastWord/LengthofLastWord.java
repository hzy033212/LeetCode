public class LengthofLastWord{
	public static void main(String args[]){
		//Test set
		String s = "Hello World     ";
		
		//Main algorithm
		int lastLength = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != ' '){
				lastLength++;
			}else{
				int j = i;
				while(s.charAt(j) == ' ' && j < s.length()-1){
					j++;
				}
				if(j != s.length() - 1){
					lastLength = 0;
				}
			}
		}
		
		
		//Output
		System.out.println(lastLength);
	}
}