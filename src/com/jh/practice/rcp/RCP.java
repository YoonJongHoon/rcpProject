package com.jh.practice.rcp;

import java.util.Scanner;

public class RCP {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		int ch1 = 0;
		int ch2 = 0;
		int ch3 = 0;
		while(true) {
		System.out.println("=======가위바위보 게임=======");
		System.out.println("가위,바위,보 중에 선택해주세요.");
		System.out.println("1.가위 2.바위 3.보자기");
		System.out.print("선택(1/2/3) : ");
		ch1 = sc.nextInt();
		
		String hu = "";
		switch(ch1) {
		case 1 :
			hu = "가위";
			break;
		case 2 :
			hu = "바위";
			break;
		case 3 :
			hu = "보자기";
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
		}
		
		ch2 = (int)(Math.random() * 3) + 1;
		
		String com = "";
		switch(ch2) {
		case 1 :
			com = "가위";
			break;
		case 2 :
			com = "바위";
			break;
		case 3 :
			com = "보자기";
			break;
		}
		
		if(hu.equals("가위") && com.equals("가위") || hu.equals("바위") && com.equals("바위") || hu.equals("보자기") && com.equals("보자기")) {
			System.out.println("<결과>");
			System.out.println("나 : " + hu);
			System.out.println("com : " + com);
			System.out.println("비겼습니다.");
		} else if(hu.equals("가위") && com.equals("바위") || hu.equals("바위") && com.equals("보자기") ||hu.equals("보자기") && com.equals("가위")) {
			System.out.println("<결과>");
			System.out.println("나 : " + hu);
			System.out.println("com : " + com);
			System.out.println("나의 패배다...");
		} else if(hu.equals("가위") && com.equals("보자기") || hu.equals("바위") && com.equals("가위") || hu.equals("보자기") && com.equals("바위")) {
			System.out.println("<결과>");
			System.out.println("나 : " + hu);
			System.out.println("com : " + com);
			System.out.println("내가 이겼다!!");
			} 
		System.out.println("=========================");
		System.out.println("한판 더!(1번)");
		System.out.println("종료(2번)");
		System.out.print("선택(1/2) : ");
		ch3 = sc.nextInt();
		
		switch(ch3) {
		case 1 :
			System.out.println("한판 더 합니다."); break;
		case 2 :
			System.out.println("프로그램을 종료합니다.");  return;
		}
		}
	}
}
