package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		
		//복습하기************************
		
		//배열 선언
		int intArray[] = new int[6];
		
		//배열 자료도 반복문으로 지정 가능
		//랜덤 뽑기
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = (int)(Math.random()*45)+1;
			
			boolean overlap = false;
			
			//중복 확인 
			for (int z=0; z<i; z++) {
				
				if(intArray[i]==intArray[z]) {
					overlap = true;
				}
				
			}//확인 끝
			
			//중복 제거
			if (overlap==true) {
				i--;
				continue;
			}//중복제거 끝
			
		}//랜덤 뽑기 끝
		
		//출력
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+"\t");
		}
		
	}

}
