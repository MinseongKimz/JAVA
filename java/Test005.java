/*
*작성한날 : 2022.01.05
*작 성 자 : 김민성
*파일이름 : Test005.java
*작성목적 : 수업. 변수와 자료형
*/

// 변수와 자료형

public class Test005
{
	public static void main(String[] args)
	{
		//변수 선언 -> 메모리 공간 확보 / 할당
		int a;

		// 연산 및 처리 -> 확보한 메모리 공간에 데이터 담아내기
		a = 10;

		// 결과 출력
		System.out.println("a는 " + a + "입니다.");
		//-----> a는 10입니다.

		byte b = 20;
		System.out.println(b);				// 변수 b에 담겨있는 값을 출력
		//----->20

		System.out.println("b");			// 문자열 b 출력

		short c;							// error 컴파일 에러
		//c = a;							// c는 2byte short형 a는 4byte int형 
		c = (short)a;						// 명시적 형변환 (강제 형변환)
		System.out.println(c);
		//-----> 10


	}
}
