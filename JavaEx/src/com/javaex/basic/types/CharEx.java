package com.javaex.basic.types;

public class CharEx {

	public static void main(String[] args) {
		// char : 문자 1개의 유니코드를 저장
		//	내부적으로는 수치화된 숫자코드지만 출력시에는 상용하는 문자 1개 출력
		char ch1 = 'A';	//홀따옴표
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2);
		
		String str = "A한";	// " -> 문자열
		System.out.println(str);

	}

}
