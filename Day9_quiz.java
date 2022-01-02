package hello;

import java.util.Scanner;

public class Day9_quiz {

	public static void main(String[] args) {
		// Quiz. 개발자 MBTI 만들기
		
        Scanner sc = new Scanner(System.in);
        
		System.out.println("==== 개발자 MBTI 결과 보기 ====");
		System.out.print("당신의 MBTI를 입력하세요: ");
		
		String mbti = sc.next();
		
		switch (mbti) {
		case "ENFJ", "enfj":                                      // 다중 case 라벨(,) 기능 (java 14부터 기능 추가)
			System.out.print("당신은 프론드엔드형입니다!");               // 이는 기존의 case 라벨(:)의 fall through 방식을 대체할 수 있다.
		    break;
		case "ENFP", "enfp":                                      // 화살표 라벨(->) 기능을 사용하면, break 문을 대체할 수 있다.
			System.out.print("당신은 AI형입니다!");                    // 따라서 case "ENFP", "enfp" -> System.out.print("당신은 AI형입니다!"); 의 형태로 표현이 가능하다.
		    break;                                                // 이때, 기존의 case 라벨(:) 을 사용할 땐 실행문이 여러 줄이어도 중괄호{}가 필요하지 않지만
		case "ENTJ", "entj":                                      // 화살표 라벨(->) 사용시에는 여러 줄일 때 중괄호{}로 묶어 주어야 한다.
			System.out.print("당신은 아키텍쳐형입니다!");
	        break;
		case "ENTP", "entp":
			System.out.print("당신은 iOS형입니다!");
	        break;
		case "ESFJ", "esfj":
			System.out.print("당신은 안드로이드형입니다!");
	        break;		
		case "ESFP", "esfp":
			System.out.print("당신은 게임 개발자형입니다!");
	        break;
		case "ESTJ", "estj":
			System.out.print("당신은 QA형입니다!");
	        break;
		case "ESTP", "estp":
			System.out.print("당신은 IoT 개발형입니다!");
	        break;
		case "INFJ", "infj":
			System.out.print("당신은 풀스택형입니다!");
	        break;
		case "INFP", "infp":
			System.out.print("당신은 블록체인형입니다!");
	        break;
		case "INTJ", "intj":
			System.out.print("당신은 데이터분석가형입니다!");
	        break;
		case "INTP", "intp":
			System.out.print("당신은 백엔드형입니다!");
	        break;
		case "ISFJ", "isfj":
			System.out.print("당신은 보안전문가형입니다!");
	        break;
		case "ISFP", "isfp":
			System.out.print("당신은 네트워크 개발자형입니다!");
	        break;
		case "ISTJ", "istj":
			System.out.print("당신은 퍼블리셔헝입니다!");
	        break;
		case "ISTP", "istp":
			System.out.print("당신은 임베디드 개발자형입니다!");
	        break;
		default:
			System.out.print("정확한 MBTI 유형이 아니에요ㅠㅠ");			
	    
		/* <if문 사용 예시>
          
          if (MBTI.equals("ENFJ")||MBTI.equals("enfj")) System.out.println("당신은 프론트엔드 개발자형입니다");
          else if (MBTI.equals("ENFP")||MBTI.equals("enfp")) System.out.println("당신은 AI 개발자형입니다");
       
       
         * <한 줄로 표현한 switch문 예시>
         
           case "ENFJ" : case "enfj" : System.out.println("당신은 프론트엔드 개발자형입니다"); break;
           case "ENFP" : case "enfp" : System.out.println("당신은 AI 개발자형입니다"); break; 
           
         * < fall throung 방식으로 표현한 switch문 예시>
           
           case "INTP" :
           case "intp" :
			System.out.println("당신은 백엔드형입니다.");
			break;
			
        */
		}
	
		sc.close();
	}
}