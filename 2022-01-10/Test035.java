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
//Ȧ�� ¦�� 0

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n; 

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		/*
		if (n%2==0)
		{
			System.out.printf("%d�� ¦��\n",n);
		}

		else if (n%2!=0)
		{
			System.out.printf("%d�� Ȧ��\n",n);
		}
		else
		{
			System.out.println(n + "�� 0");   // �̰� 0�� �ɷ� �� �� �� ����.
												 �Ÿ����� 0�Ÿ��Ⱑ ¦������ ���� �ԷµǾ���.
		}
		*/									// ���ǹ��� ������ ������ �׻� ������ ���� ������ �����ؾ��Ѵ�.

											//�� ���ǹ� �������������� �̿��� ����(else)�� 
		/*									// ������ ���Ե� �������� ó���ϴ� ���� �ٶ������� ���� ��찡 �ִ�.
											// �������̸� ������ ���Ե��� �ʴ� ������
											// �̿��� ����(else)���� ó���� �� �ֵ��� ����.

										
		if (n %2!=0)
		{
			System.out.printf("%d�� Ȧ��\n",n);	
		}
		else if (n ==0)
		{
			System.out.println(n + "�� 0");
		}
		else 
			System.out.printf("%d�� ¦��\n",n);
		*/
		
		String result;                          // �� �ڵ忡�� ���� result�� �ʱ�ȭ ���� �ʾҰ�
												// if�� ������ ���ǿ� ���� ����ȴ�. 
		if (n==0)								// ������ �ڹٿ��� �츮�� if���� ��� ���� else �� ���ٸ�
		{										// ��� ����Ǽ� �� ä���� �ʾҴٰ� �Ǵ�. ������ ����.
			result = "��";						// if�� �ۿ��� ������ �ʱ�ȭ�� �̷�����ų� 		
		}										// else�� ���ؼ� ��� ��츦 ���Խ��Ѿ� �Ѵ�.
		else if (n%2 ==0)
		{
			result = "¦��";				    // if~else ������ ��ø������
		}										// �ݵ�� else�� ������ �ϴ� ���� �ƴϴ�.
		else if (n%2 !=0)						// �ٸ�, ����ؾ� �� ������ ó���ϴ� ��������
		{										// ������ �߻����� �ʴ� �������� �ۼ��ؾ� �Ѵ�.
			result = "Ȧ��";
		}
		else
			result = "�����Ұ�";

		System.out.println(n + " �� " + result);    
		
	}
}
