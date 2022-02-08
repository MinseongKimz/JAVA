/*=================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===================================*/

// String Ŭ����
/*
��	String Ŭ������ ���� ���ڿ� �����Ϳ� ���� ������ �Ұ��� �ϴ�.
	(��, ���� �Һ� : Immutable)	
	���ڿ��� ������ ����Ǹ� ���ο� ��ü�� �����ϸ�
	���� ����� �Ҿ���� ��ü�� ������ �÷����� ����� �ǰ�,
	���ο� ��ü�� �� �ּҸ� �Ҵ��ϰ� �ǹǷ�
	�ؽ��ڵ嵵 ���ϰ� �ȴ�.

��	String Ŭ���� ���� ��+�������ڸ� ����ϰ� �Ǹ�
	���ڿ� ���� ������ �����ϸ�,
	String Ŭ������ �ٸ� Ŭ���� ��ü, �Ǵ� �⺻�� ������ ����
	��+�� �����ڸ� ����ϴ� ��쿡��
	���������� �ڵ� String Ŭ������ ��ȯ�� �����ϴ�.

	��	������ Ȯ�εǴ� ����� �̷�����..
		String�� ������ ������ �� ���� ������
		��+�������ڸ� ����ϰ� �Ǹ�
		���������� StringBuffer �� �����Ͽ�
		append() �޼ҵ带 �̿��Ͽ�
		���ڿ��� ���� ������ �����ϰ� �ȴ�.
		���� ������ ���ڿ��� ���� ����ϴ� Servlet �����
		�ǵ����̸� String �� ����ϴ� �� ����
		StringBuffer �� char[] �� ����ϴ� ���� ȿ������ �� �ִ�.

		==>	������ ���ڿ��� ó���ϴ� ��쿡�� �ַ� String Ŭ������ ���
			������ ���ڿ��� ó���ϴ� ��쿡��
			�� Ÿ�� �� �������� ó�����ִ� StringBuffer Ŭ������ ����ϴ� ����
			ȿ�� ���̴�.
*/
/*
��	String ��ü�� ���� �� Ư¡
	
	String ��ü�� �����ϴ� �����
	�� ���ڿ� ����� �����ϴ� �����
	�� String Ŭ������ �����ڸ� �̿��ϴ� ���
	�̷��� �� ���� ����� �ִ�.
	
	String str1 = "java";
	String str2 = new String("Java");

	������ �����ڿ� ������� ���� �����ڸ� ����Ͽ�
	�����ϴ� ����� ���� ��ü�� �����ϴ� ����
	��new�������ڸ� �̿��Ͽ� ��ü�� �����ϴ� ���� // ���ο� �޸� ���� 
	�ǹ̰� �ٸ���.

*/
public class Test138
{
	public static void main(String[] args)
	{
		String s1 = "seoul";
		String s2 = "seoul";
		String s3 = new String("seoul");
		String s4 = new String("seoul");

		System.out.println(s1 == s2); //true
		System.out.println(s1 == s3); //false
		System.out.println(s1 == s4); //false

		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));//true
		System.out.println(s3.equals(s4));//true
		System.out.println(s4.equals(s1));//true
		//String Ŭ�������� equals �� �������̵��ؼ�
		// �ּ� �񱳰��ƴ� ���� ���ϰ� ���.

		//��	s1�� s2 ��ü�� �����ϴ� ���ڿ� ����� ������ ��쿡
		//		���ڿ��� ����� �������� ������ �����ϱ� ������
		//		s1 ��ü�� s2 ��ü�� ������ ��� ��Ҹ� �����ϰ� �ȴ�.
		//		������,
		//		s3�� s4�� ������ ������ �ƴ� �ٸ� ��� ������
		//		���Ӱ�(new) Ȯ���Ͽ� ���ڿ� ����� �� ������ ������ ����̹Ƿ�
		//		�� �ν��Ͻ��� ���� ������ �����ϴ� ���� �ƴϴ�.
		//		���� ��s3 == s4�� �� ������ �Ǹ�
		//		���� ���� ���ڿ� ��������� ���θ� ���� �����
		//		��equals()���޼ҵ带 �̿����ؾ� �Ѵ�.
		// ��	String Ŭ������ Object�� equals() �� �������̵� �ߴ�.

		System.out.println("s1 : " + s1); //seoul
		System.out.println("s2 : " + s2); //seoul
		System.out.println("s3 : " + s3); //seoul
		System.out.println("s4 : " + s4); //seoul


		System.out.println("s1 : " + s1.hashCode()); //109324212
		System.out.println("s2 : " + s2.hashCode()); //109324212
		System.out.println("s3 : " + s3.hashCode()); //109324212
		System.out.println("s4 : " + s4.hashCode()); //109324212

		// �� ��ü�� ������ hashCode �� ������
		//	hashCode�� ���ٰ� ���� ��ü�� �ƴϴ�..

		s2 += " Korea";
		System.out.println(s2);
		//--==>>seoul Korea

		s2 = "korea";
		System.out.println(s2);
		//--==>> korea

		//--	�̿� ���� ���
		//		s2�� ������ "seoul" �� ����� ������
		//		��s2 += " Korea";���� ����Ǵ� ��������
		//		������ �÷����� ����� �Ǹ�
		//		"seoul Korea" ����� ����� ������
		//		s2�� ���� �ϰ� �Ǿ��ٰ�
		//		�ٽ� s2�� ������ "seoul korea" �� ����� ������
		//		��s2= "korea";�� �� ����Ǵ� ��������
		//		������ �÷����� ����� �Ǹ�
		//		"korea" ���ڿ� ����� ���Ӱ� ����� ������
		//		s2�� �����ϰ� �ȴ�.
		//		==>> �� String ��ü�� ������ �Һ��̴�~!!!



	}
}