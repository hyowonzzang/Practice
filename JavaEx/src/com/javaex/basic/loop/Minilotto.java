package com.javaex.basic.loop;

public class Minilotto {

	public static void main(String[] args) {

		for (int a = 1; a <= 6; a++) {
			int num = (int) (Math.random() * 45) + 1;
			System.out.print(num + "  ");

		}
	}

}
