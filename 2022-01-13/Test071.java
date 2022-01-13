/*==========================================
  ■■■ 지역변수와 전역변수 ■■■
============================================*/

// 전역변수의 초기화 테스트 
//클래스 영역에 선언된 변수 : 전역변수(글로벌 변수)
//메소드 영역에 선언된 변수 : 지역변수(로컬 변수)

// Test070.java 랑 비교하기

public class Test071
{
		//클래스 영역
		int a; // 전역변수 선언
		// 자바가 알아서 자동으로 0으로 초기화 지원

		boolean b;
		// 자바가 알아서 자동으로 false 로 초기화 지원

		char c; 
		// 자바가 알아서 자동으로 공백으로 초기화 지원

		double d;


	public static void main(String[] args)
	{
		//메소드 영역
		//System.out.println(" a = " + a);
		//error: non-static variable a cannot be referenced from a static context
        //        System.out.println(" a = " + a); (컴파일 에러)



		Test071 ob = new Test071(); // 클래스를 기반으로 인스턴스 생성
		System.out.println(" ob.a = " + ob.a); // ob.a = 0
		// ob는 메모리에서 Test071 클래스로 가게해주는 주소를 알려줌
		
		System.out.println(" ob.b = " + ob.b); // ob.b = false

		System.out.println(" ob.c = " + ob.c); // ob.c = 

		System.out.println(" ob.d = " + ob.d); // ob.d = 0.0
		
	}
	/*
	다른 메소드 1()
	{
		//메소드의 영역
	}
	
	다른 메소드 2()
	{
		//메소드의 영역
	}
	*/
}
/*
 ob.a = 0
 ob.b = false
 ob.c =
 ob.d = 0.0
계속하려면 아무 키나 누르십시오 . . .
*/