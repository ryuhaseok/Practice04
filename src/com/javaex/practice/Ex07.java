package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int myWon = sc.nextInt();
		
		int om = 0;
		int m = 0;
		int oc = 0;
		int c = 0;
		int ob = 0;
		int b = 0;
		int os = 0;
		int s = 0;
		int oh = 0;
		int il = 0;
		
		om = myWon/wonArray[0];
		m = myWon%wonArray[0]/wonArray[1];
		oc = myWon%wonArray[0]%wonArray[1]/wonArray[2];
		c = myWon%wonArray[0]%wonArray[1]%wonArray[2]/wonArray[3];
		ob = myWon%wonArray[0]%wonArray[1]%wonArray[2]%wonArray[3]/wonArray[4];
		b = myWon%wonArray[0]%wonArray[1]%wonArray[2]%wonArray[3]%wonArray[4]/wonArray[5];
		os = myWon%wonArray[0]%wonArray[1]%wonArray[2]%wonArray[3]%wonArray[4]%wonArray[5]/wonArray[6];
		s = myWon%wonArray[0]%wonArray[1]%wonArray[2]%wonArray[3]%wonArray[4]%wonArray[5]%wonArray[6]/wonArray[7];
		oh = myWon%wonArray[0]%wonArray[1]%wonArray[2]%wonArray[3]%wonArray[4]%wonArray[5]%wonArray[6]%wonArray[7]/wonArray[8];
		il = myWon%wonArray[0]%wonArray[1]%wonArray[2]%wonArray[3]%wonArray[4]%wonArray[5]%wonArray[6]%wonArray[7]%wonArray[8]/wonArray[9];
		
		System.out.println("50000원:"+om+"개");
		System.out.println("10000원:"+m+"개");
		System.out.println("5000원:"+oc+"개");
		System.out.println("1000원:"+c+"개");
		System.out.println("500원:"+ob+"개");
		System.out.println("100원:"+b+"개");
		System.out.println("50원:"+os+"개");
		System.out.println("10원:"+s+"개");
		System.out.println("5원:"+oh+"개");
		System.out.println("1원:"+il+"개");
		sc.close();
	}

}
