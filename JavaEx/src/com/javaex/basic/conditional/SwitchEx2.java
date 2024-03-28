package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("월 입력:");
			int month = scanner.nextInt();
			String message;
		
			switch (month)	{
			
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10:
				case 12:
//					System.out.println("31");
					message = "31일 입니다.";
					break;
				
				case 4 :
				case 6 :
				case 9 :
				case 11:
//					System.out.println("30");
					message = "30일 입니다.";
					break;
					 
					case 2 :
//					System.out.println("28");
					message = "28일 입니다.";
					break;
			
					default:
						message = "???";
						break;
			
			}
			System.out.println(month +"월은"+ message);
			scanner.close();

		}
}
