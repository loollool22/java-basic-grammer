package hello;

import java.util.Scanner;

public class Day7_quiz {
    
	public static void main(String[] args) {
	// Quiz 1. ��������� Ȱ���ϱ�
    Scanner sc = new Scanner(System.in);
	
	System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
	int num1 = sc.nextInt();
	System.out.print("�ι��� ���ڸ� �Է��ϼ���: ");
	int num2 = sc.nextInt();
	
	System.out.print("===��Ģ���� ����ϱ�===\n");
	int x = num1;
	int y = num2;
	System.out.printf("%d + %d = %d\n", x, y, x+y);
	System.out.printf("%d - %d = %d\n", x, y, x-y);
	System.out.printf("%d * %d = %d\n", x, y, x*y);
	System.out.printf("%d / %d = %d\n", x, y, x/y);
	System.out.printf("%d %% %d = %d\n", x, y, x%y);
	
	sc.close();

	
	// Quiz 2. ���������� �ѽñ�
	int a = 3;
	int b = 5;
	
	System.out.printf("%d %d %d", ++a + b--, a, ++b);
	 /* [sol] �� ���� �Ǿ� ���� �ι�° a(a+1) = 4 �̹Ƿ�, ó�� a = 3 �̴�.
	          ù��° b�� �� �����̹Ƿ� ó�� b ���� ����.
	          ++a + b-- = 9 ��
	          4 + b = 9 �� ���� ����.
	          ���� a = 3, b = 5 �̴�.
	  */
	}

}
