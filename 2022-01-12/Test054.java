/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/
// �ݺ���(while) �ǽ�

// ����ڷκ��� ������ �� ������ �Է¹޾�
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��) 
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 20
// >>10 ~ 20 ������ �� : xxxx

// ù ��° ���� �Է� :
// �� ��° ���� �Է� : 2
//>> 2~10 ������ �� : xx

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 0; //while �� ���� �ϱ� ���� ����
		int a, b; // �Է¹��� ����
		int sum = 0; // a ���� b ���� ��

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		if (a > b) // �Է¹���  �� ���� ũ�� �� �� �ڸ� �ٲ�
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}

		i += a; // i �� ���۰��� a�� ���� ������ ������ a�� �ϰ� a++ �ϸ� �ȵǴ°�
				// ���� ��� ������ a �� ���� a ���� ������ ���� �ٲ�� ������.
		while (i<=b)
		{
			sum += i;
			i++;
		}
		System.out.printf("%d ~ %d ������ �� : %d\n", a,b,sum);
	}
}
/* ���� ���
ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 30
20 ~ 30 ������ �� : 275
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 11
�� ��° ���� �Է� : 2
2 ~ 11 ������ �� : 65
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 6
�� ��° ���� �Է� : 6
6 ~ 6 ������ �� : 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/