/*
*�ۼ��ѳ� : 2022.01.05
*�� �� �� : ��μ�
*�����̸� : Test005.java
*�ۼ����� : ����. ������ �ڷ���
*/

// ������ �ڷ���

public class Test005
{
	public static void main(String[] args)
	{
		//���� ���� -> �޸� ���� Ȯ�� / �Ҵ�
		int a;

		// ���� �� ó�� -> Ȯ���� �޸� ������ ������ ��Ƴ���
		a = 10;

		// ��� ���
		System.out.println("a�� " + a + "�Դϴ�.");
		//-----> a�� 10�Դϴ�.

		byte b = 20;
		System.out.println(b);				// ���� b�� ����ִ� ���� ���
		//----->20

		System.out.println("b");			// ���ڿ� b ���

		short c;							// error ������ ����
		//c = a;							// c�� 2byte short�� a�� 4byte int�� 
		c = (short)a;						// ����� ����ȯ (���� ����ȯ)
		System.out.println(c);
		//-----> 10


	}
}
