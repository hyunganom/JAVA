package IfforSratement;

import java.util.*;

public class If_else1 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요>5: ");
		Scanner sc = new Scanner(System.in);
		int num=0;
		num = sc.nextInt();
		if(num>5) {
			System.out.println(num);
		}
		else {
			System.out.println("입력하신 숫자는 5이하입니다.");
		}
	}

}
