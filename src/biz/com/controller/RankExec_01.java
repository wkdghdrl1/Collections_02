package biz.com.controller;

import java.util.Random;

public class RankExec_01 {

	public static void main(String[] args) {
		
		/*
		 *  int 배열 intKor를 10개 생성하고
		 *  각각의 값을 51부터 100까지 임의의 값으로 세팅
		 *  세팅된 배열의 값을 오름차순 정령을 해봅시다.
		 */
		
		int[] intKor = new int[10];
		
		Random rnd = new Random();
		
		
		//  Random(난수)를 발생하여
		//  51~ 100까지 임의의 값으로 채우기
		for (int i = 0 ; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(50) + 51;
		}
		for(int i : intKor) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		/*
		 * 난수(Random)는 일정간격으로 값을 생성하면
		 * 절대 중복되지 않는 임의의 값을 갖는 수들의 집합
		 * 암호화같은 특수한 용도에서 사용을 하는 수열, 잡합
		 * 
		 *  하지만 컴퓨터에서 생성하는 난수는
		 *  컴퓨터 내부에서 특별한 연산을 통해 생성을 하다보니
		 *  유사한 값들이 나타난다.
		 *  그래서 컴퓨터에서 생성한 난수는 유사난수라고 부르며
		 *  실험적인 용도로만 사용해야 한다.
		 */
		
		for(int i = 0; i < intKor.length; i++) {
			for(int j = 0; j < intKor.length; j++) {
				if( intKor[i] < intKor[j]) {
					int _tmp = intKor[i];
					   intKor[i] = intKor[j];
					   intKor[j] = _tmp;
				}
			}
		}
		for(int i = 0 ; i < intKor.length; i++)	{
			System.out.print(intKor[i]+ ("\t"));
					
		}
		
	}
}
