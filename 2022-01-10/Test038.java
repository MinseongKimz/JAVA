/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

//if ~ else �� �ǽ�

//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ����ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 
// �� ��° ���� �Է� :
// ������ �Է�[+ - * /] : 

// x + x = x

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test038
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result = 0;
		char c;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		c = (char)System.in.read();

		if (c == '+')
		{
			result = a + b;
		}
		else if (c == '-')
		{
			result = a - b;
		}
		else if (c == '*')
		{
			result = a * b;
		}
		else if (c == '/')
		{
			result = a / b;		
		}
		else
		{
			System.out.println("\n�����ڸ� �ٽ� Ȯ���� �ּ���");
		}

		System.out.printf("\n%d  %c  %d  =  %d \n",a, c, b, result);
		
	}
}
/*
ù ��° ���� �Է� : 23
�� ��° ���� �Է� : 4
������ �Է�[+ - * /] : /

23  /  4  =  5

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/