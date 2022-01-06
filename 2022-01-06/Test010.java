/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/

// 변수와 자료형 실습 및 테스트 : char
// 

public class Test010
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		char ch1, ch2, ch3;
		int a;


		//연산 및 처리 (대입연산)
		ch1 = 'A';
		a = (int)ch1; // 가능? 가능 
		System.out.println("ch1 : " + ch1);
		// 결과 출력  
		// ----> ch1 : A

		ch2 = '\n'; // 개행을 출력해버림
		System.out.println("ch2 : " + ch2);
		System.out.println("a : " + a);
	}
}
/*실행 결과
ch1 : A
ch2 :

a : 65
*/