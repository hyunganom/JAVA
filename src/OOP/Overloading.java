package OOP;

public class Overloading {
	public static void main(String[] args) {
		Overloading op = new Overloading();
		System.out.println("op.add(3, 3) 결과:"+op.add(3,3));
		System.out.println("op.add(3L, 3) 결과:"+op.add(3L,3));
		System.out.println("op.add(3, 3L) 결과:"+op.add(3,3L));
		System.out.println("op.add(3L, 3L) 결과:"+op.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("op.add(a) 결과:"+op.add(a));
	}
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result=0;
		for(int i=0; i < a.length;i++) {
			result += a[i];
		}
		return result;
	}
	
}
//오버로딩 : 과적하다
//메서드 : 메서드이름 = 1:1
// 한클래스 안에 같은 이름의 메서드 여러 개 정의 하는 것

//오버로딩이 성립하기 위한 조건
//1.메서드 이름이 같아야 한다.
//2.매개변수의 개수 또는 타입이 달라야 한다.
//3.반환 타입은 영향없다.