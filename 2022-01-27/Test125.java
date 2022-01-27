/*============================
  ���� Ŭ���� ��� ����
==============================*/

// ��ø Ŭ����

//outer
class Test2
{
	static int a = 10;	// ��������, Test2�� �������, static����
	int b = 20;			// ��������, Test2�� �������, non-static����(instance ����)

	void write()	//�� ù ��° write() �޼ҵ�
	{
		System.out.println("write()...��");
		final int c = 20;//���� ����, ���ȭ�Ⱥ���(���� ������ �ʴ� ����)					
		int d = 40;		 //���� ����, ���� ���÷� ���� �� �ִ� ����
		
		//inner
		class LocalTest // �޼ҵ� �ȿ� ����� Ŭ���� (����Ŭ����)
		{
			void write() //�� �� ��° write() �޼ҵ�
			{
				System.out.println("write()...��");
				System.out.println("a : "+ a);
				System.out.println("b : "+ b);
				System.out.println("c : "+ c);
				//System.out.println("d : "+ d); // �����߻� ������ ����
				// d �� ��� �ٲ�� �����ε� ź�������� �ȴ� �ص�
				// d �� ��� ��Ƴ������� ?? c�� final�̶� �ٲ��� �����ϱ� ����
			}
		}
		// ��	���� c�� d �� �Ѵ� �������� ������..
		//		c�� final�����̱� ������
		//		�� ��° write() �޼ҵ忡�� ���� �����ϴ���
		//		������ ������ ��������� �ִ�.
		//		�ݸ鿡 d�� �� ���� ���÷� ������ �� �ִ� ��Ȳ�̹Ƿ�
		//		LocalTest Ŭ������ �ν��Ͻ� ���� ������
		//		������ ���� �� �� ���� ������
		//		�׷��ٸ� d�� � ���� ����ִ��� ���� ���� �� ���� ������
		//		���� d�� �����ϴ� ���� ���� �� �ֵ��� ���������� ó��
		//d = 10;
		//d -= 30;

		LocalTest lt = new LocalTest();
		lt.write();  // -- �ι�° write() �޼ҵ� ȣ��

		//d+=10;
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺο� �ٸ� Ŭ����
public class Test125
{
	public static void main(String[] args)
	{
		Test2 ob = new Test2();
		ob.write(); //-- ù ��° write �޼ҵ尡 ȣ��
	}
}
/*
write()...��
write()...��
a : 10
b : 20
c : 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/