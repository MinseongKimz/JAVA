/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

//if ~ else �� �ǽ�

//  �� ����
//  �� ī�信 ���ε� 
//  ����ڷκ��� ������ ������ �Է¹޾�
//  �Է¹��� ������ .... �������� ������� �Ǻ��Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է��� BufferedReader�� readLine() �� Ȱ���ϰ�
// if ���ǹ��� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�. 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year; // ����ڿ��� ���� ������ ����

		//�ȳ��� ����
		System.out.print("������ ���� �Է� : ");

		//readLine() ���������� �ޱ����� Integer.parseInt
		year = Integer.parseInt(br.readLine());

		

		//���
		if ((year%4==0&&year%100!=0)||(year % 400 == 0)) //������ 4�⿡ �ѹ�, ������ 100�⸶�ٴ� ���, 
		{												 //�� 400�⸶�ٴ� ������.
			System.out.printf("\n%d���� �����Դϴ�.\n",year);
														 //�׷��� 4�� ������������ �⵵�� 100���� ����������� �ʴ� �⵵
		}												 //�� ���� ��� �ش�Ǵ� �⵵�� 400���� ������ �������� �⵵ ���� �ϳ��� �ش�ǵ�
														 //�����̱� ������ ||���� ������.
		else 
		{
			System.out.printf("\n%d���� ����Դϴ�.\n",year);						
														 //���� �ش����� �ʴ� �⵵�� ����̴�.
		}		

	}
}