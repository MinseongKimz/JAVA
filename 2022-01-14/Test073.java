/*==========================================
  ����Ŭ������ �ν��Ͻ� ����
============================================*/

// �� CircleTest.java �� ��Ʈ��

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java

// ���� ���� = ������ * ������ *3.141592
// ���� �ѷ� = ������ * 2 *3.141592

// ���� ��)
// ������ �Է� : xx

// >> �������� xx �� ����
// >> ���� : xxxxx.xx
// >> �ѷ� : xxxxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;

public class Test073
{
	public static void main(String[] args)  throws IOException  // 
	{	
		// CircleTest �ν��Ͻ� ����
		CircleTest cr = new CircleTest();//           ��

		//�Է� �޼ҵ� ȣ��			//                ��
		cr.input();                // input �޼ҵ忡�� �� throws IOException ó���� 
		// ���� ���� �޼ҵ� ȣ��   // ���⼱ ���� �޼ҵ忡 ������ ������ �� ���ο��� ���� �ʿ䰡 �ִ�.
		double area = cr.calArea();
		// �ѷ� ���� �޼ҵ� ȣ��
		double length = cr.calLength();
		// ��� �޼ҵ� ȣ��
		cr.print(area, length); //������ Ÿ�԰� ���� �߿�!
	}
}