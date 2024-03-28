package com.javaex.oop.methods;

//import java.util.Scanner;

public class MethodsPractice {

	public static void main(String[] args) {
		printHelloMethod(); // 문제 1
		printNumbers(); // 문제 2
		getRandomNumber();	//문제 3
		getSum();	//문제 4
		printOddOrEven(2024);	// 문제5
		printStringLengh("Java Programming");	// 문제 6
		getLargeNumber(10,20); 	// 문제 7
		concatenateStrings("Java","Programming");	// 문제 8
		sumAll(1,2,3,4,5,6,7,8,9);	// 문제 9
		System.out.println(concatenateStrings());
	}

	private static void printHelloMethod() {
		System.out.println("Hello Method!");
	}

	private static void printNumbers() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + "\t");
			System.out.println();
		}
	}

	private static int getRandomNumber() {
		int num = (int) (Math.random() * 101);
		return num;
	}

	private static int getSum() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		return sum;

	}

	private static void printOddOrEven(int value) {
		System.out.println(value %2 ==0? "짝수" : "홀수");
	}

		/*Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		if (a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		scanner.close();
	}*/

	private static void printStringLengh(String str) {
		System.out.println(str.length());
		/*Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		System.out.println(a.length());
		scanner.close();*/

	}
	
	private static int getLargeNumber(int num1,int num2)	{
		if(num1>num2)	{
			return num1;
		}else	{
			return num2;
		}
		
	}
	
	private static String concatenateStrings(String str1, String str2)	{
		return str1+str2;
		
	}
	private static int sumAll(int...values)	{
		int total=0;
		for (int val: values)	{
			total+= val;
		}	return total;
		
	}
	private static String concatenateStrings(String...values)	{
		String result = "";
		
		for (String val: values) {
			result +=val;
		}	return result;
	}
}
