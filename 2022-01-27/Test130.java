/*=================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===================================*/

// Objcet Ŭ����

class Test
{
	private int a = 10;

	public void write()
	{
		System.out.println("a : " + a);
	}

}




public class Test130
{
	
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10==9 : " + (10==9));

		int a = 10;
		int b = 10;
		System.out.println("a==b : " + (a==b));
		//10==9 : false
		//a==b : true

		// �� ��==�� �񱳿����ڴ� �ǿ������� ũ�⸦ ������ Ȯ�� (����)

		System.out.println("ob1==ob2 : "+ (ob1==ob2) );
		// ob1==ob2 : false 
		// ũ�Ⱑ �ٸ��� ������ �� false?
		// �� ��ü(Object)���� ���ϴ� �������� ���Ǵ� ��==�������ڴ�
		//	  ũ�⸦ ���ϴ� ���� �ƴ϶� ��ü�� �ּҸ� ��.

		System.out.println("ob1.equals(ob2) : " + (ob1.equals(ob2)));
		//ob1.equals(ob2) : false
		
		// �ء�==�� �����ڿ� Object Ŭ������ ��equals()���޼ҵ��
		//	������ �������� ��ü�� �ּҸ� ��~

		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();

		System.out.println("ob1             : " + ob1);
		System.out.println("ob1.toString	: " + ob1.toString());

		System.out.println("ob2             : " + ob2);
		System.out.println("ob2.toString	: " + ob2.toString());

		/* ���..
		ob1             : Test@15db9742
		ob1.toString    : Test@15db9742
		ob2             : Test@6d06d69c
		ob2.toString    : Test@6d06d69c	
		*/

		// ��Ŭ������@�ؽ��ڵ塻

		// ���ؽ��ڵ�(hashcode)
		//	: �ڹ� ���������� ��ü�� �����ϱ� ���� ����ϴ� ��
		//	  �޸��� �ּҰ����� �����ϸ� ����� �ȵȴ�.

		// �� ��ü�� ������ hashcode(�ؽ��ڵ�)�� ������,
		//	  hashcode �� ���ٰ� �ؼ� ���� ��ü�� �ƴϴ�..

	}

}