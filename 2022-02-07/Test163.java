/*=====================================================
  ���� �÷��� �����ӿ�ũ (Collection Framework)����
=======================================================*/

// Vector �˻� �� ���� 

import java.util.Vector;

public class Test163
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
	={ "����","���","�ʷ�","�Ķ�","����","����"};
	
	public static void main(String[] args)
	{
		// Vector(����) �ڷᱸ��  v ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v�� colors �迭 �����͸� ��ҷ� �߰�
		for (String color : colors )
			v.add(color);

		// ���� �ڷᱸ�� v�� ��ü ��� ���
		System.out.print("��ü ��� ��� : ");
		for (String str : v )
			System.out.print(str + " ");
		System.out.println();
		// ��ü ��� ��� : ���� ��� �ʷ� �Ķ� ���� ����

		String s1 = "��ȫ";

		int i = v.indexOf(s1);
		System.out.println(s1 + "��  index ��ġ : " + i);
		System.out.println();
		//��ȫ��  index ��ġ : -1

		String s2 = "���";
		
		// contains()
		// v.contains(s)
		//-- ���� �ڷᱸ�� v�� ã���� �ϴ� s �� ���ԵǾ� �ִٸ�...
		//   �� index ��ġ Ȯ��

		if (v.contains(s2)) // ���ԉ�� �� Ȯ�� �޼ҵ�
		{
			i = v.indexOf(s2);
			System.out.println(s2+ "��  index ��ġ : " + i );
			// �����  index ��ġ : 1

			// �켱 ���� �ڵ带 ���� ã��..
			// ã������ �����϶� 
			v.remove(i);
		}

		// ã�Ƽ� ������ �� ��ü ��� ���
		System.out.print("���� �� ��ü ��� ��� : ");
		for (String str : v )
			System.out.print(str + " ");
		System.out.println();
		//���� �� ��ü ��� ��� : ���� �ʷ� �Ķ� ���� ����
	
		// �߰� ���� ����
		System.out.println(colors);
		//[Ljava.lang.String;@15db9742

		System.out.println(v);
		//[����, �ʷ�, �Ķ�, ����, ����] �� Ȯ�ο� ���̵�����
		
		//��	Ȯ�ο� ���̵����ʹ� 
		//		���� ���(������)�� �ƴϱ� ������
		//		�̸� Ȱ���Ͽ� ������ �����ϰ� ó���ؼ��� �ȵȴ�!!! 

	}
}