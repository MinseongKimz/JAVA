/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

//if ~ else �� �ǽ�

// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
// ù ��° ���� �Է� : 7
// �� ��° ���� �Է� : 70
// �� ��° ���� �Է� : 42

// >> ���� ��� : 7 42 70
// ����Ϸ��� �ƹ�Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

			//���ü� �ִ� ����
			//abc, acb, bac, bca, cab, cba
		if (a > b)   
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (b > c)   // b = 2 , c = 1						
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
		if (a > b) // a = 2, b = 1                            
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		
		System.out.printf("\n ���� ��� : %d, %d, %d\n",a,b,c);
	

		/*
		System.out.print("�� ��° ���� �Է� : ");
		d = Integer.parseInt(br.readLine());

		if (a>b)
		{
			t = a;
			a = b;
			b = t;
		}
		if (b>c)
		{
			t = b;
			b = c;
			c = t;
		}

		if (c>d)
		{
			t = c;
			c = d;
			d = t;
		}
		if (a>b)
		{
			t = a;
			a = b;
			b = t;
		}
		if (a>c)
		{
			t = a;
			a = c;
			c = t;
		}
		if (b>c)
		{
			t = b;
			b = c;
			c = t;
		}

		System.out.printf("\n ���� ��� : %d, %d, %d, %d\n",a,b,c,d);
		//���� 4�� ���� 
		*/
	}
}
/*
ù ��° ���� �Է� : 432
�� ��° ���� �Է� : 1
�� ��° ���� �Է� : 23

 ���� ��� : 1, 23, 432
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/