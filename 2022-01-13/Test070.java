/*==========================================
  ■■■ 지역변수와 전역변수 ■■■
============================================*/

// 지역변수의 초기화 테스트 
//클래스 영역에 선언된 변수 : 전역변수(글로벌 변수)
//메소드 영역에 선언된 변수 : 지역변수(로컬 변수)

// Test071.java 랑 비교하기

public class Test070
{
	// 클래스의 영역

	public static void main(String[] args)
	{
		
		//메소드의 영역
		
		int n;
		
		System.out.println(" n= " + n);
		// 이는 오류  
		// 지역변수는 초기화 과정을 거치지 않으면 사용할 수 없다.
		// (→ 자바가 자동으로 초기화를 수행해 주거나 하지 않음)..
		//error: variable n might not have been initialized (컴파일 에러)



	}
	// 클래스의 영역
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