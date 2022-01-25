/*============================
  ���� Ŭ���� ��� ����
==============================*/

// ���(Inheritance)

/*
��	�޼ҵ� �������̵�(Method Overriding) �� Ư¡

	�޼ҵ� �̸�, ���� Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ �ؾ��Ѵ�.
	�ݵ�� ��� ���谡 �־�� �Ѵ�.

	�����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ� 
	���� Ŭ������ �޼ҵ� �������������� ���� ������ ũ�ų� ���ƾ� �Ѵ�.

	���� ���, ���� Ŭ���� �޼ҵ��� ���� ���������ڰ� ��protected���� ���
	���� Ŭ������ �� �޼ҵ带 �������̵� �ϴ� ���
	�������� �����ڴ� ��protected���Ǵ¡�public���̾�� �Ѵ�.

	��static����final����private�� �޼ҵ�� �������̵� �Ҽ� ����.

	Exception�� �߰��� �Ұ����ϴ�.
	��, ���� �޼ҵ尡 ������ �ִ� ���� ���ܻ��׿� 
	���ο� Exception�� �߰��ϴ� ���� �Ұ��� �ϴٴ� ���̴�.

*/

// �θ� Ŭ����
class SuperTest116
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
}

// �ڽ� Ŭ����
class SubTest116 extends SuperTest116
{

	/*
	//private int a = 5; ������ 
	protected int b = 10; // ����
	public int c = 20; // ����

	public void write() // ����
	{
		System.out.println("Super write() �޼ҵ� : " + a + ":" + b + ":" + c);
	}
	
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.println("Super write() �޼ҵ� : " + a + ":" + b + ":" + c);
		// ����Ŭ����116���� ������ a���� ������ �� ����
		// private a �̴ϱ�..
		System.out.println("Sub write() �޼ҵ� : " + b + " : " + c);//==>Sub write() �޼ҵ� : 100 : 20

		//System.out.println("Sub write() �޼ҵ� : " + b);  // 100
		//System.out.println("Sub write() �޼ҵ� : " + this.b);//100
		//System.out.println("Sub write() �޼ҵ� : " + super.b); //==> Sub write() �޼ҵ� : 10
		// �� ���� b�� ���� ����� ���� �ٸ� b�� ���� �� ����� �̷�� ����.

		// ���� Ŭ�������� ������ b�� ���� Ŭ�������� ������ b �����ؼ� �� �� �ִ�.

		//System.out.println("Sub write() �޼ҵ� : " + c);  // 20 
		//System.out.println("Sub write() �޼ҵ� : " + this.c); // ? 20���´�
		//System.out.println("Sub write() �޼ҵ� : " + super.c); // 20
		// c�� ���� Ŭ�������� ���� ������ ���� ���� ������
		// this�� super�� �׳� c�� �� �������� c�̴�.

	}
	@Override 
	public void write()
	{
		//System.out.println("Sub write() �޼ҵ� : " + a + " : " + b + " : " + c); 
		// ����Ŭ�������� �����a �� private �̱� ������ ����
		System.out.println("Sub write() �޼ҵ� : " + b + " : " + c);
	}

}


public class Test116
{
	
	public static void main(String[] args)
	{

		// �ڽ� Ŭ����(SubTest116) ��� �ν��Ͻ� ����
		SubTest116 ob = new SubTest116();
		ob.print();
		//==>Sub write() �޼ҵ� : 100 : 20
		ob.write();
		// �θ�� ���� �������� write()�޼ҵ� >>Super write() �޼ҵ� : 5 : 10 : 20 
		// Overriding >> Sub write() �޼ҵ� : 100 : 20

		System.out.println("---------------------------------------------"); 
		System.out.println(ob.b);   // 100 

		System.out.println(((SuperTest116)ob).b);
		// 10 ?!            --------------
		//					�θ�Ŭ������ ����ȯ  >> ���� �θ� �̶���

		((SuperTest116)ob).write();  // �޼ҵ嵵 ���ۺθ� ����?
		// Sub write() �޼ҵ� : 100 : 20  >> �Ұ���. �������̵��� �ƿ� ���� ���� �ű� ����

		// �޼ҵ�� ������ �� �����Ͽ� ������ ��!!

	}
}