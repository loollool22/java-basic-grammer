package hello;

import java.util.Scanner;                                        // Ŭ���� �ֻ�ܿ� ��Ű���� �ҷ���.

public class Day6 {

	public static void main(String[] args) {
	//Day 6. Scanner
         /* ��ĳ��(Scanner) : java ���� ����ڿ��� ���� �Է¹��� �� �ַ� ���.
				            java.util �̶�� ��Ű���� ���ԵǾ� �ִ� Ŭ����.
	     */
	
	
	/* <�˰���>
	  1. ��ĳ�� ��ü�� �����.
	  2. "�ܾ �Է��ϼ���:"�� �ٹٲ� ���� ����Ѵ�.
	  3. �ܾ �Է� �޾� String �ڷ��� ������ �����Ѵ�.
	  4. "������ �Է��ϼ���:"�� �ٹٲ� ���� ����Ѵ�.
	  5. ������ �Է� �޾� int �ڷ��� ������ �����Ѵ�.
	  6. "�Ǽ��� �Է��ϼ���:"�� �ٹٲ� ���� ����Ѵ�.
	  7. �Ǽ��� �Է� �޾� float(or double) �ڷ��� ������ �����Ѵ�.
	  8. "������ �Է��ϼ���:"�� �ٹٲ� ���� ����Ѵ�.
	  9. ������ �Է¹޾� String �ڷ��� ������ �����Ѵ�.
	  10. "�Է��� ������ ��ƺ����?" ������ �ٹٲ� �ְ� ����ϰ�, '�ܾ�, ����, �Ǽ�, ����'�� ������ �̿��� ����Ѵ�.
	*/
	Scanner scA = new Scanner(System.in);
	
	System.out.print("�ܾ �Է��ϼ���:");
	String word =  scA.next();
	
	
	System.out.print("������ �Է��ϼ���:");
	int num = scA.nextInt();
	
	System.out.print("�Ǽ��� �Է��ϼ���:");
	double d = scA.nextDouble();
	
	System.out.print("������ ����ϼ���:");
	scA.nextLine();                                              // enter �ν� ���� ����
	String sentence = scA.nextLine();
	
	System.out.println("�Է��� �͵��� ��ƺ����?");
	System.out.printf("�ܾ� :  %s / ���� : %d / �Ǽ� : %f / ���� : '%s'", word, num, d, sentence);
	
	scA.close();     // ! ��ĳ�ʸ� ���� �� �������� �ݾ��־���Ѵ�.
	
	}

}
