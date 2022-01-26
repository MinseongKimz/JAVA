/*============================
  ���� Ŭ���� ��� ����
==============================*/

// �������̽�(Interface)

// �������̽�
interface ADemo
{
	public void write();
}

// �������̽�
interface BDemo
{
	public void print();
}

// �� �������̽��� 2�� �̻� ����(implements)�� �� �ִ�.
//	�� ���� ����� ���� �ʴ� �κ��� ����(����)�ϴ� ����.

// Ŭ����
//class DemoImpl
//class DemoImpl extends ADemo, BDemo (�̰� �ƴ�)
//class DemoImpl implements ADemo, BDemo
// �� �������̽��� �����߰� �޼ҵ�� �������� �ʾ����ϱ� ������ �߻� Ŭ����
//abstract class DemoImpl implements ADemo, BDemo
//���� �޼ҵ�� ���� ������ �׳� Ŭ����...
class DemoImpl implements ADemo, BDemo
{
	// JDK 1.5(5.0)������ �������̽� �޼ҵ带 
	// �������̵�(Overriding)�� ��
	// ��@Override���� �� ����.
	// JDK1.6 ���ĺ��� ���� ������ �����̴�.
	// ��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵��� ����
	// JDK1.5 ������ @Override ������̼� ��밡���ϴ�.
	@Override
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()...");
	}
}



//main() �޼��带 ������ �ٸ� Ŭ����
public class Test120
{
	public static void main(String[] args)
	{
		//ADemo ob = new ADemo(); // �������̽� �� �ν��Ͻ� ���� x
		//BDemo ob = new BDemo(); // �������̽� �� �ν��Ͻ� ���� x

		// ADemo, BDemo �������̽��� ������ Ŭ���� �� DemoImpl 
		// ����� �ν��Ͻ� ����.
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();
		//ADemo �������̽� �޼ҵ� write()...
		//BDemo �������̽� �޼ҵ� print()...

		ADemo ob2 = new DemoImpl();	  // ��ĳ����
		BDemo ob3 = new DemoImpl();   // ��ĳ����

		//ob2.print();  // �����߻�
		//ob3.write();	// �����߻�

		ob2.write();		//ADemo �������̽� �޼ҵ� write()...
		ob3.print();		//BDemo �������̽� �޼ҵ� print()...

		((BDemo)ob2).print(); // ���� ���� ���赵 �ƴѰ�  ó�������� �ȵ� �� ������
		((ADemo)ob3).write(); // ��� ob2ob3 �Ѵ� DemoImpl���� ��ĳ�����ѰŰ�
							  // DemoImplŬ������ �� �������̽� ��� �� ���� �߱� ������ ���谡 �ִ�.
							  // ����,DemoImpl Ŭ������ �̵� �� �� �������̽��� �����ߴٸ�
							  // �� ������ ��Ÿ�� ������ �߻��ϴ� ������ �ȴ�. 
							  // �̰� �ٿ�ĳ������ �ƴϴ�. �������̽����� ĳ����?


		((DemoImpl)ob3).write(); // �̰� �ٿ�ĳ�����̴�.
		//--==>ADemo �������̽� �޼ҵ� write()...  
	
	}
}
/*
ADemo �������̽� �޼ҵ� write()...
BDemo �������̽� �޼ҵ� print()...
ADemo �������̽� �޼ҵ� write()...
BDemo �������̽� �޼ҵ� print()...
BDemo �������̽� �޼ҵ� print()...
ADemo �������̽� �޼ҵ� write()...
ADemo �������̽� �޼ҵ� write()...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/