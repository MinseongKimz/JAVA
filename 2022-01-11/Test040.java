/*==========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
============================================*/

// 사용자로부터 임의의 정수 5개를 입력받아 
// 짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
// 단, Scanner를 활용하여 데이터를 입력받을 수 있도록 한다.

// 실행 예)
// 임의의 정수 5개 입력 : 1 2 3 4 5

// >> 짝수의 합은 6 이고, 홀수의 합은 9입니다.
//계속하려면 아무거나...

import java.util.Scanner;

public class Test040
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		int even=0, odd=0; // 복합연산자 누적합 기준점 0
						   // 누적 곱으로 하려면 1로 대부분 잡는다

		System.out.print("임의의 정수 5개 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();


		if (a%2 ==0) // a가 짝수라면
		{
			even += a; // 짝수를 a 만큼 증가시켜라
		}	
		else 
		{
			odd += a; // 아니면 홀수를 a 만큼 증가시켜라
		}

		if (b%2 ==0) // b 가 짝수라면
		{
			even += b; // 짝수를 b 만큼 증가시켜라
		}	
		else 
		{
			odd += b;// 아니면 홀수를 b 만큼 증가시켜라
		}

		if (c%2 ==0)
		{
			even += c;
		}	
		else 
		{
			odd += c;
		}

		if (d%2 ==0)
		{
			even += d;
		}	
		else 
		{
			odd += d;
		}

		if (e%2 ==0)
		{
			even += e;
		}	
		else 
		{
			odd += e;
		}

		System.out.printf("\n>> 짝수의 합은 %d 이고, 홀수의 합은 %d입니다.\n",even,odd);
	}
}
/* 실행 결과 
임의의 정수 5개 입력 : 1 2 3 3 4

>> 짝수의 합은 6 이고, 홀수의 합은 7입니다.
계속하려면 아무 키나 누르십시오 . . .
*/