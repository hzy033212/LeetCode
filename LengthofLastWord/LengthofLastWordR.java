public class LengthofLastWordR{
	public static void main(String args[]){
		//Test set
		String s = "Hello Wld abcdefg       ";
		
		//Main algorithm
		int lastLength = 0;
		int flag = 0;
		for(int i = s.length()-1; i >= 0; i--){
			if(s.charAt(i) == ' ' && flag == 0){
				continue;
			}else{
				flag = 1;
				lastLength++;
				if(s.charAt(i) == ' '){
					lastLength--;
					break;
				}
			}
		}
		
		
		//Output
		System.out.println(lastLength);
	}
}