public class GasStation{
	public static void main(String args[]){
		// Test set
		int[] gas = {1, 2, 3, 5, 4, 9, 7};
		int[] cost = {2, 4, 5, 1, 3, 6, 7};
		
		if (gas == null || cost == null || gas.length == 0 || cost.length == 0) {
            System.out.println("Not valid input!");
        }

        int sum = 0;
        int total = 0;
        int index = -1;
		
		//����˼�룺
		//һ������������sum��¼�յ���ǰվi�ĸ�������������Ϊ������
		//һ��sum�Ǹ�����˵�����ﲻ��iվ����ô��iվ������ʼ���㣬
		//total������������һȦ�Ļ���gas�������Ƿ��ã�
		//��������ã���ֱ�ӷ���-1��
		
        for(int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(sum < 0) {
                index = i;
                sum = 0;
            }
        }
		
		System.out.println(total < 0 ? -1 : index + 1);
	}
}