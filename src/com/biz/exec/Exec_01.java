package com.biz.exec;

import java.util.Random;

public class Exec_01 {

	public static void main(String[] args) {

		/*
		 * 비교판단문
		 * 어떤 결과가 true,false를 판단해서
		 * 코드의 흐름을 변경하는것
		 */

		Random rnd = new Random();
		
		while(true) {
			int intR = rnd.nextInt(100);
			if(intR % 2 == 0) {
				//intR을 2로 나머지 연산을 수행하여
				//결과가 0이냐? 를 물어보는것
				System.out.println(intR + "은 짝수입니다");
				System.out.println(intR + "은 2의 배수입니다");
			}
			if(intR % 3 ==0) {
				System.out.println(intR + "은 3의 배수입니다");
			}
			
			int intNum = intR % 5; 
			
			if(intNum == 0) System.out.println(intNum + "은 5의 배수입니다");
			if(intNum == 1) System.out.println("나머지가 1");
			if(intNum == 2) System.out.println("나머지가 1");
			if(intNum == 3) System.out.println("나머지가 1");
			if(intNum == 4) System.out.println("나머지가 1");
			//if = ()안의 값이 true이나 false이냐를 판단
			
			switch (intNum) {
			case 0:
				System.out.println("나머지가 0");
				break;
			case 1:
				System.out.println("나머지가 1");
				break;
			case 2:
				System.out.println("나머지가 2");
				break;
			case 3:
				System.out.println("나머지가 3");
				break;
			case 4:
				System.out.println("나머지가 4");
				break;

			default:
				break;
			}
			//intNum의 변수의 값이 0,1,2,3,4일 경우에 실행되는 코드들 ,그렇지 않을경우 실행되는 코드 if와 비슷하면서 약간 다름
			//c언어의 경우 intNum의 부분에 정수만 가능 ,Java는 다른것도 가능  
			//case에 같은 값을 쓸 수 없음(중복될 수 없다)
			//break가 보통 for나 while에서 쓰이지만 switch에서도 쓸 수 잇지만 switch에서 쓰는 break는 switch문을 빠져나가는것
		}
		
	}

}
