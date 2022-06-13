package IfforSratement;

public class For1 {

	public static void main(String[] args) {
		//for문은 반복횟수를 알고있을 때 정확하다.
		//for문은 초기화 조건식 증감식 블럭으로 이루어져있고, 조건식이 참일때는 {}내에 문장들을 모두 반복하다 거짓이 되면 반복문을 벗어난다.
		//초기화 : 반복문에 사용될 변수를 초기화하는 부분이며 처음에 한번만 수행된다.
		//i++:1씩증가 / i--:1씩감소 /  i+=2:2씩증가 /  i*=3:3배씩증가
		
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			sum += i; // sum = sum+i
			System.out.printf("1 부터 %2d 까지의 합 : %2d%n",i,sum);
		}
		
		
	}

}
