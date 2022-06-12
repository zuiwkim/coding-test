package com.mj.CodeUp;

import java.util.Scanner;

public class p1015_1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1015-실수 한개 입력받고 소수점 둘째자리까지 출력
		System.out.print("실수 입력 : ");
		float fnum = sc.nextFloat();
		System.out.printf("%.2f", fnum);
		
		System.out.println();
		
		// 1017-정수 한개 입력받고 공백을 두고 세번 출력
		System.out.print("정수 입력 : ");
		int inum = sc.nextInt();
		System.out.printf("%d %d %d", inum, inum, inum);

		
	}

}
