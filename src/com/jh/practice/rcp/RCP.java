package com.jh.practice.rcp;

import java.util.Scanner;

public class RCP {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		int ch1 = 0;
		int ch2 = 0;
		int ch3 = 0;
		while(true) {
		System.out.println("=======���������� ����=======");
		System.out.println("����,����,�� �߿� �������ּ���.");
		System.out.println("1.���� 2.���� 3.���ڱ�");
		System.out.print("����(1/2/3) : ");
		ch1 = sc.nextInt();
		
		String hu = "";
		switch(ch1) {
		case 1 :
			hu = "����";
			break;
		case 2 :
			hu = "����";
			break;
		case 3 :
			hu = "���ڱ�";
			break;
		default :
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		ch2 = (int)(Math.random() * 3) + 1;
		
		String com = "";
		switch(ch2) {
		case 1 :
			com = "����";
			break;
		case 2 :
			com = "����";
			break;
		case 3 :
			com = "���ڱ�";
			break;
		}
		
		if(hu.equals("����") && com.equals("����") || hu.equals("����") && com.equals("����") || hu.equals("���ڱ�") && com.equals("���ڱ�")) {
			System.out.println("<���>");
			System.out.println("�� : " + hu);
			System.out.println("com : " + com);
			System.out.println("�����ϴ�.");
		} else if(hu.equals("����") && com.equals("����") || hu.equals("����") && com.equals("���ڱ�") ||hu.equals("���ڱ�") && com.equals("����")) {
			System.out.println("<���>");
			System.out.println("�� : " + hu);
			System.out.println("com : " + com);
			System.out.println("���� �й��...");
		} else if(hu.equals("����") && com.equals("���ڱ�") || hu.equals("����") && com.equals("����") || hu.equals("���ڱ�") && com.equals("����")) {
			System.out.println("<���>");
			System.out.println("�� : " + hu);
			System.out.println("com : " + com);
			System.out.println("���� �̰��!!");
			} 
		System.out.println("=========================");
		System.out.println("���� ��!(1��)");
		System.out.println("����(2��)");
		System.out.print("����(1/2) : ");
		ch3 = sc.nextInt();
		
		switch(ch3) {
		case 1 :
			System.out.println("���� �� �մϴ�."); break;
		case 2 :
			System.out.println("���α׷��� �����մϴ�.");  return;
		}
		}
	}
}
