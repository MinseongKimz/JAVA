/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/
// switch�� �ǽ�

//����ڷκ��� ������ �� ������ �����ڸ� �Է� �޾� 
// �ش� �������� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//�� ����ġ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�.
// �������� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

//���࿹) 
// ù ��° ���� �Է� : 3
// �� ��° ���� �Է� : 17
// ������ �Է�[+ - * /] : -

// >> 3 -17 = -14
// ����Ϸ��� �ƹ�Ű�� ��������.



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test045
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

		switch (c)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		default : return;       // return �� �ǹ� : ���� ��ȯ (Ư���� ��. return�� �ܵ����� ������ ����)
								//                  �޼ҵ� ���� �� ���⼱ main() �޼ҵ� ���� �� ���α׷� ����
		}

		System.out.printf("\n>> %d  %c  %d  =  %d\n",a, c, b, result);
	}
}
/*
ù ��° ���� �Է� : 2
�� ��° ���� �Է� : 3
������ �Է�[+ - * /] : +

>> 2  +  3  =  5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/