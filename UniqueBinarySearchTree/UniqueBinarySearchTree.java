public class UniqueBinarySearchTree{
	public static void main(String args[]){
		//Test case
		int numNode = 3;
		
		//�����㷨˼�룺
		//�������һ�������⣺�����һ��������ȫȷ���ġ���
		//ǰ��ĵ��������֣����е�һ����Ϊ0..numNode-1��ע��numNode-1��ԭ�������һ���㲻�㣡
		//Ȼ���ɳ˷�ԭ�����������ϡ�
		//���ȫ������һ��
		
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