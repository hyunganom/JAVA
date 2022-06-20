package OOP;

public class Method2 {

	public static void main(String[] args) {
		//mymath 객체생성
		MyMath mm = new MyMath();
		//mymath 객체사용
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		long result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = "+result1);
		System.out.println("subtract(5L, 3L) = "+result2);
		System.out.println("multiply(5L, 3L) = "+result3);
		System.out.println("divide(5L, 3L) = "+result4);
	}

}
//mymath 클래스 작성
//메서드는 클래스 영역에서만 정의 가능!!!!
class MyMath{
	long add(long a, long b) {
		long result = a+b;
		return result;
		//return a+b; // 위의 두줄을 이와같이 한 줄로 간단히 할 수 있다.
	}
	long subtract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	long divide(long a, long b) {return a/b;}
}