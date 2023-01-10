package com.yedam.variable;

public class Variable02 {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) { //v2는 if 블록에 있는 변수라서 바깥에서 사용이 불가함
			int v2;
			v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5;
	}
}
