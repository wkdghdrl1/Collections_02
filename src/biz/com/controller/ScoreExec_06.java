package biz.com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import biz.com.model.ScoreVO;

public class ScoreExec_06 {

	public static void main(String[] args) {
		
		
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		
		Random rnd  = new Random();
		for(int i = 0; i < 50; i++) {
			
			/*
			 * 어떤 클래스를 객체로 생성해서
			 * 리스트에 추가하고자 할때는
			 * 값들을 대입하기에 앞서
			 * 반드시 클래스를 객체로 (새로) 생성해서
			 * 사용해야 한다.
			 * 			ScoreVO sVO = new ScoreVO();
			 */
			ScoreVO sVO = new ScoreVO();
			sVO.setNumber("" + (i + 1));
			
			sVO.setKor(rnd.nextInt(50)+ 51);
			sVO.setEng(rnd.nextInt(50)+ 51);
			sVO.setMath(rnd.nextInt(50)+ 51);

			scList.add(sVO);
			
		}
		for(ScoreVO s : scList) {
			System.out.println(s.toString());
		}
		
		/*
		 * List의 크기를 알 수 있는 method로 List.size()가 있다
		 * 이 List.size() 메소드는 호출할 때마다 매번 List의 개수를
		 * 계산한다.
		 * 따라서 배열의 Length와는 성질이 달라서
		 * for문 내에서는 가급적 사용하지 말고
		 * for가 시작되기 전에 미리 변수에 담아놓고
		 * for 반복문을 실행하는 것이 좋다.
		 */
		int scLen = scList.size();
		for(int i = 0; i < scLen; i++) {
			ScoreVO vo = scList.get(i);
			//scList i번째에 저장되어 있는 주소를 ScoreVO의 주소를 읽어서
			// vo에 담아달라
			
			int intTotal = vo.getKor() + vo.getEng() + vo.getMath();
			
			intTotal = scList.get(i).getKor();
			intTotal += scList.get(i).getEng();
			intTotal += scList.get(i).getMath();
			
			
			vo.setTotal(intTotal);
			vo.setAverage(intTotal / 3);
			
			// build 패턴
			// scList의 주소를 직접 참조하여
			// 주소로부터 Total 변수의 위치를 물어보고
			// 그 Total 변수에 값을 setting
			scList.get(i).setTotal(intTotal);
			scList.get(i).setAverage(intTotal / 3);
		}
		
		scLen = scList.size();
		for(int i = 0; i < scLen; i++) {
			for(int j = i + 1; j < scLen; j++) {
				ScoreVO v1 = scList.get(i);
				ScoreVO v2 = scList.get(j);
				if(v1.getTotal() > v2.getTotal()) {
					ScoreVO _score = scList.get(i);
					scList.set(i, v2);
					scList.set(j, _score);
					
				}
			}
		}
		
	}
	
	
}
