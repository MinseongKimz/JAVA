// ���� Ǭ Ǯ��


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test146_1 
{
	public static void main(String[] args) 
	{
		// Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar now = Calendar.getInstance();

		//�ֿ� ���� ����
		int nalsu;
		int y, m, d, w;
		String[] week = {"��","��","ȭ","��","��","��","��"};

		//������ �� �� �� ���� Ȯ��(�������� get()�޼ҵ�)
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		//������ ��, ��, ��, ���� Ȯ�� ��� ���
		System.out.println("���� ��¥ : " + y +"-"+ m +"-" + d +" " + week[w-1]+"����" );

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);	

		// check~!!!
		now.add(Calendar.DATE, nalsu);

		//��� ���
		System.out.println();
		System.out.println("========[Ȯ�� ���]==========");
		System.out.printf("%d�� �� : %tF %tA \n", nalsu, now, now);
							// %tF : ��¥�� ǥ������(��ü �ֱ�)
							// %tA : ������ ǥ������            ---check!!
		System.out.println("=============================");
	}
}
/*
���� ��¥ : 2022-2-3 �����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

========[Ȯ�� ���]==========
200�� �� : 2022-08-22 ������
=============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/