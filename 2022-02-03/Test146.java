/*=================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===================================*/

// Calendar Ŭ����

// ��	�ǽ� ����
//		������ �������� �Է¹��� ��¥��ŭ ���� ��, ��, ��, ������
//		Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//	�� ���� ��¥�� ������ �� �� ���ϴ� ���� �޼ҵ�

// ���� ��)
// ���� ��¥ : 2022-2-3 �����
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

//========[Ȯ�� ���]==========
// 200�� �� : xxxx-xx-xx x����
//=============================
//����Ͻ÷��� �ƹ�Ű�� ��������...


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test146
{
	String Week(int w) // ���� �޾Ƽ� 
	{
		String week = "";
		switch (w)
		{
		case Calendar.SUNDAY: week = "�Ͽ���"; break;		// �� case 1 : week = "�Ͽ���"; break;
		case Calendar.MONDAY: week = "������"; break;		// �� case 2 : week = "������"; break;
		case Calendar.TUESDAY: week = "ȭ����"; break;		// �� case 3 : week = "ȭ����"; break;
		case Calendar.WEDNESDAY: week = "������"; break;	//              :
		case Calendar.THURSDAY: week = "�����"; break;		//				:
		case Calendar.FRIDAY: week = "�ݿ���"; break;
		case Calendar.SATURDAY: week = "�����"; break;		// �� case 7 : week = "�����"; break;		
		}
		return week; // ���ڿ� ������ ����
	}

	public static void main(String[] args) throws IOException
	{
		Test146 wk = new Test146(); // Week �޼ҵ� �������� �ν��Ͻ� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Calendar ob = new GregorianCalendar();

		int w = ob.get(Calendar.DAY_OF_WEEK);

		String week = wk.Week(w); // 
	
		System.out.printf("���� ��¥ : %4d-%d-%d %s\n",ob.get(Calendar.YEAR), 
			ob.get(Calendar.MONTH)+1, ob.get(Calendar.DATE), week);

		int num;

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num<=0);	
		
		ob.add(Calendar.DATE, num); // ��¥ �����ִ� �޼ҵ� add();

		w = ob.get(Calendar.DAY_OF_WEEK); // �� �ʱ�ȭ

		week = wk.Week(w); 
		System.out.println();
		System.out.println("========[Ȯ�� ���]==========");

		System.out.printf("%d�� �� : %4d-%d-%d %s\n", num ,ob.get(Calendar.YEAR), 
			ob.get(Calendar.MONTH)+1, ob.get(Calendar.DATE), week);

		System.out.println("=============================");
	}
}

/*
���� ��¥ : 2022-2-3 �����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

========[Ȯ�� ���]==========
200�� �� : 2022-8-22 ������
=============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/