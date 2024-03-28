package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx {
	// 점수 입력, 60점 이상이면 합격입니다. 출력
	// 팁 * Ctrl + Space (자동 임포트)
	// 		Ctrl + Shift + O (Organize imports- 한번에 임포트)

	public static void main(String[] args) {
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		
		// 점수 입력받기
		System.out.print("점수는?");
		int score = scanner.nextInt();
		
		// 점수 비교
		if (score >= 60) {
			System.out.println("합격입니다!");
		} //조건 만족
		else {
			System.out.println("불합격임~");
		}//조건 불만족
		//스캐너 닫기
		scanner.close();
	}

}
