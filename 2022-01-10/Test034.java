/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

//if ~ else �� �ǽ�

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//    �б� ������ ���ϱ� ���� ����ϴ� �������
//    if��, if ~ else ��, ���ǿ�����, ���� if ��
//    swich���� �մ�

// 2. if ���� if ������ ������ ���� ���,
//    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ������ �Է¹޾� Ȧ��/ ¦�� �Ǻ��ϴ� ���α׷��� �����Ѵ�.
// ��, ���� if������ ����Ѵ�.
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		System.out.print("���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		

		if (a % 2 ==0)
			System.out.printf("%d�� ¦��\n",a);

		if (a % 2 == 1)
			System.out.printf("%d�� Ȧ��\n",a);
		
	}
}