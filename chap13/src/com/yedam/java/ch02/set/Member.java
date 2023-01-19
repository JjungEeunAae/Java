package com.yedam.java.ch02.set;

public class Member {
	public int id;
	public String name;
	
	public Member(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	//필드값을 통해 번호를 만들어준다???.. 
	
	//오버라이딩 한 이유 : 
	//서로 실제로는 다른 인스턴스지만 내 기준에 맞춰 논리적으로는 같다라고 본다
	
	//hashCode : 같은지 아닌지 논리적으로 보자라는 의미
	@Override
	public int hashCode() {
		return id + name.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			//두개 비교해야 함
			Member member = (Member)obj;
			return (id == member.id) && (name.equals(member.name));
			
			/*
			 * if(id ==member.id)
			 * 		if(name.dquals(member.name)){
			 * 			return true;
			 * 		}
			 * }
			 */
		}
		return false;
	}
	
	
	
	
	
}
