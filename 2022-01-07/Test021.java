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

public class Test021
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		System.out.print("�̸�,����,����,���� �Է� (��,���� ����) : ");

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); // sc �� ���� ����.
		//			�Է� : ��μ�,20,22,22 
		//sc = new Scanner(��μ�,20,22,22).useDelimiter("\\s*,\\s*");   \s* [,] \s* 
		//									���鹮�ڷ� ���ٴ�    ��� ���ڿ� [,] ��� ���ڿ� 
		//		��� ���ڿ� ���̿� [,] �� ���鹮�ڷ� ����ϰڴ�! 



		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		System.out.println("\n >> �̸� : " + name);
		System.out.println(">> ���� : " + tot);


	}
}

/* ������ 
�̸�,����,����,���� �Է� (��,���� ����) : ��μ�,20,2,22

 >> �̸� : ��μ�
>> ���� : 44
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/