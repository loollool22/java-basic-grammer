package hello;

public class Day8 {

	public static void main(String[] args) {
		// Day8. 연산자(2)
		
		/* 비교(관계)연산자 : 2개의 피연산자를 비교.
		                 주로 조건문, 반복문에서 사용하고 참(true) or 거짓(false)을 반환함.
		 
		 * 논리 연산자 : 참 or 거짓을 판별하는 연산자.
		             관계 연산자와 달리 둘 이상의 조건을 'AND' 혹은 'OR' 로 판별함.
		    - && = AND (둘 다 참일 경우 참, 하나라도 거짓일 경우 거짓)
		    - || = OR  (둘 중 하나라도 참일 경우 참, 둘 다 거짓일 경우 거짓)        
		    - ! = NOT 
		    
		    ※ 주의) '!' 연산자는 피연산자 앞에 붙인다.
		
		 * 대입 연산자('=') : 연산 결과를 대입(=저장)하는 연산자.
		 * 복합 대입연산자 : 산술 연산자와 대입연산자를 붙여 적으면 줄임말처럼 코드들 줄일 수 있다.
		 
		 * 삼항 연산자 : 피연산자가 3가지인 연산자.
		             조건식과 2가지 결과값이 필요함.
		             조건식에 따라 조건이 참일 경우 식1이 실행, 거짓일 경우 식2가 실행됨.
		             
		 * 연산자의 우선순위
		  '단항 > 이항(산술, 비교, 논리) > 삼항 > 대입' 순으로 실행
		  '괄호()' 를 사용하여 우선순위로 둘 수 있다.
		*/
		
		
		// 비교(관계)연산자
		int a = 5;
		int b = 7;
		
		System.out.printf("%d > %d 는 %b\n", a, b, a>b);     // a가 b보다 크다
		System.out.printf("%d >= %d 는 %b\n", a, b, a>=b);   // a가 b보다 크거나 같다
		System.out.printf("%d < %d 는 %b\n", a, b, a<b);     // a가 b보다 작다
		System.out.printf("%d <= %d 는 %b\n", a, b, a<=b);   // a가 b보다 작거나 같다
		System.out.printf("%d == %d 는 %b\n", a, b, a==b);   // a와 b는 같다
		System.out.printf("%d != %d 는 %b\n", a, b, a!=b);   // a와 b는 다르다
		
		
		// 논리 연산자
		int c = 10;
		
		System.out.printf("%d > %d && %d < %d 는 %b\n", a, b, b, c, a>b && b<c);   // a > b AND b < c 는 거짓이다 (a > b 가 거짓이므로 / 둘 중 하나라도 거짓이면 거짓)
		System.out.printf("%d > %d || %d < %d 는 %b\n", a, b, b, c, a>b || b<c);   // a > b OR b < c 는 참이다 ( b < c 가 참이므로 / 둘 중 하나가 참이면 참)
		System.out.printf("!(%d == %d) 는 %b\n", a, b, !(a==b));                   // !(a == b) 는 참이다 ( !('a와 b는 같다') 는 곧, 'a와 b는 다르다' 이므로 참)
		System.out.printf("!(%d != %d) 는 %b\n", a, b, !(a!=b));                   // !(a != b) 는 거짓이다 ( !('a와 b는 같지않다')는 곧, 'a와 b는 같다 이므로 거짓)
		
		
		// 복합대입연산자
		a += 1;      // 'a = a + 1' 과 같다
		b *= 10;     // 'b = b * 10' 과 같다
		c /= 3;      // 'c = c / 3' 과 같다
		
		System.out.printf("%d %d %d\n", a, b, c);
		
		
		// 삼항 연산자
		int d = 20;
		int e = 30;
		
		System.out.println(d > e ? "참입니다." : "거짓입니다.");     // 조건이 참이므로 식1인 "참입니다."가 출력
		System.out.println(d < e ? "참입니다." : "거짓입니다.");     // 조건이 거짓이므로 식2인 "거짓입니다"가 출력
	}

}
