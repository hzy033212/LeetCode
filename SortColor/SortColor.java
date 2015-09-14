public class SortColor{

	public static void swap(int i, int j, int[] A){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	public static void main(String args[]){
		//Test case
		int[] A = {0, 1, 2, 0, 2, 1, 0, 2, 0, 1, 1};
		
		//Main algorithm
		int leftIndex = 0;
		int rightIndex = A.length-1;
		for(int j = 0; j <= rightIndex; j++){
			if(A[j] == 0){
				swap(j, leftIndex, A);
				leftIndex++;
			}
			if(A[j] == 2){
				swap(j, rightIndex, A);
				rightIndex--;
				j--; //ע������j--����˼�Ǹղź�rightIndex����Ԫ����ʵ��û�н��й���Ч�ıȽϣ�����j���ܹ�ǰ����
			}
		}
		
		//Output
		for(int i = 0; i < A.length; i++){
			System.out.print(A[i] + ",");
		}
		System.out.println("");
	}
}