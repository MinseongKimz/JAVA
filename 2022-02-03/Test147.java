/*=================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
===================================*/

// Math Ŭ����

/*
��	java.lang.Math Ŭ������
	
	����(Mathematics)�� ���õ� ������ �Ӽ��� �Լ����� �����ϴ� Ŭ������
	�����ڰ� �ֱ� ������... ��private���� ����Ǿ� �ֱ� ������
	�ܺο��� ��ü(�ν��Ͻ�)�� ������ �� ����.
	��, ��� �޼ҵ尡 ��static������ ���ǵǾ� �ֱ� ������
	��ü�� �������� �ʰ� �ٷ� �����Ͽ� ����ϴ� ���� �����ϴ�.

��	java.lang.Math Ŭ������ �ֿ� ��� �� �޼ҵ�

	- public static final double E = 2.71...;
	  : �ڿ� �α� ���
	- public static final double PI = 3.141592...;
	  : ������ ��

	- public static double sin(double a)
	- public static double cos(double a)
	- public static double tan(double a)
	  : sin(a), cos(a), tan(a) ���� ��ȯ�� (�ﰢ�Լ�)

	- public static double asin(double a)
	- public static double acos(double a)
	- public static double atan(double a)
	  : asin(a), acos(a), atan(a) ���� ��ȯ�� (�ﰢ�Լ��� ���Լ�)

    - public static double toRadians(double angdeg)
	  : ����(angdeg)�� ����(radian)���� �ٲپ� ��ȯ�Ѵ�.
    - public static double toDegrees(double angrad)
	  :����(radian)�� ����(angdeg)�� �ٲپ� ��ȯ�Ѵ�.
	
	- public static double exp(double a)
	 : e�� a ���� ���Ͽ� ��ȯ�Ѵ�.

	- public static double log(double a)
	 : log ���� ���Ͽ� ��ȯ�Ѵ�.

	- public static double sqrt(double a)
	 : a�� �������� ���� ��ȯ�Ѵ�.

	- public static double ceil(double a)
	 : a ���� ũ�ų� ���� ������ ��ȯ�Ѵ�. (�ø�)

	- public static double floor(double a)
	 : a ���� �۰ų� ���� ������ ��ȯ�Ѵ�. (����)

	- public static double pow(double a, double b)
	 : a�� b���� ���Ͽ� ��ȯ�Ѵ�

	- public static int round(float a)
	- public static long round(double a)
	 : a �� �ݿø��Ͽ� ������� ��ȯ�Ѵ�.

	- public static double random()
	 : 0.0 ~ 1.0 ������ ����(������ �Ǽ�) �� �߻����� ��ȯ�Ѵ�.

*/
public class Test147
{
	public static void main(String[] args)
	{
		System.out.println("������ : "+ Math.PI);
		//--==>> ������ : 3.141592653589793
		System.out.println("2�� ������ : " + Math.sqrt(2));
		//--==>> 2�� ������ : 1.4142135623730951

		System.out.println("���̿� ���� Degree : " + Math.toDegrees(Math.PI));
		System.out.println("2���̿� ���� Degree : " + Math.toDegrees(2.0*Math.PI));
		//���̿� ���� Degree : 180.0
		//2���̿� ���� Degree : 360.0
		
		//������ Radian���� ��ȯ
		double radian45 = Math.toRadians(45);
		System.out.println("���� 45 : " + Math.sin(radian45));
		System.out.println("�ڽ��� 45 : " + Math.cos(radian45));
		System.out.println("ź��Ʈ 45 : " + Math.tan(radian45));
		// ���� 45 : 0.7071067811865475
		// �ڽ��� 45 : 0.7071067811865476
		// ź��Ʈ 45 : 0.9999999999999999

		System.out.println("�α� 25 : " + Math.log(25));
		// �α� 25 : 3.2188758248682006

		System.out.println("2�� 4�� : " + Math.pow(2,4));
		// 2�� 4�� : 16.0

		System.out.println("0.0~1.0 ������ ���� : " + Math.random());
		// 0.0~1.0 ������ ���� : 0.05880778616919813
		// 0.0~1.0 ������ ���� : 0.9170548598988414
		// 0.0~1.0 ������ ���� : 0.45082778504022614
		// 0.0~1.0 ������ ���� : 0.20254360285343753
		// 0.0~1.0 ������ ���� : 0.06089708186007314
	}
}