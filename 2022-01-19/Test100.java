/*================================
  ���� Ŭ������ �ν��Ͻ� ����
==================================*/

// ���� ���а� ���� ���� ������

import java.util.Scanner;

class CircleTest2
{	
	
	//��� ����, �ν��Ͻ� ����(�ν��Ͻ� �����ÿ� �޸𸮿� �ö󰡴ϱ�..), ���� ���� (CircleTest2 �ȿ��� �پ��� ������..)
	//int num;

	//���� ����(Information Hidding)
	//��private���̶�� ���������������� ������
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�.
	private int num;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է� :");
		num = sc.nextInt();
	}
	/*
	// getter/ setter ����
	int getNum()
	{
		return num;
	}

	void setNum(int num)
	{
		this.num = num;
	}
	// ���� public ���� ���� �ٳ� �³� �Ƚᵵ �Ǵµ� �� ����?
	// �ٳ� �³ѿ� ������ �ɴ��� �ؼ� num�� ������ �� �ѹ��� ���� �� �� �־..
	*/
	double calArea()
	{
		return num * num * 3.141592;
	}
	void write(double area)
	{
		System.out.println("������ : "+num);
		System.out.println("���� : " +area);
	}
}

public class Test100
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num =10;
		//System.out.println("���� ������: " + ob1.num); //�� private�� ���� ���� �Ұ�..
		/*
		ob1.setNum(10);
		System.out.println("���� ������: " + ob1.getNum());
		*/
		ob1.input();
		// 500�� �Է��ϸ�
		//�� ob.num = 500;
		double result = ob1.calArea();


		ob1.write(result);
	}
}