/*=====================================================
  ���� �÷��� �����ӿ�ũ (Collection Framework)����
=======================================================*/

// Map �� Hashtable, HashMap
// - java.util.Map �������̽���
//   Ű(key)�� ��(value)�� ����(mapping)�ϸ�
//	 ������ Ű�� ����� �� ����, �����ؾ� �ϸ�,
//   �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
//   ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.

/*
��	Hashtable<K, V> Ŭ����
	
	- �ؽ����̺� ������ ��ü �𵨸��� Ŭ������
	  �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.
	
	- �ؽ����̺��̶� Ű(key)�� �׿� �����ϴ� ������(value)��
	  ���е� ������ �����̴�.

	- �����͸� �����ϰ�, �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ�
	  �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.

	- ����, Hashtable Ŭ������ key �Ǵ� value �� ������ null�� ������� �ʴ´�.
*/

import java.util.Hashtable;
public class Test172
{
	private static final String[] names
	 = {"�̿���", "��ȣ��", "������", "��μ�", "�ֹ���", "�̽ÿ�"};

	private static final String[] tels
	 ={"010-5434-4334", "010-1234-1234" ,"010-2345-2345" ,"010-5153-6322" ,"010-2345-5432" ,"010-3333-3333"	};

	public static void main(String[] args)
	{
		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> ht = new  Hashtable<String, String>();

		//ht��� Hashtable �ڷᱸ���� �迭(names, tels)�� ����ִ�
		// �����͸� ��ҷ� ��Ƴ���
		// �� put(k, v);
		for (int i=0;i<names.length ;i++ )
		{
			ht.put(names[i], tels[i]);
		}

		// ht ��� Hashtable �� ���� ... key�� �̿��Ͽ� �˻�
		// �� get(k)
		String findName1 = "������";
		String str = ht.get(findName1);

		if (str != null)
			System.out.println(findName1 + " ��ȭ��ȣ : " + str);
		System.out.println();
		//--==>> ������ ��ȭ��ȣ : 010-2345-2345
		
		// ht ��� Hashtable �ڷᱸ����.. key�� �����ϴ��� ���� Ȯ��
		// �� containsKey();
		String findName2 = "�̾Ƹ�";
		if (ht.containsKey(findName2))
			System.out.println(findName2+ " �����Ͱ� �����մϴ�." );
		else 
			System.out.println(findName2+ " �����Ͱ� �������� �ʽ��ϴ�." );
		System.out.println();
		//--==>> �̾Ƹ� �����Ͱ� �������� �ʽ��ϴ�.

		String findName3 = "�ֹ���";
		if (ht.containsKey(findName3))
			System.out.println(findName3+ " �����Ͱ� �����մϴ�." );
		else 
			System.out.println(findName3+ " �����Ͱ� �������� �ʽ��ϴ�." );
		System.out.println();
		//--==>> �ֹ��� �����Ͱ� �����մϴ�.

		// ht ��� Hashtable �� ���� ... value�� �����ϴ��� ���� Ȯ��
		// �� contains()
		String findTel1 = "010-5153-6322";
		if (ht.contains(findTel1))
			System.out.println(findTel1+ " �����Ͱ� �����մϴ�." );
		else 
			System.out.println(findTel1+ " �����Ͱ� �������� �ʽ��ϴ�." );
		System.out.println();
		//--==>> 010-5153-6322 �����Ͱ� �����մϴ�.
		
		// ht ��� Hashtable �ڷᱸ������ ����μ��� ������ ����
		// ��remove()
		ht.remove("��μ�");
		//-- ��remove()�� �޼ҵ�� ���ڰ����� key�� �Ѱܹ�����
		//    �̶�, key�� �����Ǵ� ���� �ƴ϶�
		//	  �ش� key�� ����Ǿ� �ִ� value�� �Բ� remove�ȴ�.

		// ����(remove())���� key �����ϴ��� Ȯ��.
		if (ht.containsKey("��μ�"))
			System.out.println("�μ��̰� �����մϴ�." );
		else 
			System.out.println("�μ��� ��𰬾� ?" );
		System.out.println();
		//--==>> �μ��� ��𰬾� ?

		// ����(remove()) ���� value() �� ���� ���� Ȯ��
		if (ht.contains("010-5154-6322"))
			System.out.println("010-5154-6322 �����Ͱ� �����մϴ�." );
		else 
			System.out.println("010-5154-6322 �����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==> 010-5154-6322 �����Ͱ� �������� �ʽ��ϴ�.

		// �� null ���� ó��
		//ht.put(null, null);
		// ��Ÿ�� ���� �� NullPointerException
		//ht.put("ȫ����", null);				//key�� ���� ������ value�� null�̶� ����
		// ��Ÿ�� ���� �� NullPointerException
		//ht.put(null, "010-0000-0000");		//value�� ���� ������ key�� null�̶� ����
		// ��Ÿ�� ���� �� NullPointerException

		//�ߺ��� key �Է�
		ht.put("�̿���", "010-1111-1111");

		System.out.println(ht.get("�̿���"));
		System.out.println();
		//010-1111-1111
		//-- ���� 010-5434-4334 ���� 010-1111-1111 �� ����Ǿ���.
		//   (����� ����) key�� ������ ��������!

		//�ߺ��� value �Է�
		ht.put("������", "010-2345-5432");

		System.out.println(ht.get("�ֹ���"));
		System.out.println(ht.get("������"));
		//--==>> 010-2345-5432
		//		 010-2345-5432

		// �� value �� �ߺ��� ���� �ԷµǾ �⺻ �����Ϳ� �ƹ��� ������ ��ġ�� ����.

	}
}