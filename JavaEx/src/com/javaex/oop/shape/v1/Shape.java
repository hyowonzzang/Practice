package com.javaex.oop.shape.v1;
//추상클래스
//자신이 객체화될수는없다.
//상속을 위한 부모 클래스로만 존재
//안쪽에 추상 메서드를 가져야한다.
//상속받은 클래스는 선언된 추상 메서드를 반드시 구현해야 한다.
public abstract class Shape {
//필드
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x =x;
		this.y =y;
	}
	
	public abstract void draw();
	public abstract double area();
}
