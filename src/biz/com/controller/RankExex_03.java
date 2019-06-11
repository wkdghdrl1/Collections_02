package biz.com.controller;

import java.util.Random;

public class RankExex_03 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		int[] intTotal = new int[10];

		Random rnd = new Random();

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = i + 1;
			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;

			/*
			 * intTotal[i] = intKor[i]; intTotal[i] += intEng[i]; intTotal[i] += intMath[i];
			 */

			intTotal[i] = intKor[i] + intEng[i] + intMath[i];

		}
		for (int i = 0; i < intNum.length; i++) {
			for (int j = 0; j < intNum.length; j++) {
				if (intTotal[i] > intTotal[j]) {
				
					int _num = intNum[i];
					intNum[i] = intNum[j];
					intNum[j] = _num;

					int _kor = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _kor;

					int _eng = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = _eng;

					int _math = intMath[i];
					intMath[i] = intMath[j];
					intMath[j] = _math;

					int _total = intTotal[i];
					intTotal[i] = intTotal[j];
					intTotal[j] = _total;
				}

			}
		}
		System.out.println("=========================================");
		System.out.println("빅데이터반 성적표");
		System.out.println("=========================================");
		System.out.println("학번 \t 국어\t 영어\t 수학\t 총점\t");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < intNum.length; i++) {
			System.out.printf("%3d\t %3d\t %3d\t %3d\t %3d\t \n",intNum[i], intKor[i],
					intEng[i], intMath[i], intTotal[i]);
			
		}
		System.out.println("-----------------------------------------");
	}

}
