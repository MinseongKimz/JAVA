/*================================
  ■■■ 클래스와 인스턴스 ■■■
==================================*/

// 정보 은닉과 접근 제어 지시자

import java.util.Scanner;

class CircleTest2
{	
	
	//멤버 변수, 인스턴스 변수(인스턴스 생성시에 메모리에 올라가니깐..), 전역 변수 (CircleTest2 안에서 다쓸쑤 있으니..)
	//int num;

	//정보 은닉(Information Hidding)
	//『private』이라는 접근제어지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미.
	private int num;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 입력 :");
		num = sc.nextInt();
	}
	/*
	// getter/ setter 구성
	int getNum()
	{
		return num;
	}

	void setNum(int num)
	{
		this.num = num;
	}
	// 굳이 public 으로 쓰면 겟넘 셋넘 안써도 되는데 왜 쓸까?
	// 겟넘 셋넘에 조건을 걸던가 해서 num을 접근할 때 한번더 검증 할 수 있어서..
	*/
	double calArea()
	{
		return num * num * 3.141592;
	}
	void write(double area)
	{
		System.out.println("반지름 : "+num);
		System.out.println("넓이 : " +area);
	}
}

public class Test100
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num =10;
		//System.out.println("원의 반지름: " + ob1.num); //→ private로 인해 접근 불가..
		/*
		ob1.setNum(10);
		System.out.println("원의 반지름: " + ob1.getNum());
		*/
		ob1.input();
		// 500을 입력하면
		//→ ob.num = 500;
		double result = ob1.calArea();


		ob1.write(result);
	}
}