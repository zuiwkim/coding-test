package com.mj.CodeUp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class p2020_2021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 2020. 주민번호를 입력받아 형태를 바꿔 출력해보자.
		// ex) 000907-1121112 -> 0009071121112
		System.out.print("주민번호를 입력하세요 (- 포함) : ");
		String str = sc.nextLine();
		
		StringTokenizer no = new StringTokenizer(str, "-");
		
		System.out.println(no.nextToken() + no.nextToken());
		
		// 2021. 1개의 단어를 입력받아 그대로 출력해보자.
		System.out.print("단어를 입력하세요 : ");
		String data = sc.nextLine();
		
		System.out.println(data);
	}

}
