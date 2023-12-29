package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {

		//수정
		// int[] intArray = new int[3];
		// for( int i =0; i < intArray.length; i++)
		
		//결과
		/*
		3
		7
		22
		*/
		// 22, 반복문 후에 결과값을 1번 출력하는 것. 반복영역 잘 구분하기
		
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for( int i = 0; i < intArray.length; i++) {
			result = result + intArray[i];
			
		}
		System.out.println(result);
	}

}
