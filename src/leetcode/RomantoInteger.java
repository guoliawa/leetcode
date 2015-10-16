package leetcode;

public class RomantoInteger {
	
	public static int romanToInt(String s) {
		// http://simpleandstupid.com/2014/10/15/roman-to-integer-leetcode-%E8%A7%A3%E9%A2%98%E7%AC%94%E8%AE%B0/
		int[] a = { 1000, 500, 100, 50, 10, 5, 1 };
		char[] r = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };

		int result = 0;
		int last = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < r.length; j++) {
				if (r[j] == s.charAt(i)) {
					result = result + a[j];
					if (last > j) {
						result = result - 2 * a[last];
					}
					last = j;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		/*
		 * �����ַ�
		 * ��Ӧ�İ��������ֱ�ʾΪ
		 * I V X  L  C   D   M
		 * 1 5 10 50 100 500 1000 
		 * 1����ͬ��������д������ʾ����������Щ������ӵõ��������磺�� = 3��
		 * 2��С�������ڴ�����ֵ��ұߣ�����ʾ����������Щ������ӵõ������� �磺�� = 8���� = 12�� 
		 * 3��С�����֣������ڢ�X ��C���ڴ�����ֵ���ߣ�����ʾ�������ڴ�����С���õ��������磺��= 4����= 9��
		 * 4������ʹ��ʱ����д�������ظ����ó������Ρ��������ϵ��ĵ��ӡ�IIII�����⣩
		 * 5����һ���������滭һ�����ߣ���ʾ���������1000����
		 * 
		 * ��������
		 * 1���������֢�X ��C �е��κ�һ�����������ù�����Ŀ�����߷��ڴ������ұ����ù�����Ŀ�������ܳ������������ڴ��������ֻ����һ����
		 * 2�����ܰѻ�������V ��L ��D �е��κ�һ����ΪС�����ڴ�������߲�������ķ���������Ŀ�����ڴ������ұ߲�����ӵķ�ʽ������Ŀ��ֻ��ʹ��һ����
		 * 3��V ��X ��ߵ�С����ֻ���â�
		 * 4��L ��C ��ߵ�С����ֻ����X��
		 * 5��D ��M ��ߵ�С����ֻ����C��
		 * ��λ������
		 * ��,1 ����2�� ��3�� ����4 ������5 ������6������7�� ����8 ������9 ��
		 * ʮλ������
		 * ����10�� ����11 ������12�� XIII,13�� XIV,14�� XV,15 ��XVI,16 ��XVII,17 ��XVIII,18�� XIX,19�� XX,20�� XXI,21 ��
		 * XXII,22 ��XXIX,29�� XXX,30�� XXXIV,34�� XXXV,35 ��XXXIX,39�� XL,40�� L,50 ��LI,51�� LV,55�� LX,60�� 
		 * LXV,65�� LXXX,80�� XC,90 ��XCIII,93�� XCV,95 ��XCVIII,98�� XCIX,99 ��
		 * ��λ������
		 * C,100�� CC,200 ��CCC,300 ��CD,400�� D,500 ��DC,600 ��DCC,700�� DCCC,800 ��CM,900�� CMXCIX,999��
		 * ǧλ������
		 * M,1000�� MC,1100 ��MCD,1400 ��MD,1500 ��MDC,1600 ��MDCLXVI,1666�� MDCCCLXXXVIII,1888 ��
		 * MDCCCXCIX,1899 ��MCM,1900 ��MCMLXXVI,1976�� MCMLXXXIV,1984�� MCMXC,1990 ��MM,2000 ��
		 * MMMCMXCIX,3999��
		 * 
		 */
		Util.print("The result is: " + romanToInt("IX"));
		Util.print("The result is: " + romanToInt("MDCLXVI"));
	}

}
