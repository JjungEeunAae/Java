package com.yedam.ch06;

import com.yedam.ch05.A;

public class C {
	public C() {
		 A a = new A();
		 
		 a.field1 = 1;
		 //a.field2 = 1; //디폴트:값이 있는 클래스의 패키지가 벗어나면 사용할 수 없다.
		 //a.field3 = 1; //프라이빗:값이 있는 클래스 안에서만 사용이 가능하기 때문에 해당 패키지의 클래스에서는 사용이 불가하다.
		 
		 a.mathod1();
		 //a.method2(); //디폴트
		 //a.method3(); //프라이빗
	}
}
