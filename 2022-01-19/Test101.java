/*================================
  ���� Ŭ������ �ν��Ͻ� ����
==================================*/
 
// Ŭ���� ����
// �迭 Ȱ��
// �������������ڿ� ���� ����

// ����ڷκ��� ��, ��, ���� �Է� �޾�
// �ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
// �� �޷� Ŭ������ ������� �ʴ´�.
// ���� Ŭ������ ������ Ȱ���ؼ� �ۼ��� �� �ֵ��� �Ѵ�.(WeekDay Ŭ���� ����)
// �׸��� �迭�� ���䵵 ������Ѽ� �ۼ��Ѵ�..
// ���������������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������� WeekDay Ŭ���� ���踦 ����
// Test101 Ŭ������ main() �޼ҵ尡 ���������� ���α׷� ����� �� �ֵ��� �Ѵ�.

// �� 1�� 1�� 1�� �� ������ 

// ���� ��)
// �� �� �� �Է�(���� ����) : 2022 1 19
// 2022�� 1�� 19�� �� ������
// ����Ϸ��� �ƹ� Ű�� ��������.....

// �� �� �� �Է�(���� ����) : 2000 5 4
// 2000�� 5�� 4�� �� �����
// ����Ϸ��� �ƹ� Ű�� ��������.....

import java.util.Scanner;

class WeekDay
{
	private int year;
	private int month;
	private int date;
	private String what;

	//�Է� ����
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �� �Է�(���� ����) : ");
		year = sc.nextInt();
		month = sc.nextInt();
		date = sc.nextInt();
	}	

	// ��¥ ��� �޼ҵ�
	public String totDay()
	{
		int YearOfDay = 0;
		int MonthOfDay = 0;
		int tot;

		// �� ������ 
		for (int i=1;i<=year-1 ;i++)
		{
			if ((i%4==0 && i%100!=0)||i%400==0)
				YearOfDay += 366;
			else
				YearOfDay += 365;
		}
		int[] mon = {31,28,31,30,31,30,31,31,30,31,30,31};	

		// �� ������ 
		for (int i=0;i<(month-1) ;i++ )
		{	
			if ((year%4==0 && year%100!=0)||year%400==0)
				mon[1] = 29;
			MonthOfDay += mon[i];
		}
		//���� ���� ��
		tot = YearOfDay + MonthOfDay + date;
		
		//������ ���� ������
		int days = tot%7;
		
		switch (days)
		{
		case 1:
			what = "������"; break;
		case 2:
			what = "ȭ����"; break;
		case 3:
			what = "������"; break;
		case 4: 
			what = "�����"; break;
		case 5:
			what = "�ݿ���"; break;
		case 6:
			what = "�����"; break;
		case 0: 
			what = "�Ͽ���"; break;
		}
		return what;
	}

	// ��� �޼ҵ�
	public void write()
	{
		System.out.printf("%d�� %d�� %d�� �� %s\n", year, month, date, what);
	}
}

public class Test101
{
	public static void main(String[] args)
	{
		WeekDay ob1 = new WeekDay();
		ob1.input();
		ob1.totDay();
		ob1.write();		
	}
}
/*
�� �� �� �Է�(���� ����) : 1997 7 25
1997�� 7�� 25�� �� �ݿ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/