/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/
// �ݺ���(while) �ǽ�

// 1 * 2 * 3 * 4 *....*10

//������ : 
public class Test052
{
	public static void main(String[] args)
	{
		int n=0, result=1;

		while (n<10)
		{
			n++;
			result *= n;
		}
		System.out.println(">> " + result);
	}

}
/*
>> 3628800
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/