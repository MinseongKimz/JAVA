/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// switch �� �ǽ�
/*
�۴��� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
  ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�/
  
������ �� ����
	switch(����)
	{
		case ���1 : ����1; [break;]
		case ���2 : ����2; [break;]
					...
		[default : ���� n+1;[break;]]
	}
 switch ���� ���İ� case�� ����� 
 byte, short, int, long���̿��� �Ѵ�.

 case�� �ڿ� [break;]�� ���� ������ ���
 ���� case���� ������ ����ؼ� �����ϰ� �ȴ�; >> �⺻ ��
 [break;]�� ������ ���
 �ش� �������� ������ ���� �� switch ���� ���������� >> �Ϲݸ�
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int kor, eng, mat, tot;
		//double avg;
		int avg;
		char grade;
		String name;

		System.out.print("�̸� �Է� : ");
		name =br.readLine();

		System.out.print("�������� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3;

		switch(avg/10) // ������ ����ġ������ �����ϱ�
		{			   // ����� ��Ʈ�� ������ 10 �ع����� ���ڸ��� �� �� �ִ�.
					   // �׷��� ��� 99 �� ������ �ϸ� 9 
			case 10: case 9: grade = 'A'; break;	
			case 8: grade = 'B'; break; 	
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default:grade = 'F'; break;
		}
		System.out.printf(">> ����� �̸��� %s �Դϴ�.\n",name);	
		System.out.printf(">> ������ �� %d�̰�,����� %d�Դϴ�.\n",tot,avg);	
		System.out.printf(">> ����� %c�Դϴ�.\n",grade);	
	}
}
/* ������
�̸� �Է� : ��μ�
�������� �Է� : 60
�������� �Է� : 70
�������� �Է� : 100
>> ����� �̸��� ��μ� �Դϴ�.
>> ������ �� 230�̰�,����� 76�Դϴ�.
>> ����� C�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/