/*===========================================
���� �ڹ� �⺻ ���α׷��� ����
=============================================*/

// �ڹ��� �⺻ ����� : java.util.Scanner
// �� java.util.Scanner
//    �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//    ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//    �ۼ��� ���� ��ū�� next() �޼ҵ带 ���
//    �ٸ� ����(�ڷ���)�� ������ ��ȯ�� ���ִ�.


import java.util.Scanner;

public class Test020
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat;


		// ���� �� ó��
		// 1.����ڿ��� �ȳ� �޼��� ���
		System.out.print("�̸� ���� ���� ���� �Է� (���� ����) : ");
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		//���� ����
		int tot = eng + kor + mat;
				

		// ��� ���
		System.out.println();
		System.out.println(">>�̸� : " +name);
		System.out.println(">>���� : " +tot);

	}
}

/*��� ���
�̸� ���� ���� ���� �Է� (���� ����) : ��μ� 90 20 30

>>�̸� : ��μ�
>>���� : 140
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/