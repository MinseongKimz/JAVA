/*==========================================
  ���� ���������� �������� ����
============================================*/

// ���������� �ʱ�ȭ �׽�Ʈ 
//Ŭ���� ������ ����� ���� : ��������(�۷ι� ����)
//�޼ҵ� ������ ����� ���� : ��������(���� ����)

// Test070.java �� ���ϱ�

public class Test071
{
		//Ŭ���� ����
		int a; // �������� ����
		// �ڹٰ� �˾Ƽ� �ڵ����� 0���� �ʱ�ȭ ����

		boolean b;
		// �ڹٰ� �˾Ƽ� �ڵ����� false �� �ʱ�ȭ ����

		char c; 
		// �ڹٰ� �˾Ƽ� �ڵ����� �������� �ʱ�ȭ ����

		double d;


	public static void main(String[] args)
	{
		//�޼ҵ� ����
		//System.out.println(" a = " + a);
		//error: non-static variable a cannot be referenced from a static context
        //        System.out.println(" a = " + a); (������ ����)



		Test071 ob = new Test071(); // Ŭ������ ������� �ν��Ͻ� ����
		System.out.println(" ob.a = " + ob.a); // ob.a = 0
		// ob�� �޸𸮿��� Test071 Ŭ������ �������ִ� �ּҸ� �˷���
		
		System.out.println(" ob.b = " + ob.b); // ob.b = false

		System.out.println(" ob.c = " + ob.c); // ob.c = 

		System.out.println(" ob.d = " + ob.d); // ob.d = 0.0
		
	}
	/*
	�ٸ� �޼ҵ� 1()
	{
		//�޼ҵ��� ����
	}
	
	�ٸ� �޼ҵ� 2()
	{
		//�޼ҵ��� ����
	}
	*/
}
/*
 ob.a = 0
 ob.b = false
 ob.c =
 ob.d = 0.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/