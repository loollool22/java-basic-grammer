package hello;

import java.util.Scanner;

public class Day9_quiz {

	public static void main(String[] args) {
		// Quiz. ������ MBTI �����
		
        Scanner sc = new Scanner(System.in);
        
		System.out.println("==== ������ MBTI ��� ���� ====");
		System.out.print("����� MBTI�� �Է��ϼ���: ");
		
		String mbti = sc.next();
		
		switch (mbti) {
		case "ENFJ", "enfj":                                      // ���� case ��(,) ��� (java 14���� ��� �߰�)
			System.out.print("����� ���е忣�����Դϴ�!");               // �̴� ������ case ��(:)�� fall through ����� ��ü�� �� �ִ�.
		    break;
		case "ENFP", "enfp":                                      // ȭ��ǥ ��(->) ����� ����ϸ�, break ���� ��ü�� �� �ִ�.
			System.out.print("����� AI���Դϴ�!");                    // ���� case "ENFP", "enfp" -> System.out.print("����� AI���Դϴ�!"); �� ���·� ǥ���� �����ϴ�.
		    break;                                                // �̶�, ������ case ��(:) �� ����� �� ���๮�� ���� ���̾ �߰�ȣ{}�� �ʿ����� ������
		case "ENTJ", "entj":                                      // ȭ��ǥ ��(->) ���ÿ��� ���� ���� �� �߰�ȣ{}�� ���� �־�� �Ѵ�.
			System.out.print("����� ��Ű�������Դϴ�!");
	        break;
		case "ENTP", "entp":
			System.out.print("����� iOS���Դϴ�!");
	        break;
		case "ESFJ", "esfj":
			System.out.print("����� �ȵ���̵����Դϴ�!");
	        break;		
		case "ESFP", "esfp":
			System.out.print("����� ���� ���������Դϴ�!");
	        break;
		case "ESTJ", "estj":
			System.out.print("����� QA���Դϴ�!");
	        break;
		case "ESTP", "estp":
			System.out.print("����� IoT �������Դϴ�!");
	        break;
		case "INFJ", "infj":
			System.out.print("����� Ǯ�������Դϴ�!");
	        break;
		case "INFP", "infp":
			System.out.print("����� ���ü�����Դϴ�!");
	        break;
		case "INTJ", "intj":
			System.out.print("����� �����ͺм������Դϴ�!");
	        break;
		case "INTP", "intp":
			System.out.print("����� �鿣�����Դϴ�!");
	        break;
		case "ISFJ", "isfj":
			System.out.print("����� �������������Դϴ�!");
	        break;
		case "ISFP", "isfp":
			System.out.print("����� ��Ʈ��ũ ���������Դϴ�!");
	        break;
		case "ISTJ", "istj":
			System.out.print("����� �ۺ������Դϴ�!");
	        break;
		case "ISTP", "istp":
			System.out.print("����� �Ӻ���� ���������Դϴ�!");
	        break;
		default:
			System.out.print("��Ȯ�� MBTI ������ �ƴϿ���Ф�");			
	    
		/* <if�� ��� ����>
          
          if (MBTI.equals("ENFJ")||MBTI.equals("enfj")) System.out.println("����� ����Ʈ���� ���������Դϴ�");
          else if (MBTI.equals("ENFP")||MBTI.equals("enfp")) System.out.println("����� AI ���������Դϴ�");
       
       
         * <�� �ٷ� ǥ���� switch�� ����>
         
           case "ENFJ" : case "enfj" : System.out.println("����� ����Ʈ���� ���������Դϴ�"); break;
           case "ENFP" : case "enfp" : System.out.println("����� AI ���������Դϴ�"); break; 
           
         * < fall throung ������� ǥ���� switch�� ����>
           
           case "INTP" :
           case "intp" :
			System.out.println("����� �鿣�����Դϴ�.");
			break;
			
        */
		}
	
		sc.close();
	}
}