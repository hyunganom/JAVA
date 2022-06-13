package Array;
import java.util.*;

public class Array1 {

	public static void main(String[] args) {
		//배열 : 같은 타입의 여러변수를 하나의 묶음으로 다루는 것
		//타입[] 변수이름 = new 타입[길이];
		
		
		int[] iArr1= new int[10];
		int[] iArr2= new int[10];
		int[] iArr3= new int[] {100, 95, 80, 70, 60};
		char[] chArr= new char[] {'a','b','c','d'};
		
		for(int i=0;i<iArr1.length;i++) {
			iArr1[i]=i+1;
		}
		for(int i=0;i<iArr2.length;i++) {
			iArr2[i]=(int)(Math.random()*10)+1;//1~10의 값을 배열에 저장
		}
		for(int i=0;i<iArr1.length;i++) {
			System.out.print(iArr1[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
	}

}
