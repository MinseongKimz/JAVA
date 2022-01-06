/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/

// 변수와 자료형 실습 및 테스트 : double
// 나눗셈 연산 실습
public class Test011
{
	public static void main(String[] args)
	{	


		// 정수와 정수의 나눗셈
		double a= 1 / 2; // 정수끼리 나누면 몫만 취함.
		System.out.println( "double a :  " + a);
		// 출력결과 ---> double a : 0.0

		double b = 1/2 + 1/2; //1이 나올까?   예상 no a에서 0이 나온이유와 나눗셈 먼저.. 0+0으로 예상
		//     b =  0  + 1/2;
		//     b =  0  +  0 ;
		//     b =  0.0; 

		System.out.println("double b : " + b);
		// 출력결과 ---> double b : 0.0

		double c = 1 / 2.0;  // 예상 .. 실수가 포함되면 실수 연산이 됨. 0.5 예상
		
		System.out.println("double c : " + c);
		// 출력결과---> double c : 0.5
		// 나눗셈 연산과 관련하여
		// 피 연산자 중 실수가 포함되어 있다면
		// 연산은 실수 기반의 연산이 수행되며
		// 결과 값 또한 실수 형태로 반환된다.
		
		double d = 3/2 + 1/2;
		// double d = 1 + 1/2;
		// double d = 1 + 0;
		// double d = 1;
		System.out.println("double d : " + d);
		//---> double d : 1.0

		double e = 3/2 + 1/2.0;
		// double e = 1 + 1/2.0;
		// double e = 1 + 0.5
		// double e = 1.5

		System.out.println("double e : " + e);
		//---> double e : 1.5


	}
}

/* 출력결과
double a :  0.0
double b : 0.0
double c : 0.5
double d : 1.0
double e : 1.5
계속하려면 아무 키나 누르십시오 . . .

*/