package com.mj.Baekjoon;

import java.util.Scanner;

public class p1110 {
/*
 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
 
 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
 다음 예를 보자.6부터 시작한다.
 
 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다.
 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
 
위의 예는 4번만에 원래 수로 돌아올 수 있다.
따라서 26의 사이클의 길이는 4이다.

N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int org = sc.nextInt(); // 시작수 ex 26
		int num = org; // 시작수 복사 ex 26
		int count = 0; // 사이클
		int result = 0; // 구한 수
		while(true){
			int ten = num / 10; // 1) 십의 자리수 구하기 ex 26 => 2
			int one = num % 10; // 2) 일의 자리수 구하기 ex 26 => 6
			int sum = ten + one; // 3-1) 각 자리수 더하기 2 + 6 => 8
			
			if(sum >= 10) {
				sum = sum % 10; // 3-2)각 자리수 합이 10이 넘으면 다시 일의 자리수 구하기 6 + 8 => 14 => 4
			}
			
			result = one * 10 + sum; // 2에서구한 일의 자리수를 십의 자리수로 만들고 3에서 구한 자리수 합 더하기 => ex 68, 84, 42, 26 
			count ++; // 사이클 ++
			num = result; // 구한 수로 다시 시작 => 68(1), 84(2), 42(3), 26(4)
			if(result == org) { // 구한 수(26)가 시작 수(26)와 같으면 반복 종료
				break;
			}
		}	
		System.out.println(count); // 사이클 출력
	}
}