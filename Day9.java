package hello;

import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
		// Day9. 조건문
		
		/* 제어문 : 특정 코드를 반복, 건너 뛰기, 특정 부분으로 다시 돌아올 때 사용.
		          프로그램의 흐름을 바꾸는 역할.
		          
		   <제어문의 종류>
		   1. 조건문 : 조건에 따라 다르게 실행되도록 만드는 제어방법.
		             조건문은 자유롭게 중첩할 수 있다.
		             
		     - if 문 : * 조건식이 참이면 문장 1이 실행, 거짓이면 문장 2가 실행됨.
		                ※ 주의) 괄호, 중괄호를 지켜서 써야 함
		              * 중괄호 안에는 여러 줄의 코드를 적는 것이 가능.
		              
		              * 조건이 여러 개 일 때, 'else if' 로 조건식을 여러 개 사용할 수 있다.
		                ※ 앞 순서의 조건식이 거짓일 때만 차 순서가 실행된다.
		               
		                ex) if ( 조건식 1 ) {
		                     A
		                    } else if ( 조건식 2 ){
		                	 B
		                    } else if ( 조건식 3 ){
		                  	 C
		                    } else {
		                   	 D
		                    }
		                  
		              * 'if' 조건문을 여러 번 적으면 'else if' 와 달리 모든 조건을 검사하여 참인 문장만 출력된다.
		     
		     - switch 문 : 하나의 변수를 기준으로 그 값에 따라 다르게 동작하도록 만듦.
		                  변수가 각각의 case 에 맞으면 해당 출력문을 출력하고, 
		                  모든 case 에 해당하지 않으면 default 가 실행된다.
		                  작성 시, break 와 default 를 적절히 사용해야한다.
		        
		        * break : break 문을 만나면 switch 문을 끝낸다.
		                  break 문이 없으면 다음 case 의 코드까지 실행된다.(참인 case 부터 break 전까지 모든 출력문이 출력됨)
		  */
		
		
		// if 문 - 조건이 여러 개 일 때,
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("조건이 여러 개인 if 문");
		System.out.print("a = ");
		
		int a = sc.nextInt();
		
		if ( a < 5 ) {
			System.out.println("a는 5보다 작다.");
		} else if ( a < 10 ) {
			System.out.println("a는 10보다 작다.");
		} else if ( a < 15 ) {
			System.out.println("a는 15보다 작다.");
		} else {
			System.out.println("a는 15보다 크다");
		}
		
		
		// if 조건문을 여러 번 적을 때 - 모든 조건 검사
		
		System.out.println("if 조건문을 여러 번 적을 때");
		
		if ( a < 5 ) {
			System.out.println("a는 5보다 작다.");
		}
		if ( a < 10 ) {
			System.out.println("a는 10보다 작다.");
		}
		if ( a < 15 ) {
			System.out.println("a는 15보다 작다.");
		}
		
		
		// if 문 중첩
		
		System.out.println("if 문 중첩 사용");
		
		if ( a < 5) {
			if ( a < 0) {
				System.out.println("a는 0보다 작다.");
			}	if ( a == 0 ) {
					System.out.println("a는 0이다.");
			} else {
				System.out.println("a는 0보다 크고 5보다 작다.");
			}
		}
		
		
		// if 문 & switch 문 비교 (두 조건문의 결과는 같다)
		
		System.out.println("if 문");
		
		if ( a == 1 ) {
			System.out.println("a는 1입니다");
		} else if ( a == 2 ) {
			System.out.println("a는 2입니다");
		} else if ( a == 3 ) {
			System.out.println("a는 3입니다");
		} else if ( a == 4 ) {
			System.out.println("a는 4입니다");
		} else {
			System.out.println("a는 1~4가 아닙니다");
		}
		
		
		System.out.println("switch 문");
		
		switch (a) {                                    // 기존의 break 문을 대체하는 방식을 사용함
		case 1  -> System.out.println("a는 1입니다");      // 화살표 라벨(->) 사용시, break 문을 대체할 수 있다.
		case 2  -> System.out.println("a는 2입니다");      // 단, 여러 줄 일때는 중괄호{}로 묶어 주어야 한다. 
		case 3  -> System.out.println("a는 3입니다");
		case 4  -> System.out.println("a는 4입니다");
		default -> System.out.println("a는 1~4가 아닙니다");
		}
		
		sc.close();
	}

}
