/*==========================================
  ����Ŭ������ �ν��Ͻ� ����
============================================*/

//����ڷκ��� ������ ������ �Է¹޾�
// 1 ���� �Է¹��� �������� ���� �����Ͽ�
// ��� ���� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���� �Է� ó�� �������� BufferedReader�� readLine()�� ����ϸ�
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū ��� 
// �ٽ� �Է� ���� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : 1050
// ������ ���� �Է�(1~1000) : -50
// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Hap
{	
	int a;

	void input() throws IOException // ���� �Է� �޼ҵ�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("������ ���� �Է� (1~1000): ");
			a = Integer.parseInt(br.readLine());
		}
		while (1>a || a>1000);
	}

	int sum()
	{	
		int asum = 0;
		for (int i=0;i<=a ;i++ )
		{
			asum += i;
		}
		return asum;
	}

	void print(int result)
	{
		System.out.printf("1 ~ %d ������ �� : %d\n",a, result);
	}
}

public class Test074
{
	public static void main(String[] args) throws IOException
	{
		Hap ob = new Hap();

		ob.input();
		int sum = ob.sum();
		ob.print(sum);
	}
}

/*
 ������ ���� �Է� (1~1000): 0
 ������ ���� �Է� (1~1000): -2
 ������ ���� �Է� (1~1000): 10000
 ������ ���� �Է� (1~1000): 233
1 ~ 233 ������ �� : 27261
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/