package com.mj.SW_Expert_Academy.D1.p2058;

import java.util.Scanner;
import java.io.FileInputStream;

/*
[자릿수 더하기]

하나의 자연수를 입력 받아 각 자릿수의 합을 계산하는 프로그램을 작성하라.

[제약 사항]
자연수 N은 1부터 9999까지의 자연수이다. (1 ≤ N ≤ 9999)

[입력]
입력으로 자연수 N이 주어진다.

[출력]
각 자릿수의 합을 출력한다.
*/

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int[] arr = new int[str.length()];
		
		int sum = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
