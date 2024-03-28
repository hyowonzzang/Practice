package com.javaex.ooop.staticmember;

public class StaticEx {
	public static int refCount; // 클래스 변수
//	--> 생성된 모든 인스턴스의 갯수
	public static String classVar; // 클래스 변수
	public String instanceVar; // 인스턴스 변수

	// 스태틱 블록으로 블래스 변수 초기화
	static {
		refCount = 0; // 스태틱 변수 초기화
		classVar = "Static Member"; // 클래스 변수 접근
//		intstanceVar = "Instance Member";
		// 인스턴스 변수의 접근은 불가
		// static 영역에서는 static 영역인 접근 ㄱㄴ
		System.out.println("클래스 영역 초기화");
	}

	// 생성자
	public StaticEx() {
		// 인스턴스가 생성될 때, 객체 카운트를 증가
		refCount++;
		System.out.println("refCount: " + refCount);
		System.out.println("Instance 생성");
	}
	
	//	소멸자
	protected void finalize()throws {
		refCount --;
		//	객체가 소멸될
		super.finalize();
	}
	
	
	
}
