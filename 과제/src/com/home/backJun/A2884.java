package com.yedam.java.backJun;

import java.util.Scanner;

public class A2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		/*�Է°��� 45���� ũ�ų� ������
		 * �Է°��� 45�� ���̳ʽ��ϰ�
		 * �װ� �ƴ϶�� M�� 15�� �÷����Ѵ�
		 * ��, H�� 0�� �� H�� 23���� �����
		 * �װ� �ƴ϶�� H�� 1�� ���ҽ�Ų��
		 */
		if(M >= 45) {		//�˶�, �Ͼ�� �ð����� 45�� ���� �˶��� ������Ѵ� 
			M -= 45;
		} else {
			M += 15;
			if(H == 0) {
				H = 23;
			} else {
				H--;
			}
		}
		System.out.printf("%s %s",H,M);

	}

}
