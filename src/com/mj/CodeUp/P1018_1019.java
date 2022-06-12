package com.mj.CodeUp;

import java.util.Scanner;

public class P1018_1019 {

	public static void main(String[] args) {
		//P1018_시간 입력받아 그대로 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 입력하세요(시간:분) : ");
		String str = sc.nextLine();
		
		String[] time = str.split(":"); // :로 문자열 분리
		System.out.println(time[0] + ":" +time[1]); //출력
		
		//P1019_연월일 입력받아 그대로 출력하기
		System.out.print("연,월,일을 입력하세요(.(닷)로 구분) : ");
		String str2 = sc.nextLine();
		int[] iarr = new int[3];
		String[] date = str2.split("\\."); // .로 문자열 분리
		for(int i = 0 ; i < date.length ; i++) {
			iarr[i] = Integer.parseInt(date[i]);
		}
		System.out.printf("%d.%02d.%02d", iarr[0], iarr[1], iarr[2]);
		
		
	}

}
