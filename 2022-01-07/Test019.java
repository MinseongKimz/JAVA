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

public class Test019
{
	public static void main(String[] args)  //throws IOException �� �ʿ� ����..
	{
		// Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);// BufferedReader���� ��ª��..? ������ ��.
											// ����� ���� scanner ����(�ӵ�)��..������.
		
		//�ֿ� ���� ����
		String name;
		int kor, eng, mat;



		//���� �� ó��

		System.out.print("�̸��� �Է��ϼ��� : ");
				
		name = sc.next(); //readLine()���� ���ڿ� ���� name�� ����/

		System.out.print("�������� �Է� : ");
		kor = sc.nextInt();  // ���������� �ޱ�����, Integer.parseInt(sc.next())�̷��� ���ص�
		
		System.out.print("�������� �Է� : ");
		eng = sc.nextInt();

		System.out.print("�������� �Է� : ");
		mat = sc.nextInt();



		//��� ���
		System.out.println();
		System.out.println(">>�̸� : " + name);
		System.out.println(">>���� : " + (kor+eng+mat));

	}
}

/*��� ���
�̸��� �Է��ϼ��� : ��μ�
�������� �Է� : 23
�������� �Է� : 312
�������� �Է� : 23

>>�̸� : ��μ�
>>���� : 358
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/