/*===========================================
���� �ڹ� �⺻ ���α׷��� ����
=============================================*/

// ��� ������
// BufferedReader
// printf()

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ��Ģ���� �� ������ ������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// �� �Է¹޴� ������ BufferedReader�� Ȱ���ϰ�
// ����ϴ� ������ printf() �޼��带 Ȱ���� �� �ֵ��� �Ѵ�
// ���� ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

//���࿹)
// ù ��° ���� �Է� :
// �� ��° ���� �Է� :

//=====[���]=====
// ? + ? = ?
// ? - ? = ?
// ? * ? = ?
// ? / ? = ?
// ? % ? = ?
//================

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test023
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int a, b;
		int sum, min, mul, div, rem;


		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());


		sum = a + b;
		min = a - b;
		mul = a * b;
		div = a / b;
		rem = a % b;

		System.out.println("\n=====[���]=====");
		System.out.printf("%d  + %d  = %d\n",a, b, sum );
		System.out.printf("%d  - %d  = %d\n",a, b, min );
		System.out.printf("%d  * %d  = %d\n",a, b, div );
		System.out.printf("%d  / %d  = %d\n",a, b, mul );
		System.out.printf("%d  %% %d  = %d\n",a, b, rem );
		System.out.println("================");
	}
}
/* ���� ���
ù ��° ���� �Է� : 100
�� ��° ���� �Է� : 2

=====[���]=====
100  + 2  = 102
100  - 2  = 98
100  * 2  = 50
100  / 2  = 200
100  % 2  = 0
================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

