package hello;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Day 4. ������ �ڷ���
		String name = "�ڹ� ���ʹ��� 12�� ����";
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
		
		
		
		// Day 5. System.out - ���(print)
		
		/* �޼ҵ� : c���, python������ �Լ��� ����� ����. Ŭ���� ���� �Լ��� �θ��� ��Ī.
		 * ������ : c���, python�� ����������. ��� ���� ����� ������ �����ϴ� ����.
		   <��ǥ���� ������ ����>
		    %d : decimal, ���� ����
		    %f : floating-point, �Ǽ� ����
		    %c : character, ���� ����
		    %s : string, ���ڿ� ����
		    %b : boolean, ������
		    
		 * ǥ�� ����� Ŭ���� System
		 * <out ���� �� ��� ���� �޼ҵ�>
		    print : �ٹٲ� ���� ����Ǿ� ���(���� '\n'�� ���̸� �ٹٲ޵�.)
		    println : �ڵ� �ٹٲ� 
		    printf : print + ������, ���� ��ȯ�Ͽ� ���. c����� printf�� ����.
		             �����ڸ� �̿��� ���� ���ϴ� ���·� ��ȯ �� ���.
		             �� �޼ҵ� �ȿ� �������� ������ ��� ����.(��ǥ','�� ����)
		             ��, �������� ������ ��ǥ ���� �� ������ ���ƾ� �Ѵ�.
		*/
		
		String invite = "----------------------------------------------------------";
		int year = 2021, month = 12, day = 25;
		String location = "�۰� ������ �츮��";
		String hint = "Santa tell us when he comes house of other people.";
		boolean answer1 = true;
		boolean answer2 = false;
		
		System.out.println(invite);
		System.out.println(invite);
		System.out.println("                         <�ʴ���>                       ");
		System.out.println("- ��¥ : " + year +"�� " + month +"�� " + day +"�� ");           // System.out.printf("- ��¥ : %d�� %�� %d��\n", year, month, day); �� �ۼ��ϴ� �� �� ���� ��
		System.out.println("- ��� : " + location);
		System.out.println("- ��Ʈ : "+ hint);
		System.out.printf("- !���ǻ���! %b answer�� �ٷ� ����, %b answer�� ���� ��ͼ� ����\n", answer1, answer2);
		
		String answer3 = "Merry";
		String answer4 = "Christmas";
		String answer5 = "!";
		String answer6 = "�޸� ";
		String answer7 = "ũ��������";
		
		System.out.println("\r\n"
				+ "     *  *     *            ��    *     *      *        *  \r\n"
				+ "            *        *    ^ ^       *                    \r\n"
				+ "  *      *      *      * ^   ^          *   *       *    \r\n"
				+ "     *                  ^     ^   *   *         *      *\r\n"
				+ "             *    *    ^^^^^^^^^                      *   \r\n"
				+ ",,,,*,,,,,,*,,,*,,,,,*,,,,|_|,,,,,*,,,,,*,,,,,*,,,,**,,,,,\r\n"
				);
		System.out.println(invite);
		System.out.printf("���� : %s\n      %s\n", answer3 + answer4 + answer5, answer6 + answer7 + answer5);
		System.out.println(invite);
		System.out.print(invite);
		
		// day5. Quiz
		String bar = "\n------------------------------";
		String quiz = "����, ����, ������ ����� �����?\n";
		int a = 10;
		int b = 30;
		
		System.out.println(bar);                                                // System.out.print("------------")�� ���� �� �� ����� ��
		System.out.print(quiz);
		System.out.printf("a+b�� %d, a-b�� %d, a*b�� %d", a+b, a-b, a*b);
		System.out.println(bar);
		}
}




      