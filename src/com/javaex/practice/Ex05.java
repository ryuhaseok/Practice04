package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		double[] dA = new double[5];
		
		dA[0] = sc.nextDouble();
		dA[1] = sc.nextDouble();
		dA[2] = sc.nextDouble();
		dA[3] = sc.nextDouble();
		dA[4] = sc.nextDouble();
		
		double sum = 0;
		
		for(int i = 0; i < dA.length; i++) {
			sum = sum + dA[i];
		}
		System.out.println("평균은 " + sum/dA.length + " 입니다.");
		sc.close();
		
		
	}

}
