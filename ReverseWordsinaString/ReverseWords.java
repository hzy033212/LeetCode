public class ReverseWords{
	public static void main(String args[]){
		//Test case
		String str = "abc sky is blue";
		System.out.println(str);
		
		//Main algorithm
		String result = "";
		str = " " + str; // NOTE str.split(" ") only takes words AFTER " " !!!
		if(str == null || str.length() == 0){
			System.out.println("");
		}
		String[] words = str.split(" ");
		
		for(int i = words.length - 1; i > 0; i--){
			result = result + words[i];
			if(i != 1){
				result = result + " ";
			}
		}
		
		//Output
		System.out.println(result);
	}
}