package hello;

import java.util.Scanner;

public class Day8_quiz {

	public static void main(String[] args) {
		// Quiz. 숫자 두 개를 받아 큰 수 출력하기
		/* 1-1 난이도 하
		   <조건>
           - 숫자 2개를 띄어쓰기로 구분하여 입력받습니다.
           - 두 숫자 중에 큰 숫자를 출력합니다.
           - 두 숫자가 같을 경우 해당 숫자를 그냥 출력합니다.
		 */
	Scanner sc = new Scanner(System.in);
	
	System.out.print("숫자 2개를 입력하세요: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	System.out.print("둘 중에 큰 수는 : ");
	System.out.println(a >= b ? a : b);                               // (a > b ? a : b); 로 써도 결과가 같다
	
	    /* 1-2 난이도 상
	       <조건>
           - 숫자 2개를 띄어쓰기로 구분하여 입력받습니다.
           - 두 숫자 중에 큰 숫자를 출력합니다.
           - 두 숫자가 같을 경우 숫자 대신 "같음" 이라는 문장을 출력합니다.
	     */
	
	System.out.print("숫자 2개를 입력하세요: ");
	int c = sc.nextInt();
	int d = sc.nextInt();
	
	System.out.print("둘 중에 큰 수는 : ");
	System.out.println(c == d ? "같음" : c > d && c != d ? c : d);     // c == d ? "같음" : c > d ? c : d); 로 쓰는 게 더 깔끔함
	
	sc.close();
	}

}
