package hello;

public class Day7 {

	public static void main(String[] args) {
		// Day7. ������(1)
		
		/* ������ : ���꿡 ���Ǵ� ��ȣ.
		   �ǿ����� : �����ڿ� ���� ������ ���ϴ� ���
		   
		   <�������� ����>
		   * ���� ������ : �ǿ����ڰ� �ϳ��� ������.
		      - ��ȣ ������ : +(��ȣ ����) , -(��ȣ ����)
		   * ���� ������ : ++(����) , --(����)
		                ���� �� or �ڿ� ���� �� ����.
		                �տ� ���̸� ������ ����, �ڿ� ���̸� ������ ���߿� ��.
		   * ��� ������ : ��Ģ����(+ , - , * , /)
		                ������ ������(%) // �����⸦ �ϰ� ���� �������� ��ȯ�ϴ� ������.
		*/
		
		// ��ȣ ������
		int x = 10;
		System.out.println(-x);    // -10 ���
		System.out.println(+x);    //  10 ���
		
		int y = -10;
		System.out.println(-y);    //  10 ���
		System.out.println(+y);    // -10 ���
		
		// ���� ������
		x++;                       // x ���� 1 ������Ų��. (10 + 1)
		System.out.println(x);     // 11 ���
		
		++x;                       // x ���� 1 ������Ų��. (11 + 1)
		System.out.println(x);     // 12 ���
		
		x--;                       // x ���� 1 ���ҽ�Ų��. (12 - 1)
		System.out.println(x);     // 11 ���
		
		--x;                       // x ���� 1 ���ҽ�Ų��. (11 - 1)
		System.out.println(x);     // 10 ���
		
		System.out.println(++x);   // x(10)�� 1�� ���ϰ� ���� x(11)�� ����Ѵ�.
		System.out.println(x);     // x(11)�� ����Ѵ�.
		System.out.println(x++);   // x(11)�� ����ϰ�, x(11)�� 1�� ���Ѵ�.
		System.out.println(x);     // x(12)�� ����Ѵ�.
		
		// ��� ������
		int w = 10;
		int z = 5;
		System.out.printf("%d + %d = %d\n", w, z, w+z);     // 10 + 5 = 15
		System.out.printf("%d - %d = %d\n", w, z, w-z);     // 10 - 5 = 10
		System.out.printf("%d * %d = %d\n", w, z, w*z);     // 10 * 5 = 50
		System.out.printf("%d / %d = %d\n", w, z, w/z);     // 10 / 5 = 2
		System.out.printf("%d %% %d = %d\n", w, z, w%z);    // 10 % 5 = 0
		// % ��ȣ ��� �ÿ��� %% ��� �ۼ��ؾ��Ѵ�.
}

}
