package com.javaex.basic.loop;

public class LoopPractice {

	public static void main(String[] args) {
//		 forGugu();
//		whileGugu();
//		forStar();
		whileStar();

	}

	public static void forGugu() {
		for (int dan = 2; dan <= 9; dan++) {
			// 단수 돌리기 : 2,3,4,...,9
			for (int num = 1; num <= 9; num++) {
				System.out.println(dan + "*" + num + "=" + dan * num);
			}
		}
	}

	public static void whileGugu() {
		int dan = 2, num;

		while (dan <= 9) {
			num = 1;

			while (num <= 9) {
				System.out.println(dan + "*" + num + "=" + dan * num);
				num++;

			}
			dan++;
		}
	}

	public static void forStar() {
		// 행 루프 1~6
		for (int row = 1; row <= 6; row++) {
			// 열 루프 : 1~ 현재row
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println(); // 강제 개행

		}
	}

	public static void whileStar() {
		int row = 1, col;
		while (row <= 6) {
			// 행 루프 : 1~row
			col = 1;
			while (col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;

		}
	}
}