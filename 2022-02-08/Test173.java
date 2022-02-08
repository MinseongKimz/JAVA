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
��	HashMap<K, V> Ŭ����
	
	- HashtableŬ������ ���������� Map �������̽����� ��ӹ���
	  HashMap Ŭ������ ����� Hashtable�� ����������
	  Synchronization �� ���� ������ ���ü� ������ ���ٸ�
	  (��, ��Ƽ ������ ���α׷��� �ƴ� �����)
	  HashMap�� ����ϴ� ���� ������ ����ų �� �ִ�.

	- ����, HashMap�� Hashtable Ŭ������ �޸� null�� ����Ѵ�.
*/


import java.util.HashMap;
import java.util.Map;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test173
{
	public static void main(String[] args) throws IOException
	{

		//HashMap �ڷᱸ�� �ν��Ͻ� ����
		//HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>(); // ���� ���� ����(��ĳ����)

		// map �̶�� �ؽø� �ڷᱸ���� ��� �߰�
		// -> put()
		map.put("���","���¿�Ŭ��");
		map.put("��ȭ","�����̴���");
		map.put("��ȭ","������ũ");

		// ���� Ȯ��
		System.out.println(map);
		//--==>> {���=���¿�Ŭ��, ��ȭ=�����̴���, ��ȭ=������ũ}

		// null �Է� �õ�
		map.put(null, null);
		map.put("�Ҽ�", null);
		map.put(null,"�����ϴ»��");
		//-- ���� ������ �Է� ������ ���� ��� ������ ������ �Է��� ����������
		//   ������ null �� key�� ���ε� "�����ϴ»��"��
		//   ���� null��(����ȣ 48) key�� �����ϴ� null�� ����� ��Ȳ�� �߻��ϰ� �ȴ�.
		//   ��, HashMap �� null�� �ϳ��� ������ key ������ �����Ѵ�.(�ν��Ѵ�.)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : " );
		String[] temp;

		for (String str;  ((str=br.readLine()) != null);)
		{
			temp = str.split(",");
			if (temp.length<2)
			{
				System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : " );
			}

			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);
		}
	}
}
/*
{���=���¿�Ŭ��, ��ȭ=�����̴���, ��ȭ=������ũ}
ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : �Ҽ�, �˿� ��
{null=�����ϴ»��, �Ҽ�=�˿� ��, ���=���¿�Ŭ��, ��ȭ=�����̴���, ��ȭ=������ũ}
,�ȳ�
{null=�����ϴ»��, �Ҽ�=�˿� ��, =�ȳ�, ���=���¿�Ŭ��, ��ȭ=�����̴���, ��ȭ=������ũ}
���,��¡�����
{null=�����ϴ»��, �Ҽ�=�˿� ��, =�ȳ�, ���=��¡�����, ��ȭ=�����̴���, ��ȭ=������ũ}

*/