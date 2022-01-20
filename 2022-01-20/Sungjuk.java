// 2. Sungjuk Ŭ����
//    - �ο����� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
//		�̸� , ��������, ��������, ���������� �Է¹ް�
//	    ������ ����� �����ϴ� Ŭ������ ������ ��
//		�Ӽ� : �ο���, Record ������ �迭
//		��� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���
import java.util.Scanner;

public class Sungjuk
{
	int inwon;     // �ο���
	Record[] rec;// Record �迭 (�л� �Ѹ�� Record �迭 �� �Ѱ� Ȱ��)
				// Record ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭

	// �ֿ� �޼ҵ� ����( ��� ���� )
	public void set() // �ο��� �Է�
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�Է� ó���� �л��� �Է�(��, 1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);
		//check
		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ� 
		// �迭���� inwon��ŭ ������ ������ 
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.

		rec = new Record[inwon];
	}

	public void input() // �� ������ �Է�(���� �� ��� ���� ��� ����)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] title = {"���� ���� : " , "���� ���� : " , "���� ���� : "};

		//�ο� �� ��ŭ �ݺ� �� �ο����� ����Ͽ� ������� �迭�� ���� ��ŭ �ݺ�
		for (int i=0;i<inwon ;i++ ) //== for (int i=0; i<rec.length; i++)
		{
			// check~
			// Record Ŭ���� ����� �ν��Ͻ� ����
			rec[i] = new Record();
			System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1)); 
			
			rec[i].name = sc.next();

			/*
			System.out.print("���� ���� : ");
			rec[i].kor = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].eng = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].mat = sc.nextInt();
			*/
			/*
			System.out.print("���� ���� : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[2] = sc.nextInt();
			*/
			for (int j = 0;j<title.length ;j++ )   // �츮�� Record Ŭ���� ���鋚
			{									   // �������� int[] score = new int[3]���� ����
				// �ȳ� �޼��� ���
				System.out.print(title[j]);
				
				// ����ڰ� �Է��� �����͸� ���ھ� ������ ��Ƴ��� .
				rec[i].score[j] = sc.nextInt();		// score[0] = ���� ����
													// score[1] = ���� ����
													// score[2] = ���� ����
				// ����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
				// ������ ���� ���� ����
				rec[i].tot += rec[i].score[j];
			}

			//��� ���� �ϱ�
			rec[i].avg = rec[i].tot / 3.0;
		}
	}

	public void print() // ��� ���
	{
		ranking();
		//����
		System.out.println();
		

		//�л��Ѹ�� �ݺ� ��� ���� ����
		for (int i=0;i<rec.length ;i++ )
		{	
			
			// �̸� ���
			System.out.printf("%5s",rec[i].name);
			
			// ����( ����, ����, ����) �ݺ� ���	// �츮�� Record Ŭ���� ���鋚
			for (int j =0;j<3;j++ )				// �������� int[] score = new int[3]���� ����
				System.out.printf("%4d", rec[i].score[j]);
				
			//����, ��� ���
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			//check~
			// ���� ��� ���� �߰�~
			System.out.printf("%5d", rec[i].rank);

			//����
			System.out.println();
		}

	}
	// ���� ���� �޼ҵ� �߰�
	// ���� ���� �������� ���꿡 �ʿ��� ������ �̹� ����(tot) �� �Ű����� ����
	//  Record �迭�� rank �Ӽ� �ʱ�ȭ ��� ���� �� ��ȯ �ڷ��� void
	//  Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ���� �� private ���
	private void ranking()
	{
		// ��� �л����� ��� (���� , rank) �� 1�� �ʱ�ȭ
		for (int i=0;i<inwon ;i++ )
			rec[i].rank = 1;
		
		//��� ����													4���̶��
		for (int i =0;i<inwon-1 ;i++ )// --ū ����Ŭ �� �񱳱��� �� 0 1 2
		{
			for (int j=i+1;j<inwon ;j++ )//-- ��������Ŭ �� �񱳴��
			{
					
				if (rec[i].avg>rec[j].avg)	// �񱳱����� ����� �� ����� ��պ��� ũ�ٸ�
				{
					rec[j].rank++; // �� ����� rank �� 1��ŭ ����
				}
				else if (rec[j].avg> rec[i].avg) // �� ����� ����� �񱳱����� ��պ��� ũ�ٸ�
				{
					rec[i].rank++; // �� ������ rank �� 1��ŭ ����
				}
			}
		}
	}



}