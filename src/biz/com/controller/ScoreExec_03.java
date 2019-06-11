package biz.com.controller;

import java.util.Random;
import java.util.Set;

import biz.com.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {
		
		// ScoreVO 클래스를 이용해서 10개의 배열을 생성하고
		// 번호는 순서대로 설정하고
		// 이름은 입력하지 않고
		// kor, eng, math 점수를 각각 난수로 생성
		//  단 점수는 51점부터 100점까지 저장
		// 입력(저장된)값을 콘솔에서 확인하고 
		// 총점과 평균 계산
		
		
		ScoreVO[] sVOa = new ScoreVO[10];
		Random rnd = new Random();
		
		for(int i = 0; i < sVOa.length; i++) {
			sVOa[i] = new ScoreVO();
			//number 필드를 private으로 선언했기 때문에
			// 다음 코드는 사용 불가
			// sVOa[i].number = ?;
			// 때문에 number값을 저장할 때 사용할 setter method를 만들었다.
			// number 필드는 String형인데 i 값은 int형이다.
			// sVOa[i].setNumber(i); // 오류발생
			
			int intKor = rnd.nextInt(50)+ 51;
			int intEng = rnd.nextInt(50)+ 51;
			int intMath = rnd.nextInt(50)+ 51;
			// 1. i 값은 0부터 시작하므로 +1을 실행해서
			//		1부터 시작하도록 설정 해줘야 한다.
			// 2. 따라서 number필드에 값을 저장하기 위해서는
			// 		int형을 String형으로 변환시켜야 한다.
			// 기존의 자바 전통문법
			// sVOa[i].setNumber(Integer.toString(i+1));
			// int형을 String으로 바꾸는 최근문법
			sVOa[i].setNumber(""+ (i+1));
			// 하지만 이 코드는 모든 문자를 문자화 한 후
			// 연결하여 number값을 01, 11, 21, 31 형식으로 바뀌게 된다.
			// 따라서 먼저 i값에 +1을 실행해서 숫자값으로 1증가시킨 후
			// 문자열로 바꾸어야 한다.
			//1번
			sVOa[i].setKor(intKor);
			sVOa[i].setEng(intEng);
			sVOa[i].setMath(intMath);
			
			//2번
//			sVOa[i].setKor(rnd.nextInt(50) + 51);
//			sVOa[i].setEng(rnd.nextInt(50) + 51);
//			sVOa[i].setMath(rnd.nextInt(50) + 51);
			
			int intTotal = 0;
				intTotal = sVOa[i].getKor();
				intTotal += sVOa[i].getEng();
				intTotal += sVOa[i].getMath();
				
				sVOa[i].setTotal(intTotal);
				sVOa[i].setAverage(intTotal / 3);
		}
		//총점을 별도로 계산
//		for(ScoreVO vo : sVOa) {
//			int intKor = vo.getKor();
//			int intEng = vo.getEng();
//			int intMath = vo.getMath();
//			
//			int intTotal = intKor + intEng + intMath;
//		}
//		for(ScoreVO vo : sVOs) {
//		System.out.println(vo.toString());
//		}
		for(int i = 0 ; i< sVOa.length; i++) {
			System.out.println(sVOa[i].toString());
		}
		
	}
	
}
