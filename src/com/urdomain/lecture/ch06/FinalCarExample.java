package com.urdomain.lecture.ch06;

public class FinalCarExample {



	public static void main(String[] args) {
		
		FinalCar fianlCar = new FinalCar();
		
		//잘못된 속도 변경
		fianlCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + fianlCar.getSpeed());
		
		//올바른 속도 변경
		fianlCar.setSpeed(60);
		
		//멈춤
		if(!fianlCar.isStop()) {
			fianlCar.setStop(true);
		}
		
		System.out.println("현제 속도: " + fianlCar.getSpeed());
		
		
		
	}

}
