package com.biz.exec.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LeapYearService {

	List<Integer> leapYearList;
	
	public LeapYearService() {
		
		leapYearList = new ArrayList<Integer>();
	}
	
	public void makeLeapYearList(int startYear, int endYear) {
		//2개의 변수로 리스트에 추가
		for(int year = startYear; year <= endYear; year++ ) {
			
			if(year % 4 == 0 && year %100 != 0 || year % 400 == 0) {
				leapYearList.add(year);
			}
		}
		
		System.out.println("윤년 개수 : " + leapYearList.size());
		System.out.println("윤년 리스트를 만들었습니다");
	}
	public void writeLeapYearListFile(String leapFileName) {
		//파일이름을 매개변수로 받고 써내려감
		FileWriter fileWriter = null;
		PrintWriter printWriter =  null;
		
		
		try {
			fileWriter = new FileWriter(leapFileName);
			printWriter = new PrintWriter(fileWriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int year : leapYearList) {
			printWriter.println(year + "년");
		}
		printWriter.flush();
		printWriter.close();

		System.out.println("파일에 저장 완료");
	}	
	
}
