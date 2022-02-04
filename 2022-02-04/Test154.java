/*=================================
  ���� ����(Exception)ó�� ����
===================================*/

// ���� �ٽ� ������ 


public class Test154
{
	public static void main(String[] args)
	{
		Test154 ob = new Test154();

		try
		{
			int a = ob.getValue(-2);   // �� ���� �߻�
			System.out.println("a : " + a);
		}
		catch (Exception e)			   // �� ���� ��Ƴ���
		{
			//�� ��Ƴ� ���� ó��
			System.out.println("�� printStackTrace....");
			e.printStackTrace();
		}

	}

	public int getData(int data) throws Exception
	{
		if (data<0)
		{
			throw new Exception("data �� 0 ���� �۽��ϴ�.");
			// �� ù ��° ���� �߻�
		}

		return data + 10;
	}
								// ��� ��Ƴ� ���ܸ� �ٽ� ������ ���� �����ϵ��� ó��
	public int getValue(int value) throws Exception
	{
		int a = 0;

		try
		{
			a = getData(-2); // �� ���� �߻� 
		}
		catch (Exception e)  // �� ���� ��Ƴ���
		{
			// �� ��Ƴ� ���� ó��
			System.out.println("�� printStackTrace....");
			e.printStackTrace();
			//check~~!
			throw e; // �� ��Ƴ� ���ܸ� �ٽ� ������
		}

		return a;
	}
}
/*
�� printStackTrace....
java.lang.Exception: data �� 0 ���� �۽��ϴ�.
        at Test154.getData(Test154.java:32)
        at Test154.getValue(Test154.java:45)
        at Test154.main(Test154.java:16)
�� printStackTrace....
java.lang.Exception: data �� 0 ���� �۽��ϴ�.
        at Test154.getData(Test154.java:32)
        at Test154.getValue(Test154.java:45)
        at Test154.main(Test154.java:16)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/