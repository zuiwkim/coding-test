package com.mj.SW_Expert_Academy.D1.p2056;

import java.util.Scanner;
import java.io.FileInputStream;

/*
[연월일 달력]

연월일 순으로 구성된 8자리의 날짜가 입력으로 주어진다.

해당 날짜의 유효성을 판단한 후, 날짜가 유효하다면
[그림1] 과 같이 ”YYYY/MM/DD”형식으로 출력하고,
날짜가 유효하지 않을 경우, -1 을 출력하는 프로그램을 작성하라.
연월일로 구성된 입력에서 월은 1~12 사이 값을 가져야 하며
일은 [표1] 과 같이, 1일 ~ 각각의 달에 해당하는 날짜까지의 값을 가질 수 있다.
*/

class Solution {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= time; i++) {
			String str = sc.nextLine();

			String year = str.substring(0, 4);
			String month = str.substring(4, 6);
			String date = str.substring(6, 8);

			int lastDate = 0;

			switch (Integer.parseInt(month)) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: lastDate = 31; break;
			case 4:
			case 6:
			case 9:
			case 11: lastDate = 30; break;
			case 2: lastDate = 28; break;
			}
			
			if (lastDate == 0 | Integer.parseInt(date) > lastDate) {
				System.out.printf("#%d %d\n", i, -1);
				continue;
			} else {
				System.out.printf("#%d %s/%s/%s\n", i, year, month, date);
			}
		}
	}
}
