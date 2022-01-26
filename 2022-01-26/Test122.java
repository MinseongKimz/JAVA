/*============================
  ���� Ŭ���� ��� ����
==============================*/


// �������̽�(Interface)

/*
�� ��extends��  vs ��implements��

	Ŭ���� extends Ŭ����
	Ŭ���� extends �߻� Ŭ����

	�������̽� extends �������̽�
	�������̽� extends �������̽�, �������̽�

	�߻� Ŭ���� implements �������̽�
	�߻� Ŭ���� implements �������̽�, �������̽�

	Ŭ���� implements �������̽�
	Ŭ���� implements �������̽�, �������̽�



��	�������̽��� Ŭ�����ʹ� �޸� ���� ����� �����ϸ�,
	�������̽� ��ü�� ��ӵȴ�.

��	�������̽��� ��� ������ �����ʹ�
	�������������ڸ� ������� �ʾƵ� �⺻ ��� (primitive constant)��
	static final �� �����ڷ� �����ȴ�.
	Ŭ�������� �������̽��� �߰��Ͽ� ����� ���
	�������̽� �ȿ��� ���ǵ� ��� �޼ҵ带 ������ �־�� �ϸ�
	�������̽��� �����ϴ� Ŭ������ 
	�������̽��� ���� �������̽��� �����ϴ� �߻� �޼ҵ带 ������ 
	��� �޼ҵ带 �������� ���� ���
	�߻�(abstract) Ŭ������ �����ؾ� �Ѵ�.

��	����
	- �������̽��� �޼ҵ带 ���� �ϰ� ���Ǵ� ����.
	- �������̽��� implements �� ��� �ݵ�� ���� Ŭ������
	  �������̽��� ��� �޼ҵ带 �������̵�(Overriding) ���־�� �Ѵ�.
	- �������̽��� �ڵ������� ������ ���� ó���ȴ�.
	   ��� ���� : public static final
	   �޼ҵ�    : public abstract
	- ���� ����� �޸���,�� �� ���еǸ�
	  �������� �������̽��� ����� �� �ִ�.
	- �������̽� ���� ����� ���� ��extends�� Ű���带 ����Ѵ�

��	�������̽��� ����
	�������̽��� Ŭ������ ���� ���ø��̱� ������,
	��� ������ �������̽��� �Ǳ� ���ؼ���
	�ڹ� ���α׷����� �������̽��� ������ �־�� �ϴµ�
	�̷��� ����� �ϴ� ���� ��implements�� ������̴�.

��	Ŭ������ ���ÿ� �� �� �̻��� �������̽��� 
	implements �� �� �ִ�!!!!
*/

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

// �� �������̽��� ��� ���� �������̽�
interface CDemo extends ADemo, BDemo
{
	public void test();
}

//CDemo �������̽��� ������  �߻�(����)Ŭ����
//abstract class DemoImpl implements CDemo
//			��     ��� �޼ҵ� ���������� �� �Ϲ� Ŭ����
class DemoImpl implements CDemo
{
	@Override
	public void test()
	{
		System.out.println("test()....");
	}

	@Override
	public void write()
	{
		System.out.println("write()....");
	}
	@Override
	public void print()
	{
		System.out.println("print()....");
	}
}



public class Test122
{
	public static void main(String[] args)
	{
		// �� �������̽��� ��ӹ��� �������̽��� �����ϰ�
		// ��� �޼ҵ带 �������� Ŭ������ ����  �ν��Ͻ� ����
		DemoImpl ob = new DemoImpl();

		ob.test();
		ob.write();
		ob.print();
	}
}
/*
test()....
write()....
print()....
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/