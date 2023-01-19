package com.yedam.java.ch01.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//List는 인터페이스
		List<String> list = new ArrayList<>(); 
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");		//위치지정이 가능하다/원래 있던 인덱스의 값보다 앞으로 만들어진다
		list.add("iBATIS");
		
		//동일한 값을 추가
		//인덱스가 모두 다르기때문에 동일한 값이 들어가도 괜찮음
		list.add("Java");
		
		int size = list.size();
		//add를 실행시킨만큼 숫자가 출력된다
		System.out.println("총 객체수 : " + size); 
		System.out.println();
		
		
		//값을 꺼내오는 방식
		
		//꺼내올 땐 타입에 맞춰서 변수를 선언하면 됨
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		
		System.out.println();
		
		//기존에 사용하던 배열의 방식 : list[index]
		//List 컬렉션의 ArrayList의 방식 : list.get(index)
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.printf("%d : %s\n" , i , list.get(i));
		}
		System.out.println();
		
		
		//제거
		
		//제거 후 공백이 되는게 아닌 뒤에서 앞으로 당겨진다
		list.remove(2);			// Database
		list.remove(2); 		// Servlet/JSP
		list.remove("Java");	// 맨 앞에 있는 값이 삭제된다
		
		//향상for문 사용 가능
		for(String data : list) {
			System.out.println(data);
		}

	}
}
