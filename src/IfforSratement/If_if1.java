package IfforSratement;

import java.util.Scanner;

public class If_if1 {

	public static void main(String[] args) {
		System.out.print("점수를 입력해 주세요.: ");
		Scanner sc = new Scanner(System.in);
		int score= -1;
		char grade = ' ';
		char option = 'o';
		
		score = sc.nextInt();
		
		if(score==100) {System.out.println("만점");}
		else if (score>=90) {
			grade = 'A';
			if(score>=98) {option='+';}
			else if(score<94) {option='-';}
		}
		else if (score>=80) {
			grade = 'B';
			if(score>=88) {option='+';}
			else if(score<84) {option='-';}
		}
		else {grade = 'C';}
		System.out.printf("당신의 학점은 %c%c입니다.%n",grade,option);
	}

}
