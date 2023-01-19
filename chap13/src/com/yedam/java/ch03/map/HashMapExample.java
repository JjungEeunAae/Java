package com.yedam.java.ch03.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		//key value 넣어주는 put
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);		// ------->Key값이 중복이여서 충돌하여 Map에 존재하지 않음
		
		//size
		System.out.println("총 Entry의 수 : " + map.size());		//총 Entry의 수 : 3
		
		//중복된 Key 확인하기
		//새로운 값으로 덮어썼음
		System.out.println("\t홍길동 :  " + map.get("홍길동"));
		System.out.println();
		
		//Key를 통해 가져오는 방법
		Set<String> KeySet = map.keySet();
		for(String name : KeySet) {
			int score = map.get(name);		//Key
			System.out.println("\t" + name + " : " + score);
		}
		System.out.println();
		
		//삭제
		map.remove("홍길동");
		System.out.println("총 Entry의 수 : " + map.size());
		System.out.println();
		
		
		
		//반복자를 쓴거임
		//entry(한 쌍)을 가져오는 방법
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			
			System.out.println("\t" + key + " : " + value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
