package com.mj.SW_Expert_Academy.D1.p2046;

import java.util.Scanner;
import java.io.FileInputStream;


/*
[스탬프 찍기]

주어진 숫자만큼 # 을 출력해보세요.
주어질 숫자는 100,000 이하다.
*/

class Solution {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();
		for (int i = 0; i < P; i++) {
			System.out.print("#");
		}

	}
}
