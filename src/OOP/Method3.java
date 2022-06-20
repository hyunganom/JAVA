package OOP;

public class Method3 {
    public static void main(String[] args) {
        Max max1 = new Max();
        max1.max(3,5);
    }
}
// 두 값을 받아서 둘중에 큰값을 반환하는 메서드를 작성하시오.
class Max{
	long max(long a, long b) {
		long result=0;
		if(a>b) {
			result =a;
		}
		else{

		}
		return result;
	}

}