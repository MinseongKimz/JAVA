/*=================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===================================*/

// Wrapper Ŭ����

public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		
		System.out.println(b2);
		System.out.println(i2);

		print(b2);
		print(i2);
	
		// Byte Ŭ������ byteValue() �޼ҵ� ȣ��
		byte b3 = b2.byteValue(); //��ڽ�

		// Integer Ŭ������ intValue �޼ҵ� ȣ��
		int i3 = i2.intValue();

		//check~
		int i4 = b2.byteValue(); // byte Ÿ���� int�� ����ȯ (�ڵ�)
		//byte b4 = i2.intValue(); // int Ÿ���� byte�� ����ȯ (�ڵ�����ȯ ����)
		byte b4 = i2.byteValue();  // IntegerŬ������ byteValue �޼ҵ�..

		System.out.println(b3);  //3
		System.out.println(i3);	 //256

		//check~!
		System.out.println(b4);  //0 ?? 256 > 128 byte ���� �Ѿ����
		System.out.println(i4);  //3

	}
	/*
	static void print(Byte b)
	{
	}
	static void print(Integer i)
	{
	}*/

	// java.lang.Number Ŭ����(�߻� Ŭ����)��
	// ��� ������ Wrapper Ŭ�������� �θ� Ŭ����
	// (���� Ŭ����, ����Ŭ����) �̴�.
	// b2, i2 �ڷ����� Number�� �Ѿ���鼭
	// ��ĳ������ �Ͼ��
	// Auto-Boxing �� �Ͼ�� �ȴ�
	static void print(Number a)
	{
		System.out.println(a);
	}
}