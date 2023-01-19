package com.yedam.java.ch01.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkdList = new LinkedList<>();
		
		long start;
		long end;
		
		//ArrayList
		start = System.nanoTime();
		for(int i = 0 ; i < 10000 ; i++) {
			arrayList.add(0,i);				// i를 String.valueOf(i)로 써도 된다
		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (end - start) + "ns");
		
		
		//LinkedList
		start = System.nanoTime();
		for(int i = 0 ; i < 10000 ; i++) {
			linkdList.add(0,i);
		}
		end = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (end - start) + "ns");
	}

}
