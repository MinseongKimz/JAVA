/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/

// break �ǽ�

//������ ���� ó���� �̷�� ���� ���α׷��� �����Ѵ�.
//��, �Է¹��� ������ 1~ 100 ���� �ȿ�����
//�����ϵ��� �ۼ��Ѵ�.

//���࿹)
//������ ���� �Է� : -10

//������ ���� �Է� : 0

//������ ���� �Է� : 2022

//������ ���� �Է� : 10
//>> 1 ~ 10 ������ �� : 55
//����Ͻðڽ��ϱ�(Y/N)? : y

// ������ ���� �Է� : 100
//>> 1 ~100������ �� : 5050
//����Ͻðڽ��ϱ�(Y/N)? : N
//����Ϸ��� �ƹ�Ű�� ��������... �� ���α׷� ����


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test067
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, s, i;
		// n : ����� �Է°��� ��Ƶ� ����
		// s : ������ ���� ���
		// i : �ݺ��� ���� ���� ����
		char ch; // ���μ����� ��� ���� ���� ������ ���θ� ��Ƶ� ����		
		
		while(true)
		{
			do
			{
				System.out.print("������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);
		
			//�׽�Ʈ (Ȯ��)
			//System.out.print("������ ���� �Է�");

			s = 0; // while true �������� s �ʱ�ȭ ���ϸ� ��� ������
				   // �׷��ϱ� ���� �ȿ��� �ʱ�ȭ ������	
			for (i=1; i<=n; i++)
			{
				s += i;
			}
			System.out.printf("1 ~ %d ������ �� : %d\n" ,n,s);

			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			ch = (char)System.in.read();

			//�׸��ҷ� �ǻ�ǥ�� �Ϸ���
			//�ݺ����� ���߰� �������� �� �ִ� ó�� ����ڿ��� Y / N 
			//if (ch=='N' || ch=='n') N �Ǵ� n �Է��Ѱ� ����?
			if(ch!='Y' && ch!='y')	//Y �Ǵ� y �Է��Ѱ� �ƴѰ� Ȯ��? ��ణ �ǹ����� ����						  	
			{
				//�ݺ��� Ż�� �ڵ� �ۼ� �ʿ�
				break;//����� (�׸��� ����������)
			}//end if 
			System.in.skip(2);@
		}//end while
		
	}//end main
}//end class
	
		/*
		// �� Ǯ��.. break ���� �ʾҴ�..1~100 ���� ������ �ȳ־���. 
		//���� ����

		char x;
		int num;// �Է� ���� ��
		int sum = 0; //1���� ���� ������ ����
		boolean a = true;

		do
		{
			System.out.print("������ ���� �Է� : ");
			num = Integer.parseInt(br.readLine());
			
			for (int i = 0;i<=num ;i++ )
			{
				sum += i;
			}
			System.out.printf("1 ~ %d ������ �� : %d\n" ,num,sum); 
			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			x = (char)System.in.read();
			System.in.skip(2);

			if (x=='y' || x=='Y')
			{
			a = true;
			}
			else if (x=='n' || x=='N')
			{
			a = false;
			} 

		}
		while (a == true);      
		*/
/*
������ ���� �Է� : 10
1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�(Y/N)? : Y
������ ���� �Է� : 32
1 ~ 32 ������ �� : 528
����Ͻðڽ��ϱ�(Y/N)? : Y
������ ���� �Է� : 23
1 ~ 23 ������ �� : 276
����Ͻðڽ��ϱ�(Y/N)? : y
������ ���� �Է� : 123
������ ���� �Է� : 12
1 ~ 12 ������ �� : 78
����Ͻðڽ��ϱ�(Y/N)? : n
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/