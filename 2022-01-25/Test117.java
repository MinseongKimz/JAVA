/*============================
  ���� Ŭ���� ��� ����
==============================*/

// �߻� Ŭ���� (Abstract)

/*
��	�߻� Ŭ���� (Abstract)��

	���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
	���� Ŭ�������� �������̵�(Overrriding)�� ������ ����Ǵ� �޼ҵ忡 ����
	�޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����..

��	���� �� ����
	[��������������] abstract class Ŭ������
	{
		[��������������] abstract �ڷ��� �޼ҵ��([�Ű�����]....);
	}

��	Ư¡
	Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
	�� Ŭ������ Ŭ���� �տ� ��abstract�� Ű���带 ����
	�߻� Ŭ������ ����ؾ� �ϸ�
	�߻� Ŭ������ ������ ��쿡��
	�ҿ����� ������ Ŭ���� �̹Ƿ� ��ü�� ������ �� ����.
	�߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ���� ������
	��ü�� ������ �� ���� ���̴�

	��, �߻� Ŭ������ ���������� ������ �� ���� ������
	����� ���ؼ��� �����ϸ�
	�߻� Ŭ�������� ��ӹ��� ���� Ŭ����������
	�ݵ�� �߻� �޼ҵ带 �������̵�(Overriding) �ؾ� �Ѵ�.

��	��abstract�� Ű�����
	Ŭ������ �޼ҵ忡���� ����� �� ������
	��� ������ ���� ���������� ��� �Ұ��� �ϴ�.


*/ 
// �߻� Ŭ����
abstract class SortInt117
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	// �߻� �޼ҵ�
	protected abstract void sorting();
	// ���� �˰����� �����ϱ� 
	// ����� ���� �˰����� ���� �Ҳ���� ��ȹ�� ����
	// ����� ���ϸ� �� ������ �������.


	protected int dataLength()
	{
		return value.length;
	}

	// ��final�� Ű����� ����
	// �� Ŭ����(SortInt117)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������ (Method Overriding) �� �� ����.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
		{
			return 0;
		}
		else if (x>y)
		{
			return 1;
		}
		else 
			return -1;
	}
	
	// ��final�� Ű����� ����
	// �� Ŭ����(SortInt117)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������ (Method Overriding) �� �� ����.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}
//public class abstract Test117 extends SortInt117 // �ϴ��� �߻� Ŭ������
public class Test117 extends SortInt117 
{

	/* �������� �͵�..
	protected void sort(int[] value) 
	{
		this.value = value;
		sorting();
	}

	// �߻� �޼ҵ�
	protected abstract void sorting();
	// ���� �˰����� �����ϱ� 
	// ����� ���� �˰����� ���� �Ҳ���� ��ȹ�� ����
	// ����� ���ϸ� �� ������ �������.

	protected int dataLength()
	{
		return value.length;
	}

	protected final int compare(int i, int j) // ũ�� �� �޼ҵ�
	{
		int x = value[i];
		int y = value[j];

		if (x==y)
		{
			return 0;
		}
		else if (x>y)
		{
			return 1;
		}
		else 
			return -1;
	}

	protected final void swap(int i, int j) // �ڸ��ٲ� �޼ҵ�
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
		
	*/	
	//protected abstract void sorting(); 
	//�̳��� �ذ��ϸ� �������� Ŭ������ �� �� �ִ�.

	int i, j;

	static int[] data = {7, 10, 3, 8, 7};

	
	@Override
	protected void sorting()
	{
		//System.out.println("�迭���� : " + dataLength()); 
		// ==> 5
		/*

		// ���� ����
		for (int i =0;i<dataLength()-1 ;i++ )// swap�� �������� �� ó�� ���� 
		{
			for (int j=i+1;j<dataLength() ;j++ ) // �׷��� ���� Test109ó�� ����
			{
				if (compare(i,j)==1)
					swap(i,j);
			}
		}*/

		// ���� ���� 
		for (int i=1;i<dataLength() ;i++ )
		{
			for (int j =0;j<dataLength()-i ;j++ )
			{
				if (compare(j,j+1)==1)
				{
					swap(j,j+1);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for (int n: data )
			System.out.print(n + " ");
		System.out.println();
		

		Test117 ob = new Test117();
		ob.sort(data);
	
		System.out.print("Sorted Data : ");
		for (int n: data )
			System.out.print(n + " ");
		System.out.println();

		
	}
	
}