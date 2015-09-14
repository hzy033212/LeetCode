import java.util.*;

public class EvalRevePoliNota{
	public static void main(String args[]){
		//Test set
		String[] tokens = {"0","3","/"};
		
		//Main algorithm
		int result = 0;
		int i = 0;
		int left = 0;
		int right = 0;
		String Result = " ";
		Stack<String> eval = new Stack<String>();
		while(i < tokens.length){
			eval.push(tokens[i]);
			if(eval.peek() == "+"){
				eval.pop();
				right = Integer.parseInt(eval.pop());
				left = Integer.parseInt(eval.pop());
				result = left + right;
				Result = Integer.toString(result);
				eval.push(Result);
			}else if(eval.peek() == "-"){
				eval.pop();
				right = Integer.parseInt(eval.pop());
				left = Integer.parseInt(eval.pop());
				result = left - right;
				Result = Integer.toString(result);
				eval.push(Result);
			}else if(eval.peek() == "*"){
				eval.pop();
				right = Integer.parseInt(eval.pop());
				left = Integer.parseInt(eval.pop());
				result = left * right;
				Result = Integer.toString(result);
				eval.push(Result);
			}else if(eval.peek() == "/"){
				eval.pop();
				right = Integer.parseInt(eval.pop());
				left = Integer.parseInt(eval.pop());
				result = left / right;
				Result = Integer.toString(result);
				eval.push(Result);
			}
			i++;
		}
		Result = eval.pop();
		result = Integer.parseInt(Result);
		
		
		
		//Output result
		System.out.println(result);
	}
}