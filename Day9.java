package hello;

import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
		// Day9. ���ǹ�
		
		/* ��� : Ư�� �ڵ带 �ݺ�, �ǳ� �ٱ�, Ư�� �κ����� �ٽ� ���ƿ� �� ���.
		          ���α׷��� �帧�� �ٲٴ� ����.
		          
		   <����� ����>
		   1. ���ǹ� : ���ǿ� ���� �ٸ��� ����ǵ��� ����� ������.
		             ���ǹ��� �����Ӱ� ��ø�� �� �ִ�.
		             
		     - if �� : * ���ǽ��� ���̸� ���� 1�� ����, �����̸� ���� 2�� �����.
		                �� ����) ��ȣ, �߰�ȣ�� ���Ѽ� ��� ��
		              * �߰�ȣ �ȿ��� ���� ���� �ڵ带 ���� ���� ����.
		              
		              * ������ ���� �� �� ��, 'else if' �� ���ǽ��� ���� �� ����� �� �ִ�.
		                �� �� ������ ���ǽ��� ������ ���� �� ������ ����ȴ�.
		               
		                ex) if ( ���ǽ� 1 ) {
		                     A
		                    } else if ( ���ǽ� 2 ){
		                	 B
		                    } else if ( ���ǽ� 3 ){
		                  	 C
		                    } else {
		                   	 D
		                    }
		                  
		              * 'if' ���ǹ��� ���� �� ������ 'else if' �� �޸� ��� ������ �˻��Ͽ� ���� ���常 ��µȴ�.
		     
		     - switch �� : �ϳ��� ������ �������� �� ���� ���� �ٸ��� �����ϵ��� ����.
		                  ������ ������ case �� ������ �ش� ��¹��� ����ϰ�, 
		                  ��� case �� �ش����� ������ default �� ����ȴ�.
		                  �ۼ� ��, break �� default �� ������ ����ؾ��Ѵ�.
		        
		        * break : break ���� ������ switch ���� ������.
		                  break ���� ������ ���� case �� �ڵ���� ����ȴ�.(���� case ���� break ������ ��� ��¹��� ��µ�)
		  */
		
		
		// if �� - ������ ���� �� �� ��,
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���� ���� if ��");
		System.out.print("a = ");
		
		int a = sc.nextInt();
		
		if ( a < 5 ) {
			System.out.println("a�� 5���� �۴�.");
		} else if ( a < 10 ) {
			System.out.println("a�� 10���� �۴�.");
		} else if ( a < 15 ) {
			System.out.println("a�� 15���� �۴�.");
		} else {
			System.out.println("a�� 15���� ũ��");
		}
		
		
		// if ���ǹ��� ���� �� ���� �� - ��� ���� �˻�
		
		System.out.println("if ���ǹ��� ���� �� ���� ��");
		
		if ( a < 5 ) {
			System.out.println("a�� 5���� �۴�.");
		}
		if ( a < 10 ) {
			System.out.println("a�� 10���� �۴�.");
		}
		if ( a < 15 ) {
			System.out.println("a�� 15���� �۴�.");
		}
		
		
		// if �� ��ø
		
		System.out.println("if �� ��ø ���");
		
		if ( a < 5) {
			if ( a < 0) {
				System.out.println("a�� 0���� �۴�.");
			}	if ( a == 0 ) {
					System.out.println("a�� 0�̴�.");
			} else {
				System.out.println("a�� 0���� ũ�� 5���� �۴�.");
			}
		}
		
		
		// if �� & switch �� �� (�� ���ǹ��� ����� ����)
		
		System.out.println("if ��");
		
		if ( a == 1 ) {
			System.out.println("a�� 1�Դϴ�");
		} else if ( a == 2 ) {
			System.out.println("a�� 2�Դϴ�");
		} else if ( a == 3 ) {
			System.out.println("a�� 3�Դϴ�");
		} else if ( a == 4 ) {
			System.out.println("a�� 4�Դϴ�");
		} else {
			System.out.println("a�� 1~4�� �ƴմϴ�");
		}
		
		
		System.out.println("switch ��");
		
		switch (a) {                                    // ������ break ���� ��ü�ϴ� ����� �����
		case 1  -> System.out.println("a�� 1�Դϴ�");      // ȭ��ǥ ��(->) ����, break ���� ��ü�� �� �ִ�.
		case 2  -> System.out.println("a�� 2�Դϴ�");      // ��, ���� �� �϶��� �߰�ȣ{}�� ���� �־�� �Ѵ�. 
		case 3  -> System.out.println("a�� 3�Դϴ�");
		case 4  -> System.out.println("a�� 4�Դϴ�");
		default -> System.out.println("a�� 1~4�� �ƴմϴ�");
		}
		
		sc.close();
	}

}
