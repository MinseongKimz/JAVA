/*=====================
  �����	�� ����
=======================*/

// �迭�� ���� ó��(�� Random Ŭ���� Ȱ��)

// ����ڷκ��� ������ ������ �Է¹޾�
// �� ������ ���� ��ŭ ����(1~100)�� �߻� ���Ѽ� �迭�� ���
// �迭�� ��� ������ �߿��� ���� ū���� ���� ����
// �����ؼ� ����� ����ϴ� ���α׷��� �����Ѵ�. 


// ���� ��)
// �߻���ų ������ ���� �Է� : 10
// 

import java.util.Scanner;
import java.util.Random;

public class Test097
{
	public static void main(String[] args)
	{	
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		//�ȳ� �޼��� ���
		System.out.print("�߻� ��ų ������ ���� �Է� : ");
		int size = sc.nextInt();
		// size ������ ��Ƴ� ����ŭ�� �迭�� �����
		// (�迭 ���� �� �޸� �Ҵ�)
		int[] arr = new int[size];

		// ������ ����(����)�� �߻���Ű�� ���ؼ��� 
		// ���� �߻� ���� ��ü�� �ʿ��ϴ�.
		// �� ��java.util.Random��
		// Random �ν��Ͻ� ����
		Random rd = new Random();

		// �� Random Ŭ������ ��nextInt()��
		// 0 ~ ���Ű������� �� �Ѱܹ��� ���� n-1 ������ ���� ������
		// ����(����) 1���� �߻� ��Ų��.
		//    rd.nextInt(10)       0~9 ���� �� 1���� ���� �߻�  

		for (int i=0;i<size;i++)
			arr[i] =rd.nextInt(100)+1; // 1~100	

		int max = arr[0];
		int min = arr[0];

		//--rd.nextInt(100) �� 0 ~ 99 ������ ������ ���� 1�� �߻�
		
		//�׽�Ʈ �� ������ �迭�� ��ü ��� ���
		/*
		for (int i=0;i<arr.length ;i++ )
			System.out.printf("%4d", arr[i]);
		System.out.println();
		*/

		for (int i =1 ;i<arr.length ; i++)
		{
			if (max<arr[i]) // ���� i ��° �迭�� �� ���� max ���� ũ�ٸ�
				max = arr[i]; //i ��° �迭�� �� ���� max�� ����
			if (min>arr[i])
				min = arr[i];
		}
		System.out.println("�߻��� ����");
		for (int i=0;i<arr.length ;i++ )
			System.out.printf("%d  ", arr[i]);
		System.out.println();
		System.out.printf("���� ū �� : %d , ���� ���� �� : %d\n",max,min);
	}
}

/*
�߻� ��ų ������ ���� �Է� : 6
�߻��� ����
17  13  6  59  97  65
���� ū �� : 97 , ���� ���� �� : 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/