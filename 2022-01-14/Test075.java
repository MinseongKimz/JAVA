/*==========================================
  ����Ŭ������ �ν��Ͻ� ����
============================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��פ� �� �ֵ��� �Ѵ�.

//���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5
// ������ ������ �Է�(+ - * /) : +
// >> 10 + 5 = 15
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	int a, b;
	char c;

	//�Է� �޼ҵ�
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("������ ������ �Է�(+ - * /) : ");
		c= (char)System.in.read();
	}

	int cal()
	{
		int d=0;

		if (c == '+')
		{
			d = a + b;
		}
		else if (c == '-')
		{
			d = a - b;
		}
		else if (c == '*')
		{
			d = a * b;
		}
		else if (c == '/')
		{
			d = a / b;
		}
		return d;
	}

	
	void print(int result)
	{
		System.out.printf("%d  %c  %d  = %d\n",a,c,b, result);
	}

}
public class Test075
{
	public static void main(String[] args) throws IOException
	{
		int re;
		Calculate ca = new Calculate();
		ca.input();
		re =ca.cal();
		ca.print(re);
	}
}
/* ������
������ �� ���� �Է�(���� ����) : 123
-2
������ ������ �Է�(+ - * /) : -
123  -  -2  = 125
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/