import java.util.*;

public class WordBreak{

	public static int MaxLength(Set<String> dict){
		int maxLength = 0;
		for(String word : dict){
			if(word.length() > maxLength){
				maxLength = word.length();
			}
		}
		return maxLength;
	}
	
	public static boolean WB(String s, Set<String> dict){
		// Main algorithm
		int length = s.length();
		int maxLength = MaxLength(dict);
		boolean[] canBreak = new boolean[length + 1];
		canBreak[0] = true;
		for(int i = 1; i < length+1; i++){
			canBreak[i] = false;
			for(int j = 1; j <= maxLength && j <= i; j++){ // NOTE that there is a "=" here for middle j!
				if(!canBreak[i-j]){ // NOTE that "j" is LENGTH instead of position!
					continue;
				}
				String temp = s.substring(i-j,i);
				if(dict.contains(temp)){
					canBreak[i] = true;
					// break;
				}
			}
		}
		return canBreak[length];
	}
	
	// �㷨��Ҫ˼�룺
	// �趨iΪ���ѭ�������ҵ���i���λ���ǿ��Է�Ϊ�ʵ��еĴ���
	// �趨jΪ�ڲ�ѭ����ע��j��ʾ��i���λ�ÿ�ʼ��ǰ�ƶ�j���ȣ����������������������жϣ�
	//		���ȣ����i-j���λ��Ϊfalse����ô���ۺ����ַ����ܹ��ָ��ֵ䣬ֱ�ӷ�����
	//		��Σ����i-j���λ��Ϊtrue����ô���������ַ�������λ��i-j��i�����Ա���Ϊ�ֵ䣬��ô��λ��i�Ϳ��Է�Ϊ�ֵ䡣
	// ע����30�м���break���Դ����ٳ��������ʱ�䡣

	public static void main(String args[]){
		// Test set
		String test = "aaaaaaaaaaaaaaaaaaaaaab";
		Set<String> dict = new HashSet<String>();
		dict.add("a");
		dict.add("aa");
		dict.add("aaa");
		dict.add("aaaa");
		dict.add("aaaaa");
		// dict.add("ab");
		
		int maxLength = MaxLength(dict);
		boolean result = WB(test, dict);
		System.out.println("MaxLenght of dict is " + maxLength);
		System.out.println("The result is " + result);
		
	}
}