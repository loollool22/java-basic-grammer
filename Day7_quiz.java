package hello;

import java.util.Scanner;

public class Day7_quiz {
    
	public static void main(String[] args) {
	// Quiz 1. 산술연산자 활용하기
    Scanner sc = new Scanner(System.in);
	
	System.out.print("첫번째 숫자를 입력하세요: ");
	int num1 = sc.nextInt();
	System.out.print("두번쨰 숫자를 입력하세요: ");
	int num2 = sc.nextInt();
	
	System.out.print("===사칙연산 출력하기===\n");
	int x = num1;
	int y = num2;
	System.out.printf("%d + %d = %d\n", x, y, x+y);
	System.out.printf("%d - %d = %d\n", x, y, x-y);
	System.out.printf("%d * %d = %d\n", x, y, x*y);
	System.out.printf("%d / %d = %d\n", x, y, x/y);
	System.out.printf("%d %% %d = %d\n", x, y, x%y);
	
	sc.close();

	
	// Quiz 2. 증감연산자 뿌시기
	int a = 3;
	int b = 5;
	
	System.out.printf("%d %d %d", ++a + b--, a, ++b);
	 /* [sol] 선 연산 되어 나온 두번째 a(a+1) = 4 이므로, 처음 a = 3 이다.
	          첫번째 b는 후 연산이므로 처음 b 값과 같다.
	          ++a + b-- = 9 는
	          4 + b = 9 와 값이 같다.
	          따라서 a = 3, b = 5 이다.
	  */
	}

}
