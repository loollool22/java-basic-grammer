package hello;

import java.util.Scanner;

public class Day8_quiz {

	public static void main(String[] args) {
		// Quiz. ���� �� ���� �޾� ū �� ����ϱ�
		/* 1-1 ���̵� ��
		   <����>
           - ���� 2���� ����� �����Ͽ� �Է¹޽��ϴ�.
           - �� ���� �߿� ū ���ڸ� ����մϴ�.
           - �� ���ڰ� ���� ��� �ش� ���ڸ� �׳� ����մϴ�.
		 */
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� 2���� �Է��ϼ���: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	System.out.print("�� �߿� ū ���� : ");
	System.out.println(a >= b ? a : b);                               // (a > b ? a : b); �� �ᵵ ����� ����
	
	    /* 1-2 ���̵� ��
	       <����>
           - ���� 2���� ����� �����Ͽ� �Է¹޽��ϴ�.
           - �� ���� �߿� ū ���ڸ� ����մϴ�.
           - �� ���ڰ� ���� ��� ���� ��� "����" �̶�� ������ ����մϴ�.
	     */
	
	System.out.print("���� 2���� �Է��ϼ���: ");
	int c = sc.nextInt();
	int d = sc.nextInt();
	
	System.out.print("�� �߿� ū ���� : ");
	System.out.println(c == d ? "����" : c > d && c != d ? c : d);     // c == d ? "����" : c > d ? c : d); �� ���� �� �� �����
	
	sc.close();
	}

}
