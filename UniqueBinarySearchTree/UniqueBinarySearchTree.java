public class UniqueBinarySearchTree{
	public static void main(String args[]){
		//Test case
		int numNode = 3;
		
		//主体算法思想：
		//除了最后一个点意外：（最后一个点是完全确定的。）
		//前面的点拆成两部分，其中第一部分为0..numNode-1，注意numNode-1的原因是最后一个点不算！
		//然后由乘法原理进行排列组合。
		//最后全部加在一起。
		
		//Main algorithm
		int[] result = new int[numNode+2];
		result[0] = 1;
		result[1] = 1;
		for(int i = 2; i <= numNode; i++){
			for(int j = 0; j < i; j++){
				result[i] += result[j] * result[i-j-1]; 
			}
		}
		
		//Output result
		System.out.println(result[numNode]);
	}
}