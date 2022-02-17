package com.urdomain.lecture.Function;

import java.util.Scanner;

public class test {

	public static void main1(String[] args) {
		

	}




//	
//	public static void recommendMenu() {
//		Scanner sca = new Scanner(System.in);
//		System.out.println("원하시는 카테고리를 선택해 주세요.");
//		System.out.println("중식 = 1" + " 한식 = 2" + " 양식 = 3" + " 일식 = 4" + " 원하시는 카테고리를 숫자로 입력해주세요");
//		int category = sca.nextInt();
//		printMenu(category);
//		
//	}
//	
//	public static void printMenu(int cate) {
//		String food[] = new String[5];
//		String category[] = {"", "중식", "한식", "양식", "일식"};
//		food[1] = "짜장면";
//		food[2] = "제육볶음";
//		food[3] = "알리오올리오";
//		food[4] = "부타동";
//		System.out.println("오늘 추천 드리는 " + category[cate] + "메뉴는 " + food[cate] + " 입니다.");
//	}    기정님 정답

//	public static String[] food(String a) {
//		String[] foods = new String[3];
//		switch (a) {
//		case "중식":
//			foods = new String[] { "짜장면", "짬뽕", "우동" };
//			break;
//		case "일식":
//			foods = new String[] { "초밥", "라멘", "소바" };
//			break;
//		case "양식":
//			foods = new String[] { "스테이크", "스파게티", "리조또" };
//			break;
//		case "한식":
//			foods = new String[] { "냉면", "제육볶음", "김치찌개" };
//			break;
//		}
//
//		return foods;
//	}
//
//	public static void print(String[] a) {
//		int i = (int) (Math.random() * 2);
//
//		System.out.println("오늘 추천 드리는 메뉴는 " + a[i] + "입니다");
//
//	}
//
//	public static void main(String[] args) {
//		System.out.print("먹고 싶은 음식 종류를 입력해주세요 (일식,양식,중식,한식)>>");
//		Scanner sc = new Scanner(System.in);
//		String foodtype = sc.nextLine();
//		
//		
//		print(food(foodtype));
//
//	} 권순형님 정답
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("먹고 싶은 음식을 고르세요 : 한식 중식 일식 양식");
			
			String myFood = scan.nextLine();
			
			food(myFood);
		}

		public static void food(String myFood) {
			
			String[] korean = {"떡볶이","김밥","비빔밥","떡갈비","김치찌개","된장찌개","김치볶음밥"};
			String[] chinese = {"짜장면","짬뽕","볶음밥","탕수육","춘권","고추잡채"};
			String[] western = {"파스타","리조또","피자","햄버거","스테이크","샐러드"};
			String[] japanese = {"초밥","돈까스","우동","타꼬야끼","사시미"};
			String[] food = null;
			
			switch(myFood) {
				case "한식":
					food = korean;
					break;
				case "중식":
					food = chinese;
					break;
				case "양식":
					food = western;
					break;
				case "일식":
					food = japanese;
					break;
				default:
					System.out.println("잘못 입력하였습니다.");
					System.exit(0);
			}
			
//			int num = (int) (Math.random() * (food.length - 1));
			int num = (int) (Math.random() * (food.length + 1));
			
			println(food[num]);
		}
		
		public static void println(String a) {
			System.out.println("오늘 추천 드리는 메뉴는 " + a + "입니다.");
		}	
		
	
	
	}
	
	
	
	
