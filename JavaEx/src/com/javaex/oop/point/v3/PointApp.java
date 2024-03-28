package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
//		Point dot1 = new Point();
		Point dot1 = new Point(5,5);
//		dot1.setX(5);
//		dot1.setY(5);
//		
//		Point dot2 = new Point();
		Point dot2 = new Point(10,23);
//		dot2.setX(10);
//		dot2.setY(23);
		dot1.draw();
		dot2.draw();
		
		//오버로딩된 메서드 호출
		dot1.draw(true);
		dot2.draw(false);
	}

}

