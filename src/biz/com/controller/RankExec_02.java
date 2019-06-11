package biz.com.controller;

import java.util.Random;

public class RankExec_02 {

	public static void main(String[] args) {

		/*
		 * 학번과 국어점수를 각각 배열로 생성하고 학번은 1번부터 순서대로 부여 국어점수는 임의의 값으로 생성하여 저장
		 * 
		 */

		int[] intNum = new int[10];
		int[] intKor = new int[10];

		Random rnd = new Random();

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = i + 1;
			intKor[i] = rnd.nextInt(50) + 51;

		}
		int index = 0;
		for (int num : intNum) {
			System.out.printf("%d : %d \t", num, intKor[index++]);
		}
		System.out.println();

		/*
		 * 국어점수를 기준으로 오름차순 정력을 실행
		 */

		for (int i = 0; i < intNum.length; i++) {
			for (int j = 0; j < intNum.length; j++) {
				if (intKor[i] > intKor[j]) {
					int _tmp = intNum[i];
					intNum[i] = intNum[j];
					intNum[j] = _tmp;
					
					int  _temp = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _temp;

				}
			
						}
					}
			
		index = 0;
		for (int num : intNum) {
			System.out.printf("%d : %d \t",num, intKor[index++]);
		}
}}
