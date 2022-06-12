package com.mj.SW_Expert_Academy.D1.p2068;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

/*
[최대수 구하기]
10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.

[제약 사항]
각 수는 0 이상 10000 이하의 정수이다.

[입력]
가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.

[출력]
출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.
(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

[출력]
N 개의 점수들 중, 중간값에 해당하는 점수를 정답으로 출력한다.
*/

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] before = new int[10];

		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < 10; j++) {
				int num = sc.nextInt();
				before[j] = num;
			}
			Arrays.sort(before);
			System.out.printf("#%d %d\n", i, before[9]);
		}
	}
}
