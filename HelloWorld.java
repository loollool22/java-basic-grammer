package hello;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Day 4. 변수와 자료형
		String name = "자바 기초문법 12월 과정";
		char c = 'C';
		
		System.out.println(name);
		System.out.println(c);
		
		long num1 = 1100110011;
		int num2 = 101101;
		short num3 = 1001;
		byte num4 = 11;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		float num5 = 2.7182818284590452353602874713527f;
		double num6 = 2.7182818284590452353602874713527;
		
		System.out.println(num5);
		System.out.println(num6);
		
		boolean A = true;
		boolean B = false;
		
		System.out.println(A);
		System.out.println(B);
		
		
		
		// Day 5. System.out - 출력(print)
		
		/* 메소드 : c언어, python에서의 함수와 비슷한 개념. 클래스 안의 함수를 부르는 명칭.
		 * 지시자 : c언어, python의 형식지정자. 어떠한 값을 출력할 것인지 지정하는 역할.
		   <대표적인 지시자 종류>
		    %d : decimal, 정수 형식
		    %f : floating-point, 실수 형식
		    %c : character, 문자 형식
		    %s : string, 문자열 형식
		    %b : boolean, 논리형식
		    
		 * 표준 입출력 클래스 System
		 * <out 변수 내 출력 관련 메소드>
		    print : 줄바꿈 없이 연결되어 출력(끝에 '\n'을 붙이면 줄바꿈됨.)
		    println : 자동 줄바꿈 
		    printf : print + 포맷팅, 값을 변환하여 출력. c언어의 printf와 같음.
		             지시자를 이용해 값을 원하는 형태로 변환 후 출력.
		             한 메소드 안에 여러개의 지시자 사용 가능.(쉼표','로 구분)
		             단, 지시자의 개수와 쉼표 뒤의 값 개수가 같아야 한다.
		*/
		
		String invite = "----------------------------------------------------------";
		int year = 2021, month = 12, day = 25;
		String location = "작고 소중한 우리집";
		String hint = "Santa tell us when he comes house of other people.";
		boolean answer1 = true;
		boolean answer2 = false;
		
		System.out.println(invite);
		System.out.println(invite);
		System.out.println("                         <초대장>                       ");
		System.out.println("- 날짜 : " + year +"년 " + month +"월 " + day +"일 ");           // System.out.printf("- 날짜 : %d년 %월 %d일\n", year, month, day); 로 작성하는 게 더 좋을 듯
		System.out.println("- 장소 : " + location);
		System.out.println("- 힌트 : "+ hint);
		System.out.printf("- !주의사항! %b answer은 바로 입장, %b answer은 와인 사와서 입장\n", answer1, answer2);
		
		String answer3 = "Merry";
		String answer4 = "Christmas";
		String answer5 = "!";
		String answer6 = "메리 ";
		String answer7 = "크리스마스";
		
		System.out.println("\r\n"
				+ "     *  *     *            ★    *     *      *        *  \r\n"
				+ "            *        *    ^ ^       *                    \r\n"
				+ "  *      *      *      * ^   ^          *   *       *    \r\n"
				+ "     *                  ^     ^   *   *         *      *\r\n"
				+ "             *    *    ^^^^^^^^^                      *   \r\n"
				+ ",,,,*,,,,,,*,,,*,,,,,*,,,,|_|,,,,,*,,,,,*,,,,,*,,,,**,,,,,\r\n"
				);
		System.out.println(invite);
		System.out.printf("정답 : %s\n      %s\n", answer3 + answer4 + answer5, answer6 + answer7 + answer5);
		System.out.println(invite);
		System.out.print(invite);
		
		// day5. Quiz
		String bar = "\n------------------------------";
		String quiz = "덧셈, 뺄셈, 곱셈의 결과를 볼까요?\n";
		int a = 10;
		int b = 30;
		
		System.out.println(bar);                                                // System.out.print("------------")로 쓰는 게 더 깔끔할 듯
		System.out.print(quiz);
		System.out.printf("a+b는 %d, a-b는 %d, a*b는 %d", a+b, a-b, a*b);
		System.out.println(bar);
		}
}




      