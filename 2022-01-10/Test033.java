/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/
//if ~ else �� �ǽ�

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.

// 90~100�� : A		80~89�� : B
// 70 ~ 79�� : C    60~69�� : D
// 60�� �̸� : F 

// �� , BufferedReader�� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

// ���� ��)
//�̸� �Է� : 
//���� ���� : 
//���� ���� : 
//���� ���� :

// >> ����� �̸��� ������ �Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kor, eng, mat, tot;
		char grade;
		String name;

		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		
		Double avg = tot / 3.0;
		
		 grade = 'X';
		/*
		if (avg >= 90)
		{
			System.out.printf("������ %d�̰�  ����� %.2f �Դϴ�.\n", tot, avg);
			System.out.printf("����� A �Դϴ�.\n");
		}
		else if (89>=avg && avg>=80 )
		{
			System.out.printf("������ %d�̰�  ����� %.2f �Դϴ�.\n", tot, avg);
			System.out.printf("����� B �Դϴ�.\n");
		}
		else if (79>= avg && avg>=70)
		{
			System.out.printf("������ %d�̰�  ����� %.2f �Դϴ�.\n", tot, avg);
			System.out.printf("����� C �Դϴ�.\n");
		}
		else if (69>= avg && avg>=60)
		{
			System.out.printf("������ %d�̰�  ����� %.2f �Դϴ�.\n", tot, avg);
			System.out.printf("����� D �Դϴ�.\n");
		}
		else
		{
			System.out.printf("������ %d�̰�  ����� %.2f �Դϴ�.\n", tot, avg);
			System.out.printf("����� F �Դϴ�.\n");
		���� §�� ���� ����� �߸����� �޴�.	*/

		if (avg >= 90)
			grade = 'A';
		
		else if (avg >= 80)
			grade = 'B';

		else if (avg >= 70)
			grade = 'C';

		else if (avg >= 60)
			grade = 'D';

		else if (avg < 60)
			grade = 'F';

		System.out.printf(">> ����� �̸��� %s �Դϴ�.\n",name);	
		System.out.printf(">> ���������� %d\n",kor);	
		System.out.printf(">> ���������� %d\n",mat);	
		System.out.printf(">> ���������� %d\n",eng);	
		System.out.printf(">> ������ �� %d�̰�,����� %.2f�Դϴ�.\n",tot,avg);	
		System.out.printf(">> ����� %c�Դϴ�.\n",grade);	
	
	}
}
/*���� ���
�̸� �Է� : ��μ�
���� ���� : 30
���� ���� : 40
���� ���� : 50
������ 120�̰�  ����� 40.00 �Դϴ�.
����� F �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���� ��ȹ.
�̸� �Է� : ��μ�
���� ���� : 76
���� ���� : 9
���� ���� : 99
>> ����� �̸��� ��μ� �Դϴ�.
>> ���������� 76
>> ���������� 99
>> ���������� 9
>> ������ �� 184�̰�,����� 61.33�Դϴ�.
>> ����� D�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/