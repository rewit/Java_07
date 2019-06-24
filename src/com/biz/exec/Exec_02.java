package com.biz.exec;

import java.util.Random;

public class Exec_02 {

	public static void main(String[] args) {

		/*
		 * 비교판단문 어떤 결과가 true,false를 판단해서 코드의 흐름을 변경하는것
		 */

		Random rnd = new Random();

	//	while (true) {
			int intR = rnd.nextInt(100);
			int intNum = intR % 5;
			
			/*
			 * intNum에 담겨있는 값이 
			 * 어떤 경우(case)에 해당하느냐를 판단해서
			 * case문 아래의 코드를 실행한다
			 * 
			 *  어떤 경우에 해당하는 코드를 모두 실행하면
			 *  다음번 case문을 만나기 전에
			 *  break문을 반드시 실행시켜야한다
			 */
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
							//break가 없다면  만약 intNum = 2일 경우 나머지2,3,4가 동시에 실행된다
							//break는 intNum의 최초에 일치하는 값만 실행하고 나머지는 무시하라는 
			default:
				break;
			}
		}

	}

//}
