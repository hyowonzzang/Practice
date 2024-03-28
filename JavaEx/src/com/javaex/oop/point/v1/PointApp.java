package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		Point dot1 = new Point();
		dot1.setX(5);
		dot1.setY(5);
		
		Point dot2 = new Point();
		dot2.setX(10);
		dot2.setY(23);
		dot1.draw();
		dot2.draw();
	}

}
