package hello;

import java.util.Scanner;

public class Day6_quiz {

	public static void main(String[] args) {
	Scanner introduce = new Scanner(System.in);
	
	System.out.println("======== �ڱ�Ұ� �Է��ϱ� ========");
	
	System.out.print("�̸��� �Է��ϼ���: ");
	String name = introduce.next();
	
	System.out.print("���̸� �Է��ϼ���: ");
	int age = introduce.nextInt();
	
	System.out.print("�������� �Է��ϼ���: ");
	char blood = introduce.next().charAt(0);                    // �ܾ��� ù ����(char �ڷ���)�� �Է� ������ ���� ���
	
	System.out.print("MBTI�� �Է��ϼ���: ");
	String MBTI = introduce.next();
	
	System.out.print("�¿���� �� ������ �Է��ϼ���: ");
	introduce.nextLine();
	String motto = introduce.nextLine();
	
	System.out.println("======== �ڱ�Ұ� �Է¿Ϸ� ========");
	
	introduce.nextLine();                                       // enterŰ�� �ν��ϴ� nextLine() �޼ҵ带 ����ϸ� enter�� ��� �������� �Ѿ��.
	System.out.print("������ �ݰ�����! -> �����Ϸ��� ���͸� ��������.");
	introduce.nextLine();
	
	System.out.printf("���� %s�Դϴ�. ���̴� %d���̿���.\n", name, age);
	System.out.printf("�������� %s, MBTI�� �� �˻縶�� �ٲ����� ģ������ %s��׿�?\n",blood, MBTI);
	System.out.printf("�˿���� '%s'�Դϴ�.\n ������ �����ϴ� �������� ���ڸ� ������ ������ �ٲ�� �乮 ���� �ϳ������.", motto);
	
	introduce.close();
	
	}

}
