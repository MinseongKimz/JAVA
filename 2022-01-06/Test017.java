/*===========================================
���� �ڹ� �⺻ ���α׷��� ����
=============================================*/

// �ڹ��� �⺻ ����� : System.in.read()

import java.io.IOException;

public class Test017
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ����
		char ch;
		
		// ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� �ϳ� �Է��ϼ��� :" );
		System.in.read();
		
		ch = (char)System.in.read();  // �Է¹����� �ƽ�Ű�ڵ� �������� �׷��Ƿ� ��������ȯ �ʿ�;
		
		System.out.print(ch);
		
	}
}