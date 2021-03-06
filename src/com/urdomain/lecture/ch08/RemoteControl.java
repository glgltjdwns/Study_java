package com.urdomain.lecture.ch08;

public interface RemoteControl {
	
	public String nmae = "Tony";
	
	//상수
	int MAX_VOLUME = 10;	// public static final 생략되어 있음
	int MIN_VOLUME = 0;
	
	//추상 메소드 : 구현 클래스에서 무조건 오버라이드 해야한다.
	void turnOn();				// public abstract
	void turnOff();
	void setVolume(int volume);
	
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
	
}