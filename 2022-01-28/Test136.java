/*=================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
===================================*/

// Wrapper 클래스

public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		
		System.out.println(b2);
		System.out.println(i2);

		print(b2);
		print(i2);
	
		// Byte 클래스의 byteValue() 메소드 호출
		byte b3 = b2.byteValue(); //언박싱

		// Integer 클래스의 intValue 메소드 호출
		int i3 = i2.intValue();

		//check~
		int i4 = b2.byteValue(); // byte 타입을 int로 형변환 (자동)
		//byte b4 = i2.intValue(); // int 타입을 byte로 형변환 (자동형변환 위배)
		byte b4 = i2.byteValue();  // Integer클래스으 byteValue 메소드..

		System.out.println(b3);  //3
		System.out.println(i3);	 //256

		//check~!
		System.out.println(b4);  //0 ?? 256 > 128 byte 범위 넘어버림
		System.out.println(i4);  //3

	}
	/*
	static void print(Byte b)
	{
	}
	static void print(Integer i)
	{
	}*/

	// java.lang.Number 클래스(추상 클래스)는
	// 모든 숫자형 Wrapper 클래스들의 부모 클래스
	// (슈퍼 클래스, 상위클래스) 이다.
	// b2, i2 자료형이 Number에 넘어오면서
	// 업캐스팅이 일어난다
	// Auto-Boxing 이 일어나게 된다
	static void print(Number a)
	{
		System.out.println(a);
	}
}