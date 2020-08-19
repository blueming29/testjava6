package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		float avg = 0.0f;
		int[] ScoreArr = new int[5];
		System.out.println("5명의 점수를 입력하세요");

		for (int i = 0; i < ScoreArr.length; i++) {
			ScoreArr[i] = sc.nextInt();
		}

		for (int i = 0; i < ScoreArr.length; i++) {
			sum += ScoreArr[i];
		}
		avg = (float) sum / ScoreArr.length;

		System.out.println("합계 : " + sum + "\n평균 " + avg);
		sc.close();
	}
}
