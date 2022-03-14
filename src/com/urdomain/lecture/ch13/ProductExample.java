package com.urdomain.lecture.ch13;

public class ProductExample {

	public static void main(String[] args) {
		Product<String, Integer> product = new Product<>();
		
		product.setKind("벤츠");
		product.setModel(400);
		
		System.out.println("내가 선불받은 차는: " + product.getKind() + "-" + product.getModel() + "입니다.");
		
		Product<Tv, String> product2 = new Product<>();
		
//		product2.setKind(new Tv());
		
		Tv tv = new Tv();
		product2.setKind(tv);
		product2.setModel("OLDE TV");
		
		Tv rtTv = product2.getKind();
		String rtString = product2.getModel();
		
		
		System.out.println(rtTv + ":" + rtString);
		
		Product<Car,String> product3 = new Product<>();
		product3.setKind(new Car());
		product3.setModel("더뉴쏘나타");
		
		Car rtCar =	product3.getKind();
		String rtString2 = product3.getModel();
		
		System.out.println(rtCar + ":" + rtString2);
		
//		Product<Car,Integer> product3 = new Product<>();

//		Car car = new Car();
//		product3.setKind(car);
//		product3.setModel(400);
//		
//		Car trCar = product3.getKind();
//		Integer trInteger = product3.getModel();
//		
//		System.out.println(trCar + ":" + trInteger);
		
		// prodeuct2 -> setKind -> field 로 대입 
		
	}

}
