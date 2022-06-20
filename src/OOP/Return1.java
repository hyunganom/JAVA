package OOP;

 class Return1 {


	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9)) {
			return;//dan의 값이 아닌경우 호출한 곳으로 그냥 되돌아 간다
		}
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		}
		return;//반환 타입이 void일때만 생략가능 컴파일러가 자동 추가.
		
		}
	int multiply(int x, int y) {
		int result = x*y;
		return result; //반환타입이 void가 아니므로 생략불가
   }
//	int max(int a, int b) {
//		if(a>b)
//			return a; // 에러 return문이 없음
					//저게 참일때는 리턴문이 있는데 거짓일때는? 리턴문이없음 else{return b;}에 조심해서 잘쓰기
//	}
public static void main(String[] args) {
    Return1 r1 = new Return1();
    r1.printGugudan(3);
}
}
	
//return문 : 실행중인 메서드를 종료하고 호출한 곳으로 되돌아 간다.
//반환타입이 보이드가 아니면 반드시 return문 필요.