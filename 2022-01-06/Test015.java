/*===========================================
���� �ڹ� �⺻ ���α׷��� ����
=============================================*/

// ����
// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//�� �ﰢ���� ���� ���ϱ� ��
// - �ﰢ���� �غ� �Է� : 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// ����� ���� java.io Ŭ������   
//��� Ŭ�������� java.io �ȿ� �־ 
//import java.io.*; �� �����ϴ�. ������ �޸� ����..

public class Test015


{
	public static void main(String[] args) throws IOException // �̻��� �� �Է¹����� �������ϱ� ����. ������(Throw)
	{
		//Ű���� ����(����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//													��	      ����Ʈ��
		//							 	��		  ����Ʈ���� �����ؼ� 
		//		          ��	  ���ڿ� �ϼ�
		//	            br�� ����


		//���� ���� �� �ʱ�ȭ
		int length, height; // �غ��� ����
		double area;		// ����

		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");

		//�غ� ���� �ޱ�
		System.out.print("- �ﰢ���� �غ� �Է� : ");
		length = Integer.parseInt(br.readLine());
		// ���� �ޱ�
		System.out.print("- �ﰢ���� ���� �Է� : ");
		height = Integer.parseInt(br.readLine());

		
		// ����ó��
		area = (length * height) / 2.0;
		
		//���� ��� ���
		System.out.printfln();// ���� 

		System.out.printf("�غ��� %d, ���̰� %d�� �ﰢ���� ���� :  %.2f \n", length, height, area);
	}
}

/* ��� ���
�� �ﰢ���� ���� ���ϱ� ��
- �ﰢ���� �غ� �Է� : 3
- �ﰢ���� ���� �Է� : 3
�غ��� 3, ���̰� 3�� �ﰢ���� ���� :  4.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/