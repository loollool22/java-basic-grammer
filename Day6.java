package hello;

import java.util.Scanner;                                        // 클래스 최상단에 패키지를 불러옴.

public class Day6 {

	public static void main(String[] args) {
	//Day 6. Scanner
         /* 스캐너(Scanner) : java 에서 사용자에게 값을 입력받을 때 주로 사용.
				            java.util 이라는 패키지에 포함되어 있는 클래스.
	     */
	
	
	/* <알고리즘>
	  1. 스캐너 객체를 만든다.
	  2. "단어를 입력하세요:"를 줄바꿈 없이 출력한다.
	  3. 단어를 입력 받아 String 자료형 변수에 저장한다.
	  4. "정수를 입력하세요:"를 줄바꿈 없이 출력한다.
	  5. 정수를 입력 받아 int 자료형 변수에 저장한다.
	  6. "실수를 입력하세요:"를 줄바꿈 없이 출력한다.
	  7. 실수를 입력 받아 float(or double) 자료형 변수에 저장한다.
	  8. "문장을 입력하세요:"를 줄바꿈 없이 출력한다.
	  9. 문장을 입력받아 String 자료형 변수에 저장한다.
	  10. "입력한 것을을 모아볼까요?" 문장을 줄바꿈 있게 출력하고, '단어, 정수, 실수, 문장'을 변수를 이용해 출력한다.
	*/
	Scanner scA = new Scanner(System.in);
	
	System.out.print("단어를 입력하세요:");
	String word =  scA.next();
	
	
	System.out.print("정수를 입력하세요:");
	int num = scA.nextInt();
	
	System.out.print("실수를 입력하세요:");
	double d = scA.nextDouble();
	
	System.out.print("문장을 출력하세요:");
	scA.nextLine();                                              // enter 인식 오류 방지
	String sentence = scA.nextLine();
	
	System.out.println("입력한 것들을 모아볼까요?");
	System.out.printf("단어 :  %s / 정수 : %d / 실수 : %f / 문장 : '%s'", word, num, d, sentence);
	
	scA.close();     // ! 스캐너를 만든 후 마지막에 닫아주어야한다.
	
	}

}
