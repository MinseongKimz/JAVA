/*============================
  ���� Ŭ���� ���� ����
==============================*/


// �������̽�(Interface)

// �������̽�
interface Demo
{
	public void write();
	public void print();
}

// �������̽��� �����ϴ� �߻� Ŭ����
// print�����ָ� �߻� ����
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}

	// public void print();
}



// �߻�Ŭ����(DemoImpl)�� ��� �޴� �߻� Ŭ����
// ���⼭ ����Ʈ �޼ҵ带 �ϼ����Ѽ�
// �߻�Ŭ������ �����.
class DemoImplSub extends DemoImpl
{
	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������...");
	}
}




// main() �޼ҵ带 �����ϰ� �ִ� �ܺο� �ٸ� Ŭ����
public class Test121
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo(); 
		//-- �ν��Ͻ� ���� �Ұ� �� �������̽�
		
		//DemoImpl ob2 = new DemoImpl();
		//-- �ν��Ͻ� ���� �Ұ� �� �߻� Ŭ����

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
	}
}

/*
write() �޼ҵ� ������...
print() �޼ҵ� ������...
*/