package com.javaex.basic.loop;

public class ContinueEx {
	// 1~20까지 루프
	// 2의 배수와 3의 배수는 출력 안함
	// 나머지는 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=20; i+=1)	{
			if ( i%2 == 0 ||i%3 == 0)	
				continue;
			
			System.out.println(i);
		}
	}

}
