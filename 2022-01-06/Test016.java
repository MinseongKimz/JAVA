/*===========================================
���� �ڹ� �⺻ ���α׷��� ����
=============================================*/
// ������ �ڷ���
// �ڹ��� �⺻ ����� : BufferedReader Ŭ����

//����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//�̸��� �Է��ϼ��� : 
// ���� ���� �Է�   :
// ���� ���� �Է�   : 
// ���� ���� �Է�   : 

//=====[���]===== 
//�̸� : 
//���� : 
//����Ϸ��� �ƹ� Ű�� ��������....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test016
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strName;
		int kos, ens, mats, tot; // �������� �������� �������� ����
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		strName = br.readLine();

		System.out.print("���� ���� �Է�   : ");
		kos = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է�   : ");
		ens = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է�   : ");
		mats = Integer.parseInt(br.readLine());
		
		tot = kos + ens + mats;

		System.out.println();
		System.out.println("=====[���]=====");
		System.out.printf(" �̸� : %s \n", strName);// String ����� %s!
		System.out.printf(" ���� : %d \n", tot);	

	}
}

/*
�̸��� �Է��ϼ��� : ��μ�
���� ���� �Է�   : 202
���� ���� �Է�   : 13
���� ���� �Է�   : 13

=====[���]=====
 �̸� : ��μ�
 ���� : 228
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/