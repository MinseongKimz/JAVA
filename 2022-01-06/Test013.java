/*===========================================
���� �ڹ� �⺻ ���α׷��� ����
=============================================*/
// ����
// ���簢���� ���̿� �ѷ��� ���ϴ� ���α׷��� �ۼ��Ѵ�.
// ����: 10, ����: 20

//���� ��) 
//���� : xxxx
//�ѷ� : xxxx
//����Ϸ��� �ƹ� Ű�� ��������....

public class Test013
{
	public static void main(String[] args)
	{
		//���� ����
		int width, vertical, area, length; // ���� ���� ���� �ѷ�
		width = 10;
		vertical = 20;

		//���� ó��
		area = width * vertical;
		length = (width + vertical) * 2;
        
		//��� ���
		System.out.println("���� :  " + area);
		System.out.println("�ѷ� :  " + length);

		
	}
}

/*
��� ���
���� :  200
�ѷ� :  60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/