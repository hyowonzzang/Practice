package com.javaex.oop.goods.v1;


//v1. 필드
public class Goods {
	//필드 선언
	//instance 영역
	String name;	//상품명
	int price;		//가격
	
	// Getter Setter
	public String getName()	{
		// 메서드 영역
		//int test =0;
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getPrice()	{
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}


