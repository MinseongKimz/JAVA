/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/
// switch�� �ǽ�

// ����ڷκ���  1 ���� 3 ������ ���� �� �ϳ��� �Է¹޾�
// �Է� ���� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

//�� switch ���� �Ϲ� ���� ����Ѵ�.
//�� switch ���� �⺻ ���� ����ϵ� break�� �� �ѹ� ���

//���� ��)
//������ ���� �Է�(1~3): 3
//�ڡڡ�
//����Ϸ��� �ƹ�Ű��...

//������ ���� �Է�(1~3): 4
//�Է� ����~!!!
//����Ϸ��� �ƹ�Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test044
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		
		System.out.print("������ ���� �Է�(1~3): ");
		num = Integer.parseInt(br.readLine());

		/*switch (num)
		{
		case 3: 
			System.out.println("�ڡڡ�"); break;
		case 2: 
			System.out.println("�ڡ�"); break;
		case 1: 
			System.out.println("��"); break;
		default : 
			System.out.println("�Է� ����~!!!"); break;
		}*/
		/*
		String star = "";
		switch (num)
		{
		
		case 3:
			star += "��"; 
		case 2: 
			star += "��"; 
		case 1: 
			star += "��"; System.out.println(star); break;
		default : 
			System.out.println("�Է� ����~!!!");
		// ���� �����ϴ� �Ŷ�� += ���� ���� �����ڸ� ��������..
	*/
		switch (num)
			{
				case 3: System.out.print("��");
				case 2: System.out.print("��");
				case 1: System.out.print("��"); break;
				default :System.out.print("�Է� ����~!!!"); 
			}
			System.out.println();
	}
}
