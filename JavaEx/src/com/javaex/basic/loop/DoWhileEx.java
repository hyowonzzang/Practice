package com.javaex.basic.loop;

import java.util.Scanner;

public class DoWhileEx {
	// 정해지지않은 수의 정수를 입력, 합산
			// 0이 입력되면 종료
	public static void main(String[] args) {
		
		//합산 변수
		int total = 0, num;
		
		Scanner scanner= new Scanner(System.in);
		//스캐너로부터 정수를 입력받음
		do	{
		System.out.print("정수를 입력하세요[0이면 종료] :");
		num = scanner.nextInt();
		total += num;
		System.out.println("합은 "+total);
		//0이면 합산 종료
		// 0이 아니면 입력 계속받기
		
		

		}	while (num !=0);
		// 스캐너 닫기
			scanner.close();
			
	}
}