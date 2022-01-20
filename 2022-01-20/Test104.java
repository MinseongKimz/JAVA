/*================================
  ���� Ŭ������ �ν��Ͻ� ����
==================================*/

// Ŭ������ �ν��Ͻ� Ȱ��
// 1~3 ������ ������ �߻����Ѽ�
// ���������� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�

// �� ���� ������ : �� 1: ����, 2: ����, 3: ��

// ���� ��)
// 1 : ����  2 : ����   3 : ��  �� �Է� (1~3) : 4
// 1 : ����  2 : ����   3 : ��  �� �Է� (1~3) : -1
// 1 : ����  2 : ����   3 : ��  �� �Է� (1~3) : 2

// - ����   : ����
// - ��ǻ�� : ��

// >> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�!!!

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	private int n;
	private int r;
	String[] rand = {"����", "����", "��"};
	
	// ����ڿ��� �Է� ����.
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print(" 1 : ����  2 : ����   3 : ��  �� �Է� (1~3) : ");
			n = sc.nextInt();
		}
		while (1>n || n>3);
	}

	// ����
	public void game()
	{
		Random rd = new Random();
		r = rd.nextInt(3) + 1;

		System.out.println();

		System.out.println("����    :  " +rand[n-1]);
		System.out.println("��ǻ��  :  " +rand[r-1]);

		System.out.println();

		if ((n==1&&r==3)||(n==2&&r==1)||(n==3&&r==2))
		{
			System.out.println(" >> �º� ���� ��� : ������ �̰���ϴ�!!!");
		}
		else if ((n==3&&r==1)||(n==1&&r==2)||(n==2&&r==3))
		{
			System.out.println(">> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�!!!");
		}
		else
		{
			System.out.println(">> �º� ���� ��� : �����ϴ�.!!!");
		}
	}

}

public class Test104
{
	public static void main(String[] args)
	{
		RpsGame rp = new RpsGame();
		rp.input();
		rp.game();
	}
}