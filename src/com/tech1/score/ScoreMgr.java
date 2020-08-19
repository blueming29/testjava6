package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ScoreArr = new int[5];

		while (true) {
			int sum = 0;
			float avg = 0.0f;
			System.out.println("5명의 점수를 입력하세요(종료 : -1)");
			for (int i = 0; i < ScoreArr.length; i++) {
				ScoreArr[i] = sc.nextInt();
				if (ScoreArr[i] == -1) {
					System.out.println("종료합니다");
					return;
				} else if((ScoreArr[i]<50) || (ScoreArr[i]>100)) {
					System.out.println("다시 입력하기\n");
					break;
				} else {
					sum += ScoreArr[i];					
				}
			}
			
			avg = (float) sum / ScoreArr.length;

			System.out.println("합계 : " + sum + "\n평균 " + avg);
			System.out.println();
		}
	}
}
