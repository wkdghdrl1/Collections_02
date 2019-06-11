package biz.com.controller;

import biz.com.model.ScoreVO;

public class ScoreExec_02 {
	public static void main(String[] args) {
		
	
	// ScoreVO 클래스를 이용해서 2개의 배열을 생성
	// 각각 배열에 2명의 성적을 입력저장
	
	ScoreVO[] sVOs = new ScoreVO[2];
	
	// 생성된 배열에 각각 2명의 성적을 저장
	
	sVOs[0] = new ScoreVO();
	sVOs[0].setNumber("1");
	sVOs[0].setName("홍길동");
	sVOs[0].setKor(90);
	sVOs[0].setEng(89);
	sVOs[0].setMath(99);
	
	int intTotal = sVOs[0].getKor();
	intTotal += sVOs[0].getEng();
	intTotal += sVOs[0].getMath();

	//총점 계산
	sVOs[0].setTotal(intTotal);
	sVOs[0].setAverage(intTotal / 3);
	
	System.out.println(sVOs[0].toString());
	
	sVOs[1] = new ScoreVO();
	sVOs[1].setNumber("2");
	sVOs[1].setName("도하나");
	sVOs[1].setKor(90);
	sVOs[1].setEng(80);
	sVOs[1].setMath(77);
	
	intTotal = sVOs[1].getKor();
	intTotal += sVOs[1].getEng();
	intTotal += sVOs[1].getMath();
		
	//총점 계산
	sVOs[1].setTotal(intTotal);
	sVOs[1].setAverage(intTotal / 3);
	
	System.out.println(sVOs[1].toString());
}

}