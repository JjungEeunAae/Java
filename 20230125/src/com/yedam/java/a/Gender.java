package com.yedam.java.a;

public class Gender {

	public static void main(String[] args) {
		String[] arr = {"010102-4","991012-1","960304-1","881012-2","040403-3"};
		String result;
		int result2;
		int g = 0;
		int m = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			result = arr[i];
			result2 = result.charAt(7)-'0';
			if(result2 == 2 || result2 == 4) {
				g++;
			} else if(result2 == 1 || result2 == 3) {
				m++;
			}
		}
		
		System.out.println("남 " + m + " 여 " + g);
	}

}
