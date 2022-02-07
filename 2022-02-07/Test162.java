/*=====================================================
  ���� �÷��� �����ӿ�ũ (Collection Framework)����
=======================================================*/

import java.util.Vector;
import java.util.Collections;

public class Test162
{
	private static final String[] colors
	={ "����","���","�ʷ�","�Ķ�","����","����"};


	public static void main(String[] args)
	{
		// Vector(����) �ڷᱸ��  v ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v �� colors �迭 �����͸� ��ҷ� �߰�
		for (String color:colors )
		{
			v.add(color);
		}

		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("������ ��� : " + v.lastElement());
		System.out.println("����� ���� : " + v.size());

		/*
		ù ��° ��� : ����
		�� ��° ��� : ���
		������ ��� : ����
		����� ���� : 6
		*/
		
		// ù ��° ��Ҹ� "�Ͼ�"���� ����! �� set()
		v.set(0, "�Ͼ�" );
		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("����� ���� : " + v.size());
		/*
		ù ��° ��� : �Ͼ�
		�� ��° ��� : ���
		����� ���� : 6
		*/            // ������ ���� ù ��Ҵ� �������� �Ͼ����� �ٲ�
					  // ����� ������ ���� ������ ���� �о�� �ʰ� ����� �� set().

		// ù ��° ��ҿ� "��Ȳ �߰�" �� insertElementAt()
		v.insertElementAt("��Ȳ", 0);



		// ��ü ���
		System.out.print("��ü ��� : " );
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();
		//��ü ��� : �Ͼ� ��� �ʷ� �Ķ� ���� ����
		//��ü ��� : ��Ȳ �Ͼ� ��� �ʷ� �Ķ� ���� ���� (50��° �� �߰�)
		

		// �������� ����
		Collections.sort(v);

		System.out.print("�������� ���� �� ��ü ��� : ");

		for	(String str : v)
			System.out.print(str + " ");
		System.out.println();

		//�������� ���� �� ��ü ��� : ��� ���� ���� �ʷ� �Ķ� �Ͼ�
		//�������� ���� �� ��ü ��� : ��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ� (50��° �� �߰�)
		
		
		// �˻� 
		// Collections.binartSearch();
		// �˻� ��� ����.
		// ��, �������� ������ ����Ǿ� �ִ� �ڷῡ ���ؼ��� ��밡�� !!!
		// �˻� ����� �������� ���� ��� ������ ��ȯ�Ѵ�.

		int idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		System.out.println();
		//�Ķ� : 4 ��° �ε����� ��ġ�ϰ� �ִ�.
		//�Ķ� : 5 ��° �ε����� ��ġ�ϰ� �ִ�.(50 ��° �� �߰�)
		

		int idxNavi = Collections.binarySearch(v, "����");
		System.out.printf("���� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxNavi);
		System.out.println();
		// ���� : -1 ��° �ε����� ��ġ�ϰ� �ִ�. �� �˻� ��� ����!!

		// �������� ����
		Collections.sort(v, Collections.reverseOrder());

		// �������� ���� �� ��ü ���
		System.out.print("�������� ���� �� ��ü ��� : ");
		for (String str: v)
			System.out.print(str + " ");
		System.out.println("\n");
		//�������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���

		// �� �������� ���� �� �˻� �׽�Ʈ
		idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		System.out.println();
		// �Ķ� : -8 ��° �ε����� ��ġ�ϰ� �ִ�. �� �˻���� ���� (error)
		
		idxBlue = Collections.binarySearch(v, "�Ķ�", Collections.reverseOrder());
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		System.out.println();
		//�Ķ� : 1 ��° �ε����� ��ġ�ϰ� �ִ�. (.��ġ�Ҷ� �ٽ� ������ �ݴ�� ��)

	}				 
}
/*
ù ��° ��� : ����
�� ��° ��� : ���
������ ��� : ����
����� ���� : 6
ù ��° ��� : �Ͼ�
�� ��° ��� : ���
����� ���� : 6
��ü ��� : ��Ȳ �Ͼ� ��� �ʷ� �Ķ� ���� ����
�������� ���� �� ��ü ��� : ��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ�
�Ķ� : 5 ��° �ε����� ��ġ�ϰ� �ִ�.

���� : -1 ��° �ε����� ��ġ�ϰ� �ִ�.

�������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���

�Ķ� : -8 ��° �ε����� ��ġ�ϰ� �ִ�.

�Ķ� : 1 ��° �ε����� ��ġ�ϰ� �ִ�.

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/