package biz.com.controller;

import java.util.Random;
import java.util.Set;

import biz.com.model.ScoreVO;

public class ScoreRankExec_01 {

	public static void main(String[] args) {

		ScoreVO[] sVOa = new ScoreVO[10];
		Random rnd = new Random();

		for (int i = 0; i < sVOa.length; i++) {
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			sVOa[i] = new ScoreVO();
			sVOa[i].setNumber("" + (i + 1));
			sVOa[i].setKor(intKor);
			sVOa[i].setEng(intEng);
			sVOa[i].setMath(intMath);

			int intTotal = 0;
			intTotal = sVOa[i].getKor();
			intTotal += sVOa[i].getEng();
			intTotal += sVOa[i].getMath();

			sVOa[i].setTotal(intTotal);
			sVOa[i].setAverage(intTotal / 3);
		}
//		for(int i = 0 ; i< sVOa.length; i++) {
//			System.out.println(sVOa[i].toString());
//		}

		System.out.println("=========================================");
		System.out.println("빅데이터반 성적처리");
		System.out.println("=========================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차\n");
		System.out.println("-----------------------------------------");
		for (ScoreVO vo : sVOa) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%5d\t%3d\n", vo.getNumber(), vo.getKor(), vo.getEng(),
					vo.getMath(), vo.getTotal(), vo.getAverage(), vo.getRank());
		}
		System.out.println("=========================================");

		
				// 부등호의 방향 > : 오름차순 정렬
				// 부등호의 방향 < : 내림차순 정렬
			 
		for (int i = 0; i < sVOa.length; i++) {
			for (int j = 0; j < sVOa.length; j++) {
				if (sVOa[i].getTotal() < sVOa[i].getTotal()) {

					ScoreVO _score = sVOa[i];
					sVOa[i] = sVOa[j];
					sVOa[j] = _score;
				}

			}

		}
		
		for(int i = 0; i < sVOa.length; i++) {
			sVOa[i].setRank(i+1);
		}
		
		//  number 필드가 String이므로
		// 숫자(정수)로 변경한 다음 비교한다.
		for (int i = 0; i < sVOa.length; i++) {
			for (int j = 0; j < sVOa.length; j++) {
				if (Integer.valueOf(sVOa[i].getNumber()) < Integer.valueOf(sVOa[i].getNumber())) {

					ScoreVO _score = sVOa[i];
					sVOa[i] = sVOa[j];
					sVOa[j] = _score;
				}

			}

		}

		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차\n");
		System.out.println("----------------------------------------------------");
		for(ScoreVO vo : sVOa) {
		System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%5d\t%3d\n",
				vo.getNumber(),
				vo.getKor(),
				vo.getEng(),
				vo.getMath(),
				vo.getTotal(),
				vo.getAverage(), 
				vo.getRank());
		}
		System.out.println("====================================================");
	}

}
