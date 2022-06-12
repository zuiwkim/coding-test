package com.mj.SW_Expert_Academy.D1.p2050;

import java.util.Scanner;
import java.io.FileInputStream;

/*
[알파벳을 숫자로 변환]

알파벳으로 이루어진 문자열을 입력 받아 각 알파벳을 1부터 26까지의 숫자로 변환하여 출력하라.

[제약 사항]
문자열의 최대 길이는 200이다.

[입력]
알파벳으로 이루어진 문자열이 주어진다.

[출력]
각 알파벳을 숫자로 변환한 결과값을 빈 칸을 두고 출력한다.
*/

class Solution {
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		for(int i = 0 ; i < str.length() ; i++) {
			System.out.print(str.charAt(i) - 64 + " ");
		}
		
	}
}
