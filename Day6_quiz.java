package hello;

import java.util.Scanner;

public class Day6_quiz {

	public static void main(String[] args) {
	Scanner introduce = new Scanner(System.in);
	
	System.out.println("======== 자기소개 입력하기 ========");
	
	System.out.print("이름을 입력하세요: ");
	String name = introduce.next();
	
	System.out.print("나이를 입력하세요: ");
	int age = introduce.nextInt();
	
	System.out.print("혈액형을 입력하세요: ");
	char blood = introduce.next().charAt(0);                    // 단어의 첫 글자(char 자료형)만 입력 받을때 쓰는 방법
	
	System.out.print("MBTI를 입력하세요: ");
	String MBTI = introduce.next();
	
	System.out.print("좌우명을 한 문장을 입력하세요: ");
	introduce.nextLine();
	String motto = introduce.nextLine();
	
	System.out.println("======== 자기소개 입력완료 ========");
	
	introduce.nextLine();                                       // enter키를 인식하는 nextLine() 메소드를 사용하면 enter를 써야 다음으로 넘어간다.
	System.out.print("만나서 반가워요! -> 시작하려면 엔터를 누르세요.");
	introduce.nextLine();
	
	System.out.printf("저는 %s입니다. 나이는 %d살이에요.\n", name, age);
	System.out.printf("혈액형은 %s, MBTI는 매 검사마다 바뀌지만 친구들이 %s라네요?\n",blood, MBTI);
	System.out.printf("죄우명은 '%s'입니다.\n 예전에 좋아하던 라디오에서 문자를 보내면 날마다 바뀌는 답문 중의 하나였어요.", motto);
	
	introduce.close();
	
	}

}
