package com.mj.Baekjoon.array;

import java.util.Scanner;

public class p2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int num = 0;
        for(int i = 0 ; i < 9 ; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(max == arr[i]){
                num = i;
            }
        }
        System.out.println(max);
        System.out.println(num + 1);
    }
}
