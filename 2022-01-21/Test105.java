/*=================================================
  ���� �޼ҵ� �ߺ�����(Method Overloading) ����
===================================================*/

/*
��  �޼ҵ� �����ε��� ����
	�޼ҵ� �����ε�(Method Overloading)�̶�
	�޼ҵ尡 ó���ϴ� ����� ����
	�޼ҵ� ��ȣ �ӿ� �����μ�(����, �Ű�����, �Ķ����)�� ������ �ٸ��ų�
	�ڷ���(Data Type)�� �ٸ� ���
	�޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ��� 
	���������� ����ϰ� �Ǵµ�
	�̸� �޼ҵ� �����ε��̶� �Ѵ�.
*/



public class Test105
{
	public static void main(String[] args)
	{
		//drawLine(); // �ν��Ͻ� ���� �ϴ��� �ƴϸ� ��ο���� �޼ҵ带
					  // static�� ���� �ִ���
		drawLine();
		//====================
		drawLine('-');
		//--------------------
		drawLine('<');
		//<<<<<<<<<<<<<<<<<<<<
		drawLine('+',30);
		//++++++++++++++++++++++++++++++
		drawLine('x',40);
		//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

	}

	// ���� �׸��� �޼ҵ� ����
	public static void drawLine()
	{
		System.out.println("====================");
	}

	public static void drawLine(char c) // �� �޼ҵ�� ��Ȯ�� ������ �̸��� �޼ҵ�
	{									// �Ű������� ���� ����� �޾� ����� ����
		for (int i=0;i<20 ;i++ )		// �� �޼ҵ�� �Ű������� �ȹް� 
		{								// �Ʒ��� �Ű������� �޴� ���̸� ��
			System.out.print(c);
		}
		System.out.println();
	}

	public static void drawLine(char c, int n) // ������ ���ؼ� �Ű����� �ϳ� �߰�
	{										   // ���� �޾Ƽ� �װɷ� ���� ���� �Ҳ���
		for (int i=0;i<n ;i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}
}