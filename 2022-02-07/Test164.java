/*=====================================================
  ���� �÷��� �����ӿ�ũ (Collection Framework)����
=======================================================*/

// ���� �ڷᱸ�� ��ü ���� �� ���� ��
// ����� ���� Ŭ���� Ȱ��
// �� �ڷ���

import java.util.Vector;


// ����� ���� Ŭ���� ���� �� �ڷ���ó�� Ȱ��
class MyData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String name;	// �̸�	
	private int age;		// ����

	// getXxx() �� getter
	// setXxx() �� setter

	// getter / setter ����
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}


	// ������(�Ű����� 2���� ������) �� ����� ���� ������
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	//��	����� ���� �����ڰ� ������ ���
	//		default �����ڰ� �ڵ����� ���Ե��� �ʱ� ������
	//		default ������ ������ �����ڸ� ����� ���� �����ڷ�
	//		�߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//		(�� �ݵ�� �����ؾ� �� �ʿ�� ����)
	public MyData()
	{
		name = "";
		age = 0;
	}

}


public class Test164
{

	public static void main(String[] args)
	{
		Vector<MyData> v = new Vector<MyData>();

		// ���� �ڷ� ���� v�� 
		// ȫ���� 13��/ ������ 7��/ ������ 78�� ��Ƴ���

		MyData md1 = new MyData();
		//MyData md2 = new MyData("������", 7);
	
		MyData md3 = new MyData("������", 78);
		
		md1.setName("ȫ����");
		md1.setAge(13);

		v.add(md1);
		v.add(new MyData("������", 7));
		v.add(md3);

		// 1
		for (int i = 0;i<v.size() ;i++ )
			System.out.println("�̸� : "+v.elementAt(i).getName()+
							", ����: " + v.get(i).getAge() + "��");
		System.out.println();

		// 2
		for (MyData obj:v)
			System.out.printf("�̸� :%s, ���� :%d��\n",obj.getName(),obj.getAge());
		System.out.println();
		
		// 3
		for (Object temp: v)
			System.out.printf("�̸� :%s, ���� :%d��\n", ((MyData)temp).getName(), ((MyData)temp).getAge());
		System.out.println();
	}
}
/*
�̸� :ȫ����, ���� :13��
�̸� :������, ���� :7��
�̸� :������, ���� :78��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/