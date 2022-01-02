package hello;

public class Day7 {

	public static void main(String[] args) {
		// Day7. 연산자(1)
		
		/* 연산자 : 연산에 사용되는 기호.
		   피연산자 : 연산자에 의해 연산을 당하는 대상
		   
		   <연산자의 종류>
		   * 단항 연산자 : 피연산자가 하나인 연산자.
		      - 부호 연산자 : +(부호 유지) , -(부호 변경)
		   * 증감 연산자 : ++(증가) , --(감소)
		                변수 앞 or 뒤에 붙일 수 있음.
		                앞에 붙이면 연산을 먼저, 뒤에 붙이면 연산을 나중에 함.
		   * 산술 연산자 : 사칙연산(+ , - , * , /)
		                나머지 연산자(%) // 나누기를 하고 남는 나머지를 변환하는 연산자.
		*/
		
		// 부호 연산자
		int x = 10;
		System.out.println(-x);    // -10 출력
		System.out.println(+x);    //  10 출력
		
		int y = -10;
		System.out.println(-y);    //  10 출력
		System.out.println(+y);    // -10 출력
		
		// 증감 연산자
		x++;                       // x 값을 1 증가시킨다. (10 + 1)
		System.out.println(x);     // 11 출력
		
		++x;                       // x 값을 1 증가시킨다. (11 + 1)
		System.out.println(x);     // 12 출력
		
		x--;                       // x 값을 1 감소시킨다. (12 - 1)
		System.out.println(x);     // 11 출력
		
		--x;                       // x 값을 1 감소시킨다. (11 - 1)
		System.out.println(x);     // 10 출력
		
		System.out.println(++x);   // x(10)에 1을 더하고 나서 x(11)를 출력한다.
		System.out.println(x);     // x(11)를 출력한다.
		System.out.println(x++);   // x(11)를 출력하고, x(11)에 1을 더한다.
		System.out.println(x);     // x(12)를 출력한다.
		
		// 산술 연산자
		int w = 10;
		int z = 5;
		System.out.printf("%d + %d = %d\n", w, z, w+z);     // 10 + 5 = 15
		System.out.printf("%d - %d = %d\n", w, z, w-z);     // 10 - 5 = 10
		System.out.printf("%d * %d = %d\n", w, z, w*z);     // 10 * 5 = 50
		System.out.printf("%d / %d = %d\n", w, z, w/z);     // 10 / 5 = 2
		System.out.printf("%d %% %d = %d\n", w, z, w%z);    // 10 % 5 = 0
		// % 기호 출력 시에는 %% 라고 작성해야한다.
}

}
