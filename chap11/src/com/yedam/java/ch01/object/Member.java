package com.yedam.java.ch01.object;
//오브젝트의 자식클래스
public class Member {
	//필드
	public String id;
	
	//생성자
	public Member(String id) {
		this.id = id;
	}
	
	
	
	
	//메서드
	@Override
	public boolean equals(Object obj) {
		//강제타입변환
		if(obj instanceof Member) {
			//내건지 아닌지를 확인하고
			//그 다음에 오브젝트는 사실상 필드가 없다.
			//그러면 실제 인스턴스가 가지고 있는 필드값을 가져올려면
			//타입을 바꿔야 함
			Member member = (Member) obj;
			
			//멤버의 타입은 String
			//equals -> 같은 값인지, 필드 값이 같은지
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	





	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}




	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
}
