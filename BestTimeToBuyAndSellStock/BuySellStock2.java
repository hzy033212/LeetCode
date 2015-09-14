public class BuySellStock2{
	public static void main(String args[]){
		int[] prices = {4, 10, 2, 6};
		if (prices == null || prices.length == 0) {
            System.out.println("Not enough price!");
        }

        int min = Integer.MAX_VALUE;  //just remember the smallest price
        int profit = 0;
        for (int i : prices) {
            min = i < min ? i : min;
            profit = (i - min) > profit ? i - min : profit;
        }
		
		// �������ѭ����˼�뷽����
		//	�������飻
		//	����min��ǵ�ǰ����ɨ���������С������
		//	����profit������б��������뵱ǰ��С�����Ĳ
		//	ȡ��ǰ��profit�͵�ǰ��õ�profit�нϴ��һ����
		
        System.out.println("The max profit is " + profit);
		
	}
}