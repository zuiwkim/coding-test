package com.mj.CodeUp;

import java.util.Scanner;

public class p2022_2023 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//p2022. 공백 문자가 포함되어 있는 문장을 입력받고 그대로 출력하는 연습을 해보자.				
		String str = sc.nextLine();		
		System.out.println(str);
		
		//p2023. 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
		String num = sc.nextLine();
		String[] no = num.split("\\.");
		System.out.println(no[0]);
		System.out.println(no[1]);
	}
}
