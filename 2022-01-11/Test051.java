/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/
// �ݺ���(while) �ǽ�

// 1/2 + 2/3 +3/4+ ..... + 9/10 �� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ���� ��
// ������ : xxx(<= �Ǽ����)


public class Test051
{
	public static void main(String[] args)
	{
		int n=1;
		double s = 0.0;

		while (n<=9)
		{
			s = (double)n/(n+1);
			n++;
		}
		System.out.println("���� ��� : " + s);
	}
}