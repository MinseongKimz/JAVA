/*==========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
============================================*/
// �ݺ���(while) �ǽ�

// ����ڷκ��� ������ ������ �Է� �޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ� 
// ����� ����ϴ� ���α׷��� �����.
// 1�� �Ҽ� �ƴ�

// ���� �� ) 
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�

// ������ ���� �Է� : 11
// 11 �� �Ҽ�

//�ؼ����ð� ���� Ǭ Ǯ��.(Test053�� ���� ǬǮ��)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053_2
{	
	//�ֿ� ���� ����

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int num; // ������� �Է°��� ��Ƴ� ����
	int n = 2; //�Է°��� ������� ������ ������ ������ ����
			   //2���� 1�� ���� �Է°�-1 ���� �����ϸ鼭 ����
			   //ex) �Է°� 27 > n : 2 3 4 5 ... 26


	//���� �� ó��
	System.out.print("������ ���� �Է� : ");
	num = Integer.parsInt(br.readLine());

	boolean flag = true; // num�� �Ҽ��� ���̴� ��� �÷��׸� ����. 

	while (n<num)
	{
		// n���� num�� ������ ���������� Ȯ��.
		if (num%n==0)
		{
			//�Ҽ� �ƴϴ�.
			flag = false; //num�� �Ҽ� �ƴϴ�.
			break; //����� (�׸��� ����������)
		}

		n++;
	}

	//��� ��� (������� Ȯ���� �͡� num���� 1���� �ƴ��� Ȯ��)
	if (flag && num!=1)
	{
		System.out.printf("%d�� �Ҽ�\n",num);
	}
	else 
	{
		System.out.printf("%d�� �Ҽ� �ƴ�\n",num);
	}

	












}