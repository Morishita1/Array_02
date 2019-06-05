package com.biz.lotto;

import java.util.Random;

public class Lotto_03 {

	public static void main(String[] args) {

		// 6개의 정수형 배열을 생성하고

		// 정수배열 개수만큼 반복을 하면서
		// 1. 임의 정수 1부터45까지 중 한개를 생성
		// 2. 생성한 수가 배열에 이미 담겨 있는지 검사
		// 3. 그렇지 않으면 배열에 임의 정수를 담기

		int[] num = new int[6];
		Random rnd = new Random();
		int R = rnd.nextInt(45) + 1;
		int index;
		for (int i = 0; i < num.length; i++) {
			R = rnd.nextInt(45) + 1;
			for (index = 0; index < num.length; index++) {
				if (num[index] == R) {
					break;
				}
			}
			if (index >= num.length) {
				num[i] = R;
			} else {
				
				i--;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}

		// 생성된 6개의 lottoNum을 순서대로 정렬
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int _temp=num[i];
					num[i]=num[j];
					num[j]=_temp;
				}
			}
			
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}

	}

}
