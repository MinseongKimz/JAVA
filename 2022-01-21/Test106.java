/*=================================================
  ���� �޼ҵ� �ߺ�����(Method Overloading) ����
===================================================*/

// Method Overloading�� ������ ���¿� �Ұ����� ����

public class Test106
{
	public static void main(String[] args)
	{
		
	}

	public static void print() {}
	//public static void print() {} �ƿ� �m���� �޼ҵ� �ߺ����� x
	public static void print(int i) {}
	//public static void print(int j) {} �Ű����� �̸��� �ٸ����� Ÿ�԰��� ���� ���� X
	public static void print(char c) {}	// �Ǳ�� �ѵ� �ڵ�����ȯ ��Ģ�� üũ����
	public static void print(int i, int j) {} // ���� ���� �ٸ� ����
	public static void print(double d) {} // Ÿ�� �޶� ���� 
	//public static void print(double e) {} {return 10.0;} ���̵� Ÿ�Կ��� ����X 

	//public static double print(double e) {return 10.0;} ��ȯ�Ѵ� �� �̷� ���·� �츰 �ٸ��� ��������
	// ���ο��� r = print(3.14); �ص� ���Կ����� �����ʸ��� ���� ������ ��� 
	// print(3.14) �� �ٸ��� ���� �����̶� 
	// ���� 20�������� �浹�� �Ͼ��..
}