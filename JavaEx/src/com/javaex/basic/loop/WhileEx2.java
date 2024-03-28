package com.javaex.basic.loop;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		
		int dan= scanner.nextInt();
		
		int num = 0;
		
		while (num<=8)	{
			num++;
			System.out.println(dan+"x"+ num + "=" + num*dan);
			scanner.close();
		}

	}

}