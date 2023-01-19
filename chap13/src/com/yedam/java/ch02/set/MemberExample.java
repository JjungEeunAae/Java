package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Set;

public class MemberExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();

		set.add(new Member(1000, "홍길동"));
		set.add(new Member(1000, "홍길동"));
		
		//메모리 주소를 기반으로 비교하여 값을 반환해준다
		//new 연산자는 각각의 주소가 있기 때문에 객체 수가 2로 나온다
		//hashCode와 equals가 없을 경우
		System.out.println("총 객체 수 : " + set.size());		//총 객체 수 : 2
		
		
		//hashCode와 equals가 있는 경우
		System.out.println("총 객체 수 : " + set.size());		//총 객체 수 : 1
	}

}
