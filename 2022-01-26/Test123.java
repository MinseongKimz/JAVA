/*============================
  ���� Ŭ���� ��� ����
==============================*/

// �������̽�(Interface)

//�� �ǽ� ����
// ���� ó�� ���α׷��� �����Ѵ�.
// ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2280946 ��μ�
// ���� ���� ���� ���� �Է� (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2290847 ��μ�2
// ���� ���� ���� ���� �Է� (���� ����) : 85 70 65

// 2280946 ��μ�	90 100 85	����xxx   ���xxxx
//					��  �� �� 
// 2290847 ��μ�2	85  70 65	����xxx	  ���xxxx
//					��  �� ��
// ����Ϸ��� �ƹ� Ű�� ��������...

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��

import java.util.Scanner;

class Record
{
	String hak, name; // �й� �̸�
	int kor, eng, mat;
	int tot, avg;	  // ���� ���
}

interface Sungjuk
{
	public void set();		//�ο� ����
	public void input();	//������ �Է�
	public void print();	//��� ���
}

// ���� �ذ� �����ؼ� ���� �ؾ� �� Ŭ���� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk 
{
	private int inwon;
	private Record[] rec;// Record �迭 (�л� �Ѹ�� Record �迭 �� �Ѱ� Ȱ��)
						 // Record ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭

	@Override
	public void set() //�ο� ���� �޼ҵ� ������ 
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);

		rec = new Record[inwon];
	}

	@Override
	public void input() // ������ �Է� �޼ҵ� ������
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0;i<inwon ;i++ )
		{
			// Record Ŭ���� ����� �ν��Ͻ� ����
			rec[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����): ", (i+1)); 
			rec[i].hak = sc.next(); // �й�
			rec[i].name = sc.next(); // �̸�

			System.out.print("���� ���� ���� ���� �Է� (���� ����) : "); 
			rec[i].kor = sc.nextInt(); // ���� ����
			rec[i].eng = sc.nextInt(); // ���� ����
			rec[i].mat = sc.nextInt(); // ���� ����

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3;
		}
	}

	@Override
	public void print() //��� ��� �޼ҵ� ������
	{
		System.out.println(); // ���� 

		for (int i=0;i<rec.length ;i++ ) //�Է¹��� �ο� ��ŭ
		{
			System.out.printf("%7s %5s	",rec[i].hak,rec[i].name); //�й��� �̸� ���
			System.out.printf("%3d %3d %3d   %3d %3d\n", rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg); // ������ ���

			System.out.print("                         "); // �� �� �� ���缭 �� �� �� �ؿ� �ְ� ������ϴ�..
			System.out.printf("%s %2s %2s\n",panjung(rec[i].kor),panjung(rec[i].eng),panjung(rec[i].mat));
			// panjung �޼ҵ忡 �� �������� ������ ���ϰ��� ����ϸ� �Ǵ°Ŷ� �̷��� �ۼ�
		}
	}

	// ���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score) // ���� �޾Ƽ� 
	{
			String grade; // ��� ��Ƽ� �������� ������ ���ڿ�

			switch (score%10) // ���� ������ 10 �ؼ� ���ڸ��� ..
			{	
				case 10: case 9: grade = "��"; break; //100~90 = ��

					case 8: grade ="��"; break;

					case 7: grade = "��"; break;

					case 6: grade = "��"; break;

					default: grade ="��"; break; //60�� �Ʒ� �� 
			}
			return grade;	
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test123
{
	public static void main(String[] args)
	{
		  Sungjuk ob = new SungjukImpl();
		 //SungjukImpl ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob����

		ob.set();
		ob.input();
		ob.print();
	}
}