/*==========================================
  ���� �޼ҵ��� ��� ȣ�� ����
============================================*/

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(10);	
	}
	public static void showHi(int cnt)
	{   	
		/*
		System.out.println("Hi~");
		showHi(cnt--);
		if(cnt ==1)
			return;
		*/  // �� ������ StackOverflowError �� ���´�.

		System.out.println("Hi~");
		if (cnt == 1)
		{
			return ; 
		}
		showHi(--cnt);	// cnt-- �� �ϰԵǸ� ȣ�� �� ���Ҷ� �ǹ̰� ����. //10���� 10 ȣ���� 9�� �ٲ�µ� �׷� �� 10ȣ�⹮�� 9�� ���̰�....
	}					// �׸��� if������ �տ� �������� ȣ���� �˻�� �˻��ϱ⵵ ���� ȣ���� �̷������.
						//��� �˻��� ���� ��������. �׷��Ƿ� �˻� ���� ������ �� ȣ���� �ʿ��ϴ�.
}    