/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/
// �ݺ���(while) �ǽ�

// ����ڷκ��� ������ ������ �Է� �޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ� 
// ����� ����ϴ� ���α׷��� �����.
// 1�� �Ҽ� �ƴ�

// ���� �� ) 
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�

// ������ ���� �Է� : 11
// 11 �� �Ҽ�

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, i = 2; // 1�� �Ҽ��� �ƴϰ�
					  // 1���� ������ �����ϸ� 
					  // ������ �������� ������ 2���� ����

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		boolean prime = true; // �Ҽ����� �ƴ��� �ޱ� ���� boolean�� 

		if (n==1) // 1�� �Ҽ��� �ƴϱ� ������ �׳� �ϳ� �������
		{
			System.out.printf("%d�� �Ҽ� �ƴ�\n",n);
			return;
		}
		while (i<n) 
		{
			if (n%i==0)
			{   
				prime = false; // �ؿ� �Ҽ��϶� ��¹��� ��½�Ű�� ����.
				System.out.printf("%d�� �Ҽ� �ƴ�\n",n);
				break;
			}
			else 
			{
				i++;
			}
		}
		if (prime) // n�� �� while���� ��� ���ߴٸ� 
		{          // prime�� true �̱� ������ �Ҽ��� �Ǵ�
			System.out.printf("%d�� �Ҽ�\n",n); // �Ҽ���� ��¹��� ����
		}
	}
}

/*
������ ���� �Է� : 7789
7789�� �Ҽ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 1
1�� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 7788
7788�� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/