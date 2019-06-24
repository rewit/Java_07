package com.biz.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		String strY = scan.nextLine();
		int intY = Integer.valueOf(strY);

//		if(intY % 4 ==0) {
//			System.out.println("1차 후보");
//			if(intY % 100 != 0 || intY % 400 == 0) {
//				System.out.println(intY + "2차 후보");
//			}
//		}
//		if(intY %4 ==0 ) {
//			if(intY %4 == 0 && intY %100 != 0) {
//				
//			}else if(intY % 4 == 0 && intY % 400 == 0){
//			System.out.println("윤년");	
//			}
//		}

//		for (intY = 1500; intY < 3000; intY++) {
			if (intY % 4 == 0 && intY % 100 != 0 || intY % 400 == 0) {
				System.out.println(intY + "는 윤달입니다");
	//			yrList.add(intY);
		//	}
		}

		
	}
}

// 4로 나누어서 나머지가 0이고 100으로 나눠서 0이 아니거나 400으로 나눠서 나머지가 0인 수

//		if (intY % 4 == 0 || intY %400 ==0) {
//			System.out.println(intY + "는 4년마다 한번씩 찾아온다");
//
//		if (intY % 100 != 0) {
//		} System.out.println( intY + "는 윤년이다");
//		}
//	}
//}
