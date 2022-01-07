/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/

// 산술 연산자
// BufferedReader
// printf()

// 사용자로부터 임의의 정수를 두 번 입력받아
// 사칙연산 및 나머지 연산을 수행하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단 입력받는 과정은 BufferedReader를 활용하고
// 출력하는 과정은 printf() 메서드를 활용할 수 있도록 한다
// 또한 나눗셈 연산은 편의상 정수 기반으로 처리한다.

//실행예)
// 첫 번째 정수 입력 :
// 두 번째 정수 입력 :

//=====[결과]=====
// ? + ? = ?
// ? - ? = ?
// ? * ? = ?
// ? / ? = ?
// ? % ? = ?
//================

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test023
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int a, b;
		int sum, min, mul, div, rem;


		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());


		sum = a + b;
		min = a - b;
		mul = a * b;
		div = a / b;
		rem = a % b;

		System.out.println("\n=====[결과]=====");
		System.out.printf("%d  + %d  = %d\n",a, b, sum );
		System.out.printf("%d  - %d  = %d\n",a, b, min );
		System.out.printf("%d  * %d  = %d\n",a, b, div );
		System.out.printf("%d  / %d  = %d\n",a, b, mul );
		System.out.printf("%d  %% %d  = %d\n",a, b, rem );
		System.out.println("================");
	}
}
/* 실행 결과
첫 번째 정수 입력 : 100
두 번째 정수 입력 : 2

=====[결과]=====
100  + 2  = 102
100  - 2  = 98
100  * 2  = 50
100  / 2  = 200
100  % 2  = 0
================
계속하려면 아무 키나 누르십시오 . . .
*/

