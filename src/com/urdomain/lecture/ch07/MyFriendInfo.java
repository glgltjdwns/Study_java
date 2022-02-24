package com.urdomain.lecture.ch07;

public class MyFriendInfo extends MyFriendDetailInfo{
	
	//필드
	String address = "서울 관악구 어쩌구저쩌구";
	String Phonenumber = "010-4855-1234" ;


	
	//생성자 (명시적 생성자)
	
	MyFriendInfo(String Name, int age, String address , String Phonenumber ){
		this.Name = Name;
		this.age = age;
		this.address = address;
		this.Phonenumber = Phonenumber;
	}
	
	

}


