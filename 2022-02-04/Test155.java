/*=================================
  ���� ����(Exception)ó�� ����
===================================*/

// �ٸ� ���� �ٽ� ������


public class Test155
{
	public int getValue(int value) throws Exception //�� ����2 ������ 
	{
		int a = 0;

		try
		{
			a = getData(-2); // �鿹��1 ����� ������ ���� �߻�

			
		}
		catch (Exception e)	// �� ���� ����1 ���
		{
			// �� ����1 ó��
			System.out.println("printStackTrace....");
			e.printStackTrace();

			// �� ���� 2 ����
			throw new Exception("Value�� �����Դϴ�.");
		}
		return a;
		
	}
	
	public int getData(int data) throws Exception			//�� ����1 ������
	{
		if (data < 0)
		{
			throw new Exception("data�� 0���� �۽��ϴ�!!"); //�� ����1 ���� 
		}
		return data + 10;
	}


	public static void main(String[] args)
	{
		Test155 ob = new Test155();

		try
		{
			int a = ob.getValue(-2);	 // �� ����2 �߻� 
			System.out.println("a : " + a);
		}
		catch (Exception e)	// �� ���� 2 ���
		{	
			//�� ����2 ó��
			System.out.println("printStackTrace....");
			e.printStackTrace();
		}
	}
}
/*
printStackTrace....
java.lang.Exception: data�� 0���� �۽��ϴ�!!
        at Test155.getData(Test155.java:37)
        at Test155.getValue(Test155.java:16)
        at Test155.main(Test155.java:49)
printStackTrace....
java.lang.Exception: Value�� �����Դϴ�.
        at Test155.getValue(Test155.java:27)
        at Test155.main(Test155.java:49)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/