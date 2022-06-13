package IfforSratement;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
//	조건문(if) : 조건을 만족할 때 만 {}안에서 실행
		//그니깐 참이다 거짓이다.
		System.out.print("숫자입력 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score>80) {
			System.out.println("합격");
		}
		
		
		
	}

}
