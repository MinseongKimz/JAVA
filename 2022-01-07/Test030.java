/*===========================================
���� �� �� �� (Operater) ����
=============================================*/
// ���� ������ == ���� ������

//����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ ������� �������� 0������ �����Ͽ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//�� �̶� BufferedReader �� readLine()�� ���� �Ѱ� ���� �� �ֵ��� �Ѵ�.
// ���� ���� ������( ���� �����ڸ�) Ȱ�� �Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 
// ?? �� ���� ���

// ������ ���� �Է� : 0
// 0 �� ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String strResult;
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		strResult = (n > 0) ? "���": (n == 0 ? "��" : "����") ;

		System.out.println();
		System.out.printf("%d �� %s%n",n, strResult);

	}
}
/* 
������ ���� �Է� : 3

3 �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 0

0 �� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : -32

-32 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/