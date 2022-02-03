/*=================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===================================*/

// Calendar Ŭ����

/*
��	java.util.Calendar Ŭ������
	��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
	��, ��, ��, ����, ��, ��, �� ������
	�ð��� ��¥�� ���õ� ������ �����Ѵ�.
	�׸���, Calendar Ŭ������ �߻� Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
	�������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
	GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

	�ý������κ��� ���� �ý��� �ð� ������ ���� ��
	getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
	������ Calendar Ŭ������ ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
	�� ��ü�� �����Ǹ� �����ִ� �ð� ��������
	get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) ���ִ�.

	getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
	�����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
	���� ���� �ִ�.
*/

// ��	�ǽ� ����
//		����ڷκ��� ��, ���� �Է¹޾�
//		�޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//		��, ����޷��� �ƴ϶� Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� �Է� : 0
// ���� �Է� : 2022
// �� �Է�   : -2 
// �� �Է�   : 16
// �� �Է�   : 7
/*
	   [2022�� 7��]

��	��	ȭ	��	��	��	��	
===========================
					 1	 2
 3	 4	 5	 6	 7	 8	 9
10	11	12	13	14	15	16	
17	18	19	20	21	22	23
24	25	26	27	28	29	30
31
============================
*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test145
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y, m;


		do
		{
			System.out.print("���� �Է� : ");
			y  = Integer.parseInt(br.readLine());
		}
		while (y<=0); // ���� 0 ���� ��� ����

		do
		{
			System.out.print("�� �Է� : ");
			m  = Integer.parseInt(br.readLine());
		}
		while (0>=m || m>=13); // �� ���� 

		Calendar ob = new GregorianCalendar(); // GregorianCalendar Ŭ���� ��� �ν��Ͻ� ���� 
											   // ��ĳ����


		//��¥ ����
		ob.set(y,m-1,1); // y�� m�� 1�� ���� �޷� ��� (m�� index�̱� ������ -1)

		int start = ob.get(Calendar.DAY_OF_WEEK); // ������
												// �Է°� 2022�� 2��
		//int end = ob.getMaximum(Calendar.MONTH);  // 11 ��� (index 0���� ����)
		//int end = ob.getMaximum(Calendar.DATE);  // 31 ��� (��� ���� �ִ� 31)
		int end = ob.getActualMaximum(Calendar.DATE);  //28 ���
		//int end = ob.getLeastMaximum(Calendar.DATE);// 28���


		//System.out.println(end); //�׽�Ʈ
		//System.out.println(start); //�׽�Ʈ
		
		
		System.out.println();
		System.out.printf("     [ %d�� %d�� ]\n",y,m);
		System.out.println(" �� �� ȭ �� �� �� �� ");
		System.out.println("======================");

		for (int i=0;i<start-1 ;i++ ) // 
		{
			System.out.print("   ");// ���缭
		}

		for (int i=1;i<=end;i++ )// 1 ~ �޹迭 ������ ������ 
		{
			System.out.printf("%3d",i); // ���� ���
						
			if (start%7==0)					
				System.out.println(); //���� 
			start++;
		}
		if (start%7!=1)  //end%7==0 �̰͵� ��			//2022 �� 4�� �־�� ��
			System.out.println();						//����޷¶��� 0 �̿��µ� �׷��� �ȵ�.
		System.out.println("======================");	//���⼱ �Ͽ����� 1��
	}
}
/*
���� �Է� : 2022
�� �Է� : 2

     [ 2022�� 2�� ]
 �� �� ȭ �� �� �� ��
======================
        1  2  3  4  5
  6  7  8  9 10 11 12
 13 14 15 16 17 18 19
 20 21 22 23 24 25 26
 27 28
======================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/