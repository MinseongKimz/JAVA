/*
*�ۼ��ѳ� : 2022.01.05
*�� �� �� : ��μ�
*�����̸� : Test006.java
*�ۼ����� : ����. ������ �ڷ���,Ű����� �ĺ���
*/
// ������ �ڷ���
// Ű����� �ĺ���

public class Test006
{
	public static void main(String[] args)
	{
		double height = 172.8;
		int age = 27;
		char degree = 'A';

		System.out.println(height);
		System.out.println(age);
		System.out.println(degree);
		//--->172.8
		//	  27
		//    A

		String name = "��μ�";
		//String name = "��X" ; 
		//--- ������ ���� �ȿ��� �������� �ĺ���. name �� �ߺ��̱⶧���� X_
		//String #name = "��xx";
		//-- ������ ������ Ư�����ڷ� x ������: $,_ ������
		//   �Ժη� ���x, ���̳� �׷쳻�� ��Ģ�� ������ �����°��� �߿�.


		// int tel = 01012341234; ����? > �Ұ���
		// �ڹٿ��� ���ڸ� �ٷ� �� 0���� �����ϸ� ������ �ٲ�.
		// ���ڿ��� ��Ʈ�� ����.
		String tel = "01012341234";
		String �ּ� = "��õ ��籸";	// ����? �����ϱ� �ѵ�.. JAVA�� ���������� ����Ѱű� �ѵ�
										// �ǹ����� ���鿡�� �����Ѵٸ� ����� �ѱ۷� �������� ������ �ȵȴ�!



		System.out.println(name);
		//----> ��μ�
		System.out.println(tel);
		//----> 01012341234
		System.out.println(�ּ�);
		//----> ��õ ��籸



	}
}