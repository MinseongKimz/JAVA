/*==========================================
  ����Ŭ������ �ν��Ͻ� ����
============================================*/

// ������(Constructor)

class NumberTest2
{
	int num;
	// ����� ���� ������ �����Ƿ� �ڹٰ� default ������ ���� x
	/*
	NumberTest2()
	{
	}
	*/

	// ������ �� ����� ���� ������ 
	NumberTest2(int n)
	{
		num =n;
		System.out.println("������ ȣ�� �� �Ű����� ���� : " + n);
	}

	int getNum()
	{
		return num;
	}
}

public class Test077
{
	public static void main(String[] args)
	{
		//NumberTest2 �ν��Ͻ� ����
		//NumberTest2 ob1 = new NumberTest2(); 
		// ���� �߻� (�����Ͽ���)
		//NumberTest2 Ŭ��������
		// ����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱� ������
		// default ������ �� �ڵ����� ���Ե��� ������
		//����ڰ� ������ �����ڴ� �Ű������� ���� �����̱� ������
		// ���� ���� �Ű����� ���� ������ ȣ�� �� ������ �߻��ϰ� �Ǵ� ���̴�.
		
		NumberTest2 ob1 = new NumberTest2(10);
		System.out.println("�޼ҵ� ��ȯ �� : " + ob1.getNum());

		NumberTest2 ob2 = new NumberTest2(3564);
		System.out.println("�޼ҵ� ��ȯ �� : " + ob2.getNum());


	}
}
/*
������ ȣ�� �� �Ű����� ���� : 10
�޼ҵ� ��ȯ �� : 10
������ ȣ�� �� �Ű����� ���� : 3564
�޼ҵ� ��ȯ �� : 3564
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .���� 9:36
*/