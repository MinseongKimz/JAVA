/*=================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===================================*/

//StringBuffer Ŭ����

/*
��	StringBufferŬ������
	���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
	String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
	StringBuffer Ŭ������ ���ڿ��� ����� ��
	���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�.

	��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
	��ü�� �����ϴ� �������� �̸� ũ�⳪ ���� �����ϰų�
	���� ������ ������ ũ�⸦ �ٲ� �� �մ� ����� �����Ѵ�.

	����, JDK 1.5 ���ĺ��ʹ�
	���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
	StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
	���� ū �������� multi-thread unsafe ������̴�.
	��, Syncronization�� ���� ������
	StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
	StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�.

*/

public class Test140
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2); //false
		System.out.println(sb1.equals(sb2));//false ��ü�� ��ü���� ��

		System.out.println(sb1);
		// --==>> korea

		System.out.println(sb1.toString());
		//--==>> korea

		System.out.println(sb1.toString().equals(sb2.toString())); // true  
		// ���ڿ��� ���ڿ� ���� ���̱� ������ Ʈ�� 

		System.out.println();

		StringBuffer sb3  = new StringBuffer();
		//-- StringBuffer �⺻ ������ ȣ��(�ν��Ͻ� ���� ����)
		//	 �⺻������ �����Ǵ� ������ ũ��� ��16��

		System.out.println("����ũ�� : "+ sb3.capacity());
		//����ũ�� : 16
		
		/////////////////////////////////////////////////////////
		System.out.println(sb3);
		//�ƹ��͵� �ȳ���
	
		/*
		String name = "ȫ�浿";
		name += "�̼���";
		name += "������";
		System.out.println(name);
		//ȫ�浿�̼��Ű�����*/

		sb3.append("seoul");  //sb3 += "seoul"
		sb3.append("korea");
		sb3.append("�츮����");
		sb3.append("���ѹα�");
		System.out.println(sb3);
		//seoulkorea�츮������ѹα�
		System.out.println(sb3.toString());
		//seoulkorea�츮������ѹα�
		
		System.out.println("����ũ�� : "+ sb3.capacity());
		//����ũ�� : 34

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase()); // �ҹ��ڸ� �빮�ڷ� �ٲ�
		//JAVA AND ORACLE
		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase()); // �빮�ڸ� �ҹ��ڷ�
		//java and oracle

		//System.out.println(sb3.toUpperCase());
		//StringBuffer ���� toUpperCase�� ����..
		String temp3 = sb3.toString(); // ���ڿ��� �ٲ��ְ�
		System.out.println(temp3.toUpperCase()); // ��������..
		//SEOULKOREA�츮������ѹα�
		
		//��	��� ���ڿ�(sb3) �� seoul �տ� 
		//		"�ѱ�" �̶�� ���ڿ� �߰�
		//		�ǵ� : �ѱ�seoulkorea�츮������ѹα�

		sb3.insert(0, "�ѱ�"); //0��° �ε��� �տ� ���ڿ��� �߰��ϰڴ�.
		System.out.println(sb3);
		//�ѱ�seoulkorea�츮������ѹα�
		
		//��	��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		//		"���" �̶�� �߰�
		//		��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ �ʰ�.

		 //sb3.insert(sb3.indexOf("korea")+5, "���");
		 //sb3.insert(sb3.indexOf("��"), "���");
		 sb3.insert(sb3.indexOf("korea")+"korea".length(), "���");
		 System.out.println(sb3);
		 //--==>> �ѱ�seoulkorea����츮������ѹα�

		 // ��	��� ���ڿ�(sb3) ���� 
		 //		���츮���� ���ڿ� ����
		//sb3.delete(14,18);

		//sb3.delete(sb3.indexOf("��"),sb3.indexOf("��")+1);
		 sb3.delete(sb3.indexOf("�츮����"),sb3.indexOf("��")+1);	
		 System.out.println(sb3);
		 //�ѱ�seoulkorea������ѹα�
		
		// korea���� �� ����
		//sb3.delete(7,18);
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//�ѱ�seoul
		
		// ���� ũ�� ��.
		System.out.println("����ũ�� : "+ sb3.capacity());
		//����ũ�� : 34..? ���� ũ�� �״��..

		// ���� ũ�� ����
		// �� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���..
		sb3.trimToSize();
		System.out.println("����ũ�� : "+ sb3.capacity());
		//����ũ�� : 7

	}
}