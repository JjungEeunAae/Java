package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("iBATIS");
		set.add("Java");
		set.add("Java");
		
		int size = set.size();
		//동일한 값이 있으면 값 중 하나만 출력한다
		System.out.println("총 객체 수 : " + size); //총 객체 수 : 5
		System.out.println();
		
		//반복자 = 값들에 대해서 반복해서 준다
		//타입은 집어넣은 타입에 맞춰 기재하면 된다
		Iterator<String> iterator = set.iterator();
		
		//현재 가져올 수 있는 값이 있는지 봐준다
		//기다리고 있는 값이 있는가?	있다면 true
		//주소를 가지고 있기 때문에 값을 가져올 수 있는 것
		//iterator를 사용하는 것
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		System.out.println();
		
		//삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		
		//중복 값이 없다면 이렇게 사용해도 됨
		//for문 사용 가능
		for(String skill : set) {
			System.out.println("\t" + skill);
		}
		
		System.out.println();
		
		//clear
		//내부에 있는 값들의 연결이 끊긴다
		//인스턴스가 삭제되는건 아님
		set.clear();
		if(set.isEmpty()) {
			System.out.println("내부가 비어있습니다");
		}
		
		
	}

}
