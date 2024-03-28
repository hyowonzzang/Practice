package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Goods camera = new Goods();
		Goods camera = new Goods("nikon", 400_000);
//		camera.setName("nikon");
//		camera.setPrice(400000);

		// 상품 정보 출력
		System.out.printf("%s: %,d원%n", camera.getName(), camera.getPrice());

//		Goods laptop = new Goods();
		Goods laptop = new Goods("LG그램", 900_000);
//		laptop.setName("LG그램");
//		laptop.setPrice(900000);

//		Goods mug = new Goods();
		Goods mug = new Goods("머그컵", 2_000);
//		mug.setName("머그컵");
//		mug.setPrice(2000);
		// 상품 정보 출력
		System.out.printf("%s: %,d원%n", laptop.getName(), laptop.getPrice());
		System.out.printf("%s: %,d원%n", mug.getName(), mug.getPrice());

		camera.showInfo();
		laptop.showInfo();
		mug.showInfo();
	}

}
